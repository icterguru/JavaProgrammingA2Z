import java.net.*;
import java.io.*;
import java.text.*;
import java.util.*;

class httpd implements Runnable, LogMessage {
  private int port;
  private String docRoot;
  private LogMessage log;
  private Hashtable cache = new Hashtable();
  private boolean stopFlag;

  private static String version = "1.0";
  private static String mime_text_html = "text/html";
  private static String CRLF = "\r\n";
  private static String indexfile = "index.html";
  private static int buffer_size = 8192;
  static String mt[] = {  // mapping from file ext to Mime-Type
    "txt", "text/plain",
    "html", mime_text_html,
    "htm", "text/html",
    "gif", "image/gif",
    "jpg", "image/jpg",
    "jpeg", "image/jpg",
    "class", "application/octet-stream"
  };
  static String defaultExt = "txt";
  static Hashtable types = new Hashtable();
  static {
    for (int i=0; i<mt.length;i+=2)
      types.put(mt[i], mt[i+1]);
  }

  static String fnameToMimeType(String filename) {
    if (filename.endsWith("/"))      // special for index files.
      return mime_text_html;
    int dot = filename.lastIndexOf('.');
    String ext = (dot > 0) ? filename.substring(dot + 1) : defaultExt;
    String ret = (String) types.get(ext);
    return ret != null ? ret : (String)types.get(defaultExt);
  }

  int hits_served = 0;
  int bytes_served = 0;
  int files_in_cache = 0;
  int bytes_in_cache = 0;
  int hits_to_cache = 0;
  
  private final byte toBytes(String s)[] {
    byte b[] = s.getBytes();
    return b;
  }

  private MimeHeader makeMimeHeader(String type, int length) {
    MimeHeader mh = new MimeHeader();
    Date curDate = new Date();
    TimeZone gmtTz = TimeZone.getTimeZone("GMT");
    SimpleDateFormat sdf =
      new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
    sdf.setTimeZone(gmtTz);
    mh.put("Date", sdf.format(curDate));
    mh.put("Server", "JavaCompleteReference/" + version);
    mh.put("Content-Type", type);
    if (length >= 0)
      mh.put("Content-Length", String.valueOf(length));
    return mh;
  }

  private String error(int code, String msg, String url) {
    String html_page = "<body>" + CRLF +
                 "<h1>" + code + " " + msg + "</h1>" + CRLF;
    if (url != null) 
      html_page += "Error when fetching URL: " + url + CRLF;
    html_page += "</body>" + CRLF;
    MimeHeader mh = makeMimeHeader(mime_text_html, html_page.length());
    HttpResponse hr = new HttpResponse(code, msg, mh);

    logEntry("GET", url, code, 0);
    return hr + html_page;
  }

  // Read 'in' until you get two \n's in a row.
  // Return up to that point as a String.
  // Discard all \r's.
  private String getRawRequest(InputStream in)
    throws IOException {
    byte buf[] = new byte[buffer_size];
    int pos=0;
    int c;
    while ((c = in.read()) != -1) {
      switch (c) {
        case '\r':
        break;
        case '\n': 
          if (buf[pos-1] == c) {
            return new String(buf,0,pos);
          }
        default:
          buf[pos++] = (byte) c;
      }
    }
    return null;
  }

  static String months[] = {
    "Jan", "Feb", "Mar", "Apr", "May", "Jun",
    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
  };
  private String host;
  // fmt02d is the same as C's printf("%02d", i)
  private final String fmt02d(int i) {
    if(i < 0) {
      i = -i;
      return ((i < 9) ? "-0" : "-") + i;
    }
    else {
      return ((i < 9) ? "0" : "") + i;
    }
  }
  private void logEntry(String cmd, String url, int code, int size) {
    Calendar calendar = Calendar.getInstance();
    int tzmin = calendar.get(Calendar.ZONE_OFFSET)/(60*1000);  
    int tzhour = tzmin / 60;
    tzmin -= tzhour * 60;
    log.log(host + " - - [" +
      fmt02d(calendar.get(Calendar.DATE) ) + "/" +
      months[calendar.get(Calendar.MONTH)] + "/" +
      calendar.get(Calendar.YEAR) + ":" + 
      fmt02d(calendar.get(Calendar.HOUR) ) + ":" + 
      fmt02d(calendar.get(Calendar.MINUTE) ) + ":" + 
      fmt02d(calendar.get(Calendar.SECOND)) + " " + 
      fmt02d(tzhour) + fmt02d(tzmin) +
      "] \"" +
      cmd + " " +
      url + " HTTP/1.0\" " +
      code + " " +
      size + "\n");
    hits_served++;
    bytes_served += size;
  }

  private void writeString(OutputStream out, String s)
    throws IOException {
    out.write(toBytes(s));
  }

  private void writeUCE(OutputStream out, UrlCacheEntry uce)
    throws IOException {
      HttpResponse hr = new HttpResponse(200, "OK", uce.mh);
      writeString(out, hr.toString());
      out.write(uce.data, 0, uce.length);
      logEntry("GET", uce.url, 200, uce.length);
  }

  private boolean serveFromCache(OutputStream out, String url)
    throws IOException {
    UrlCacheEntry uce;
    if ((uce = (UrlCacheEntry)cache.get(url)) != null) {
      writeUCE(out, uce);
      hits_to_cache++;
      return true;
    }
    return false;
  }

  private UrlCacheEntry loadFile(InputStream in, String url,
                                 MimeHeader mh)
    throws IOException {

    UrlCacheEntry uce;
    byte file_buf[] = new byte[buffer_size];
    uce = new UrlCacheEntry(url, mh);
    int size = 0;
    int n;
    while ((n = in.read(file_buf)) >= 0) {
      uce.append(file_buf, n);
      size += n;
    }
    in.close();
    cache.put(url, uce);
    files_in_cache++;
    bytes_in_cache += uce.length;
    return uce;
  }

  private UrlCacheEntry readFile(File f, String url)
    throws IOException {

    if (!f.exists())
      return null;
    InputStream in = new FileInputStream(f);
    int file_length = in.available();
    String mime_type = fnameToMimeType(url);
    MimeHeader mh = makeMimeHeader(mime_type, file_length);
    UrlCacheEntry uce = loadFile(in, url, mh);
    return uce;
  }

  private void writeDiskCache(UrlCacheEntry uce)
    throws IOException {

    String path = docRoot + uce.url;
    String dir = path.substring(0, path.lastIndexOf("/"));
    dir.replace('/', File.separatorChar);
    new File(dir).mkdirs();
    FileOutputStream out = new FileOutputStream(path);
    out.write(uce.data, 0, uce.length);
    out.close();
  }

  // A client asks us for a url that looks like this:
  // http://the.internet.site/the/url
  // we go get it from the site and return it...
  private void handleProxy(OutputStream out, String url,
                           MimeHeader inmh) {
    try {
      int start = url.indexOf("://") + 3;
      int path = url.indexOf('/', start);
      String site = url.substring(start, path).toLowerCase();
      int port = 80;
      String server_url = url.substring(path);
      int colon = site.indexOf(':');
      if (colon > 0) {
        port = Integer.parseInt(site.substring(colon + 1));
        site = site.substring(0, colon);
      }
      url = "/cache/" + site + ((port != 80) ? (":" + port) : "") +
            server_url;
      if (url.endsWith("/"))
        url += indexfile;

      if (!serveFromCache(out, url)) {
        if (readFile(new File(docRoot + url), url) != null) {
          serveFromCache(out, url);
          return;
        }

        // If we haven't already cached this page, open a socket
        // to the site's port and send a GET command to it.
        // We modify the user-agent to add ourselves... "via".

        Socket server = new Socket(site, port);
        InputStream server_in = server.getInputStream();
        OutputStream server_out = server.getOutputStream();
        inmh.put("User-Agent", inmh.get("User-Agent") +
                 " via JavaCompleteReferenceProxy/" + version);
        String req = "GET " + server_url + " HTTP/1.0" + CRLF +
                     inmh + CRLF;
        writeString(server_out, req);
        String raw_request = getRawRequest(server_in);
        HttpResponse server_response =
                       new HttpResponse(raw_request);
        writeString(out, server_response.toString());
        if (server_response.statusCode == 200) {
          UrlCacheEntry uce = loadFile(server_in, url,
                                       server_response.mh);
          out.write(uce.data, 0, uce.length);
          writeDiskCache(uce);
          logEntry("GET", site + server_url, 200, uce.length);
        }
        server_out.close();
        server.close();
      }
    } catch (IOException e) {
      log.log("Exception: " + e);
    }
  }

  private void handleGet(OutputStream out, String url,
                         MimeHeader inmh) {
    byte file_buf[] = new byte[buffer_size];
    String filename = docRoot + url +
                      (url.endsWith("/") ? indexfile : "");
    try {
      if (!serveFromCache(out, url)) {
        File f = new File(filename);
        if (! f.exists()) {
          writeString(out, error(404, "Not Found", filename));
          return;
        }
        if (! f.canRead()) {
          writeString(out, error(404, "Permission Denied", filename));
          return;
        }
        UrlCacheEntry uce = readFile(f, url);
        writeUCE(out, uce);
      }
    } catch (IOException e) {
      log.log("Exception: " + e);
    }
  }

  private void doRequest(Socket s) throws IOException {
    if(stopFlag)
      return;
    InputStream in = s.getInputStream();
    OutputStream out = s.getOutputStream();

    String request = getRawRequest(in);
    int fsp = request.indexOf(' ');
    int nsp = request.indexOf(' ', fsp+1);
    int eol = request.indexOf('\n');
    String method = request.substring(0, fsp);
    String url = request.substring(fsp+1, nsp);
    String raw_mime_header = request.substring(eol + 1);

    MimeHeader inmh = new MimeHeader(raw_mime_header);

    request = request.substring(0, eol);

    if (method.equalsIgnoreCase("get")) {
      if (url.indexOf("://") >= 0) {
        handleProxy(out, url, inmh);
      } else {
        handleGet(out, url, inmh);
      }
    } else {
      writeString(out, error(405, "Method Not Allowed", method));
    }
    in.close();
    out.close();
  }

  public void run() {
    try {
      ServerSocket acceptSocket;
      acceptSocket = new ServerSocket(port);
      while (true) {
        Socket s = acceptSocket.accept();
        host = s.getInetAddress().getHostName();
        doRequest(s);
        s.close();
      }
    } catch (IOException e) {
      log.log("accept loop IOException: " + e + "\n");
    } catch (Exception e) {
      log.log("Exception: " + e);
    }
  }

  private Thread t;
  public synchronized void start() {
    stopFlag = false;
    if (t == null) {
      t = new Thread(this);
      t.start();
    }
  }

  public synchronized void stop() {
    stopFlag = true;
    log.log("Stopped at " + new Date() + "\n");
  }
  
  public httpd(int p, String dr, LogMessage lm) {
    port = p;
    docRoot = dr;
    log = lm;
  }

  // This main and log method allow httpd to be run from the console.
  public static void main(String args[]) {
    httpd h = new httpd(80, "c:\\www", null);
    h.log = h;
    h.start();
    try {
      Thread.currentThread().join();
    } catch (InterruptedException e) {};
  }

  public void log(String m) {
    System.out.print(m);
  }
}


/* J20_05.java  */
/* Demonstrate URLConnection. */
import java.net.*;
import java.io.*;
import java.util.Date;

class J20_05 
{
  public static void main(String args[]) throws Exception 
   {
    int c;
    URL hp = new URL("http://yahoo.com");
    URLConnection hpCon = hp.openConnection();

    System.out.println("Date: " + new Date(hpCon.getDate()));
    System.out.println("Content-Type: " + hpCon.getContentType());
    System.out.println("Expires: " + hpCon.getExpiration());
    System.out.println("Last-Modified: " +
                       new Date(hpCon.getLastModified()));
    int len = hpCon.getContentLength();
    System.out.println("Content-Length: " + len);
    if (len > 0) 
    {
      System.out.println("=== Content ===");
      InputStream input = hpCon.getInputStream();
      int i = len;
      while (((c = input.read()) != -1) && (--i > 0)) 
      {
        System.out.print((char) c);
      }
    input.close();
    }
  else 
   {
      System.out.println("No Content Available");
    }
  }
}

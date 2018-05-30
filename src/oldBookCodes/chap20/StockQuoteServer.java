import java.io.*;    // Import the package names to be
import java.net.*;   // used by this application.
import java.util.*;

/**
 * This is an application that implements our stock 
 * quote application protocol to provide stock quotes.
 * @author David W. Baker
 * @version 1.2
 */
public class StockQuoteServer {
   // The port on which the server should listen.
   private static final int SERVER_PORT = 1701;
   // Queue length of incoming connections.
   private static final int MAX_CLIENTS = 50;
   // File that contains the stock data of format:
   // <stock-id> <stock information>
   private static final File STOCK_QUOTES_FILE = 
      new File("stockquotes.txt");
   private ServerSocket listenSocket = null;
   private Hashtable stockInfo;
   private Date stockInfoTime;
   private long stockFileMod;
   // A boolean used to keep the server looping until
   // interrupted.
   private boolean keepRunning = true;

   /**
    * Starts up the application.
    * @param args Ignored command line arguments.
    */
   public static void main(String[] args) {
      StockQuoteServer server = new StockQuoteServer();
      server.serveQuotes();
   }

   /**
    * The constructor creates an instance of this class,
    * loads the stock data, and then our server listens
    * for incoming clients.
    */
   public StockQuoteServer() {
      // Load the quotes and exit if it is unable to do so.
      if (!loadQuotes()) System.exit(1);
      try {
         // Create a listening socket.
         listenSocket = 
            new ServerSocket(SERVER_PORT,MAX_CLIENTS);
      } catch(IOException excpt) {
         System.err.println("Unable to listen on port " +
                              SERVER_PORT + ": " + excpt);
         System.exit(1);
      }
   }

   /**
    * This method loads in the stock data from a file.
    */
   protected boolean loadQuotes() {
      String fileLine;
      StringTokenizer tokenize;
      String id;
      StringBuffer value;
    
      try {
         // Create a decorated stream to the data file.
         BufferedReader stockInput = new BufferedReader(
            new FileReader(STOCK_QUOTES_FILE));
         // Create the Hashtable in which to place the data.
         stockInfo = new Hashtable();
         // Read in each line.
         while ((fileLine = stockInput.readLine()) != null) {
           // Break up the line into tokens.
           tokenize = new StringTokenizer(fileLine);
           try {
             id = tokenize.nextToken();
             // Ensure the stock ID is stored in upper case.
             id = id.toUpperCase();
             // Now create a buffer to place the stock value in.
             value = new StringBuffer();
             // Loop through all remaining tokens, placing them
             // into the buffer.
             while(tokenize.hasMoreTokens()) {
               value.append(tokenize.nextToken());
               // If there are more tokens to come, then append
               // a space.
               if (tokenize.hasMoreTokens()) {
                 value.append(" ");
               }
             }
             // Create an entry in our Hashtable.
             stockInfo.put(id,value.toString());
           } catch(NullPointerException excpt) {
             System.err.println("Error creating stock data " +
                                "entry: " + excpt);
           } catch(NoSuchElementException excpt) {
             System.err.println("Invalid stock data record " +
                                "in file: " + excpt);
           }
         }       
         stockInput.close();
         // Store the last modified timestamp.
         stockFileMod = STOCK_QUOTES_FILE.lastModified();
      } catch(FileNotFoundException excpt) {
         System.err.println("Unable to find file: " + excpt);
         return false;
      } catch(IOException excpt) {
         System.err.println("Failed I/O: " + excpt);
         return false;
      }
      stockInfoTime = new Date();   // Store the time loaded.
      return true;
   }

   /**
    * This method waits to accept incoming client
    * connections.
    */
   public void serveQuotes() {
      Socket clientSocket = null;
    
      try {
         while(keepRunning) {
            // Accept a new client.
            clientSocket = listenSocket.accept();
            // Ensure that the data file hasn't changed; if
            // so, reload it.
            if (stockFileMod != 
               STOCK_QUOTES_FILE.lastModified()) { 
               loadQuotes();
            }
            // Create a new handler.
            StockQuoteHandler newHandler = new 
               StockQuoteHandler(clientSocket,stockInfo,
                                 stockInfoTime);
            Thread newHandlerThread = new Thread(newHandler);
            newHandlerThread.start();
         }
         listenSocket.close();
      } catch(IOException excpt) {
         System.err.println("Failed I/O: "+ excpt);
      }
   }

   /**
    * This method allows the server to be stopped.
    */
   protected void stop() {
      if (keepRunning) {
         keepRunning = false;
      }
   }
}

/**
 * This class is used to manage a connection to
 * a specific client.
 */
class StockQuoteHandler implements Runnable {
   private static final boolean AUTOFLUSH = true;
   private Socket mySocket = null;
   private PrintWriter clientSend = null;
   private BufferedReader clientReceive = null;
   private Hashtable stockInfo;
   private Date stockInfoTime;

   /**
    * The constructor sets up the necessary instance
    * variables.
    * @param newSocket Socket to the incoming client.
    * @param info The stock data.
    * @param time The time when the data was loaded.
    */
   public StockQuoteHandler(Socket newSocket, 
                            Hashtable info, Date time) {
      mySocket = newSocket;
      stockInfo = info;
      stockInfoTime = time;
   }

   /**
    * This is the thread of execution that implements
    * the communication.
    */
   public void run() {
      String nextLine;
      StringTokenizer tokens;
      String command;
      String quoteID;
      String quoteResponse;

      try {
         clientSend = 
            new PrintWriter(mySocket.getOutputStream(),
                            AUTOFLUSH);
         clientReceive = 
            new BufferedReader(new InputStreamReader(
                                  mySocket.getInputStream()));
         clientSend.println("+HELLO "+ stockInfoTime);
         // Read in a line from the client and respond.
         while((nextLine = clientReceive.readLine()) 
               != null) {
            // Break the line into tokens.
            tokens = new StringTokenizer(nextLine);
            try {
              command = tokens.nextToken();
              // QUIT command.
              if (command.equalsIgnoreCase("QUIT")) break;
              // STOCK command.
              else if (command.equalsIgnoreCase("STOCK:")) {
                 quoteID = tokens.nextToken();
                 quoteResponse = getQuote(quoteID);
                 clientSend.println(quoteResponse);
              }
              // Unknown command.
              else {
                 clientSend.println("-ERR UNKNOWN COMMAND");
              }
           } catch(NoSuchElementException excpt) {
             clientSend.println("-ERR MALFORMED COMMAND");
           }
         }
         clientSend.println("+BYE");
      } catch(IOException excpt) {
         System.err.println("Failed I/O: " + excpt);
      // Finally close the streams and socket.
      } finally {
         try {
            if (clientSend != null) clientSend.close();
            if (clientReceive != null) clientReceive.close();
            if (mySocket != null) mySocket.close();
         } catch(IOException excpt) {
            System.err.println("Failed I/O: " + excpt);
         }
      }
   }

   /**
    * This method matches a stock ID to relevant information.
    * @param quoteID The stock ID to look up.
    * @return The releveant data.
    */
   protected String getQuote(String quoteID) {
      String info;

      // Make sure the quote ID is in upper case.
      quoteID = quoteID.toUpperCase();
      // Try to retrieve from out Hashtable.
      info = (String)stockInfo.get(quoteID);
      // If there was such a key in the Hashtable, info will
      // not be null.
      if (info != null) {
        return "+" + quoteID + " " + info;
      }
      else {
        // Otherwise, this is an unknown ID.
        return "-ERR UNKNOWN STOCK ID";
      }
   }
}

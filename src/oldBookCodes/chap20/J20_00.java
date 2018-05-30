/* J20_02.java	*/
/* Connecting and Retrieving data from Remote Computer  */
import java.net.*;
import java.io.*;
import java.util.*;

public class DateServer
 {
  public static void main(String args[])
  {
  try
  {
   Server00 world = new Server00();
  }
  catch(IOException e)
  {
  System.out.println("IO Exception: " +e);
  }
 
static final public int PortNumber = 5555;

public Server00() throws IOException
{

ServerSocket SS = new ServerSocket(PortNumber);
while(true)
 {
 System.out.println("Waiting for a client." );
 Socket S = SS.accept();
 System.out.println("Got a client, Send a Message.");
 OutputStreamWriter OSW = new OutputStreamWriter(S.getOutputStream());
 String Msg = "Curent Date and Time is: " +new Date()+ "\n";
 OSW = write(Msg);
 OSW.close();  
 }

 }
}

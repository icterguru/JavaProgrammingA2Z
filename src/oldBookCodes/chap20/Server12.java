/* Server12.java	*/
/* Server Program of Client/Server Application  */

import java.net.*;
import java.io.*;
import java.util.*;

public class Server12
 {
  public static void main(String args[])
  {
  try
  {
   Server12 world = new Server12();
  }
  catch(IOException e)
  {
  System.out.println("IO Exception: " +e);
  }
 }
static final public int PortNumber = 4321;

public Server12() throws IOException
{
ServerSocket SS = new ServerSocket(PortNumber);
while(true)
 {
 System.out.println("\nWaiting ... Run the Client Program." );
 Socket S = SS.accept();
 System.out.println("\nClient Found and Message Shown. ");
 OutputStreamWriter OSW = new OutputStreamWriter(S.getOutputStream());
 String Msg = "Curent Date and Time on Server is: " + new Date() + "\n";
 OSW.write(Msg);
 OSW.close();  
 }

 }
}

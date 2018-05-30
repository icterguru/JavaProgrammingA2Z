/* Client12.java	*/
/* Client Program of Client/Server Application  */

import java.net.*;
import java.io.*;

public class Client12
 {
  public static void main(String args[])
  {
  try
  {
   Client12 world = new Client12();
  }
  catch(IOException e)
  {
  System.out.println("IO Exception: " +e);
  }
 }
static final public int PortNumber = 4321;

public Client12() throws IOException
 {
 Socket S = new Socket(InetAddress.getLocalHost(), PortNumber);
 Reader R = new InputStreamReader(S.getInputStream());
 BufferedReader BR = new BufferedReader(R);
 System.out.println("\nMessage from Server : \n" + BR.readLine());
 }
}

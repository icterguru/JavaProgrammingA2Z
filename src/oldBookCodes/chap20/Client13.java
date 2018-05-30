/* Client13.java	*/
/* Client Program of Multi-Clients Application  */

import java.net.*;
import java.io.*;

public class Client13
 {
 public static void main(String args[])
 {
  try{
  Client13 Obj = new Client13();
  }
 catch(IOException e)
  {
  System.out.println("Exception " + e);
  }
}
static final public int PortNumber = 4321;
private BufferedReader input, term ;
private Writer output;
public Client13() throws IOException
{
term = new BufferedReader(new InputStreamReader(System.in));

Socket S = new Socket(InetAddress.getLocalHost(), PortNumber);
Reader R = new InputStreamReader(S.getInputStream());
input = new BufferedReader(R);
output = new OutputStreamWriter(S.getOutputStream());

 while(true)
  {
  String Line = input.readLine();
  System.out.println(Line);
  Line = term.readLine();
  if(Line.equals("Bye"))
    break;
  output.write(Line + "\n");
  output.flush();
  }
 }
}

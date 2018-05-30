
/* Chat13.java       */
/* Driver Program of the Client13/Server13 Application */

import java.net.*;
import java.io.*;

public class Chat13
 {
 static public void main(String[] args)
 {
 try{
  Chat13 Ch = new Chat13();
  }
catch(IOException e)
 {
 System.out.println("Received and IO Exception " +e);
 }
}

static final public int portNumber =4321;
public Chat13() throws IOException
{

ServerSocket SS = new ServerSocket(portNumber);
while(true)
{
Socket S = SS.accept();
Thread Session = new Server13(S.getInputStream(), S.getOutputStream());
Session.start();
}
}
}



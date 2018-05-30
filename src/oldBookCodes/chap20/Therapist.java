

import java.net.*;
import java.io.*;

public class Therapist
 {
 static public void main(String[] args)
 {
 try{
  Therapist world = new Therapist();
  }
catch(IOException e)
 {
 System.out.println("Received and IO Exception " +e);
 }
}

static final public int portNumber =4321;
public Therapist() throws IOException
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


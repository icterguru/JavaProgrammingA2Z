/* Server13.java	*/
/* Server Program of Multi-Clients Application  */

import java.net.*;
import java.io.*;
import java.util.Vector;
import java.util.StringTokenizer;

public class Server13 extends Thread
 {
  private String Name = "";
  private BufferedReader BR;
  private Writer W; 

  public Server13(InputStream ins, OutputStream outs)
  {
   Reader R = new InputStreamReader(ins);
   BR  = new BufferedReader(R);
   W = new OutputStreamWriter(outs);
  }
  private String Response(String text)
  {
   //.....
   if(text.endsWith("?"))
     return "Why you are asking so?";
   Vector V = new Vector();
   StringTokenizer ST = new StringTokenizer(text.toLowerCase(), ".,?!");
   while(ST.hasMoreElements())
     V.addElement(ST.nextElement());
 
   //.....
   if((V.size()>1) &&
    V.elementAt(0).equals("Do")&&
    V.elementAt(0).equals("you"))
     return "Sorry!! I don't know..(Type Bye to Quit)";
 
  //.....
  
  for(int i = 0; i<V.size(); i++)
   {
    String Relative = (String)V.elementAt(i);
    if(isRelative(Relative))
     return "Tell me more about your " +Relative;
   }

  return "Tell me more... (Type Bye to Quit)";
}

private boolean isRelative(String Name)
 {
 return Name.equals("Father") || Name.equals("Mother") 
       ||Name.equals("Brother") || Name.equals("Sister");
 }

 public void run()
 {
  try
  {
   W.write("Welcome! What is your Name?\n");
   W.flush();
   Name = BR.readLine();
   W.write("Wel " + Name + " what can we do for you?\n");
   W.flush();

 while(true)
  {
  String text = BR.readLine();
  W.write(Response(text) + "\n");
  W.flush();
  }
 }
 catch(IOException e)
  {
  System.out.println("IOException " + e);
  stop();
  }

 }
}

/* J20_07.java	*/
/* Demonstrating URL */
import java.io.*;
import java.net.*;

public class J20_07
 {
  public static void main(String args[])
  {
  try{
    URL url = new URL(args[0]);  
 // first command line argument
    InputStreamReader ISR = new InputStreamReader(url.openStream());
    BufferedReader BR = new BufferedReader(ISR);
    String S = BR.readLine();  
    while(S !=null) 
     {
      System.out.println(S);
      S = BR.readLine();
     }  
    BR.close();
   }
  
  catch(MalformedURLException e)
    {
    System.out.println("URL Exception: " + e);
    }
  catch(IOException e)
    {
    System.out.println("I/O Exception: " + e);
    }
  }
}

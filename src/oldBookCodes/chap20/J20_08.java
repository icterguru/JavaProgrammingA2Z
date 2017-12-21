/* J20_08.java	*/
/* Demonstrate URLConnection.  */
import java.net.*;
import java.io.*;
import java.util.*;

public class J20_08
{
  public static void main(String args[]) throws Exception 
  {
   int c;
   URL url = new URL("http://www.du.bangla.net");
   URLConnection urlC = url.openConnection();
   System.out.println("Content-Type: "+urlC.getContentType());
   System.out.println("Expires: " + urlC.getExpiration());
   int l = urlC.getContentLength();
   System.out.println("Content-Length: " + l);
    if (l > 0)
     {
      System.out.println("=== Content ===");
      InputStream input = urlC.getInputStream();
      int i = l;
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

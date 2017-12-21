/* J20_03.java	*/
/* Connecting to Remoter Computer Using Socket Class  */
import java.io.*;
import java.net.*;

public class J20_03
{  
 public static void main(String[] args)
   {
   try{ 
        Socket S = new Socket("www.du.bangla.net",80);
        BufferedReader in = new BufferedReader
            (new InputStreamReader(S.getInputStream()));
         boolean more = true;
         while (more)
         {
          String line = in.readLine();
           if (line == null) 
             more = false;
           else
             System.out.println(line);
         }
      }
   catch (IOException e)
    { 
     System.out.println("Error" + e);
    }
  }
}

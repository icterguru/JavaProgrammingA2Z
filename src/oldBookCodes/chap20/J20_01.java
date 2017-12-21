/* J20_01.java  */
/* Displaying Remote/Local Host Address */
import java.net.*;
public class J20_01
{ 
 public static void main(String[] args)
   {  
   try{
     System.out.print("\nRemote Host:\n");
      if (args.length > 0)
       { 
  String host = args[0];
       InetAddress[] addresses
               = InetAddress.getAllByName(host);
       for (int i = 0; i < addresses.length; i++)
         System.out.println(addresses[i]);
       }
    else{
      InetAddress localHostAddress
        = InetAddress.getLocalHost();
      System.out.print("\nLocal Host:\n" + localHostAddress);
     }
   }
   catch (Exception e)
    {  
     System.out.println("Error: " + e);
    }
  }
}

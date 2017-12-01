package chapter15;
/* J15_05.java   */
/* Writing into a Data File  */
import java.io.*;

 public class J15_05
{  
 public static void main(String[] args) throws IOException
   {  
   boolean FMode = true;  // Append Mode true
   FileWriter fws = new FileWriter("C:\\test.txt", FMode);
 
   System.out.println("The file named c:\\test.txt is opened: ");
   System.out.println("Write something and Press ENTER to Add:");
   FileOutputStream fos = new FileOutputStream("C:\\test.txt", FMode);

   char c = (char)System.in.read();  // Reading  a Character
   while(c != '\n')   // While not pressed ENTER
    {
    fos.write(c);  // Writting into file
    c = (char)System.in.read();// Reading  a Character
    }
   fws.close();
  }
}

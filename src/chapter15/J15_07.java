package chapter15;
/* J15_07.java   */
/* Writing into and Reading from a same Data File  */
import java.io.*;

 public class J15_07{  
 public static void main(String[] args) throws IOException  {  
   FileWriter fws = new FileWriter("C:\\myfile.txt");
   System.out.println("The file named c:\\ myfile.txt is opened: ");
   System.out.println("Write data and Press ENTER to display:");
   FileOutputStream fos = new FileOutputStream("C:\\myfile.txt");
   char c = (char)System.in.read();  // Reading  a Character

   while(c != '\n')   // While not pressed ENTER
    {
    fos.write(c);  // Writting into file
    c = (char)System.in.read();// Reading  a Character
    }
   fws.close();	// closing data file

     // Reopening for deading         
   FileReader frs = new FileReader("c:\\myfile.txt");
   System.out.println("The File C:\\myfile.txt Contains: ");
   BufferedReader br = new BufferedReader(frs);
   String S; 
   while(( S = br.readLine()) !=null) 
 // reading from data file
    { 
    System.out.print(S);  // display into monitor
    } 
    frs.close();  // closing data file
  }
}

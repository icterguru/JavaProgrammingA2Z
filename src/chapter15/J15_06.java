package chapter15;
/* J15_06.java   */
/* Reading Data From a Data File  */
import java.io.*;
 public class J15_06
{  
 public static void main(String[] args) throws IOException
   {  
   FileReader frs = new FileReader("./test.txt");
   System.out.println("The File ./test.txt Contains: ");
   BufferedReader br = new BufferedReader(frs);
   String S; 

   while(( S = br.readLine()) !=null)  // reading from data file
    { 
    System.out.print(S);   // display into moitor
    } 
    frs.close();		// closing data file	
  }
}

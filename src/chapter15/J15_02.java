package chapter15;
/* J15_02.java   */
/* Opening a New Data File  */
import java.io.*; // Required for FileWriter Class
public class J15_02{  
 public static void main(String[] args){  
    try{  
FileWriter fw = new FileWriter("C:\\test.txt");
//FileWriter fw = new FileWriter("C:\\Users\\mhossa12\\Documents\\test2.doc");
      fw.close();
      }
      catch(IOException e)
      {  
     	 System.out.print("Error: " + e);
       System.exit(1);  // For Normal Termination
      }
  }
}

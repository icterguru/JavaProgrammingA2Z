package chapter15;
/* 	J15_10.java	  */
/* A Sample File Management Program */
import java.io.*;
 public class J15_10
{
public static void main(String args[]) throws IOException
 {
 String S;
 InputStreamReader IR = new InputStreamReader(System.in);
 BufferedReader BR = new BufferedReader (IR);
 System.out.print("Enter a  file name : ");
 S = BR.readLine();
 File f = new File(S);
 if(f.exists()==true)
  {
  System.out.println("The file : "  + f.getName() +" exists.");
  System.out.println("Absoulate Path of the File is : " + f.getAbsolutePath());
  System.out.println("Path of the File is : " + f.getPath());
  }
 else
 {
 System.out.println("The file : "  + f.getName() +" does not exist.");
 } 
}
}

package chapter15;
/* 	J15_09.java	  */
/* A Sample File Management Program */
import java.io.*;
 public class J15_09{
 public static void main(String args[])
 {
  File f = new File("c:\\", "test.txt");
  if(f.exists()==true)
  {
  System.out.println("The file : "  + f.getName() +" exists.");
  System.out.println("Absoulate Path of the File is : " + f.getAbsolutePath());
  System.out.println("Path of the File is : " + f.getPath());
  }
 else{
 System.out.println("The file : "  + f.getName() +" does not exist.");
 } 
}
}

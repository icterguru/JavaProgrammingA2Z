package chapter03;
/* InputStreamReaderEx1.java */
/* Converting String Object to Corresponding Wrapper Class Objct using valueOf() Method  */
import  java.io.*; 
 public class InputStreamReaderEx1{
public static void main(String args[])  {
 Integer Roll;	//  Roll is wrapper class object
 String  Name;
 Float   Mark;	//  Mark is wrapper class object
 String S1, S2;
 InputStreamReader IN = new InputStreamReader(System.in);
 BufferedReader BR = new BufferedReader (IN);
 try{
  System.out.print("Enter Roll: ");
  S1 = BR.readLine();
  Roll = Integer.valueOf(S1);
  System.out.print("Enter Name: ");
  Name = BR.readLine();
  System.out.print("Enter Mark: ");
  S2 = BR.readLine();
  Mark = Float.valueOf(S2);
  System.out.println("Roll is : " +Roll);
  System.out.println("Name is : " +Name);
  System.out.println("Mark is : " +Mark);
   }
 catch(Exception e)
  { 
   System.out.println("Exception No: " +e); 
  }
 }
} 

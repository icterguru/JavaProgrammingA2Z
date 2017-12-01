package chapter07;
/* J07_30.java */
/* Convering String Object to Corresponding Numeric Object */
import  java.io.*; 
 public class J07_30{
public static void main(String args[]) throws IOException {
 String S;  // S is String Object
 Float F ;  // F is Wrapper Object
BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter a floating point number: ");
 S = BR.readLine();  // reading as String 
 F = Float.valueOf(S); // converting String to Float
 System.out.println("You have entered: " +F);
 }
} 

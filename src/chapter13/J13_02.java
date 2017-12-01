package chapter13;
/* J13_02.java 	*/
/*  Finding Square Root of and Integer Number  */
import java.io.*;  // Used for readLine() Method
 public class J13_02{
public static void main(String args[]) throws IOException {
 int x;  double y; 
 String S;
 BufferedReader BR = 
   new BufferedReader (new InputStreamReader(System.in));
 System.out.print("Enter an integer number : ");
 S = BR.readLine();
 x = Integer.parseInt(S);
 y = java.lang.Math.sqrt(x);  // Using full Path
 System.out.println("Square Root of " + x +" is: " +y);
 }
}

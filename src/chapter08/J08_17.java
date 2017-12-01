package chapter08;
/* J08_17.java */
/* Converting String Object to Corresponding Wrapper Class Objct using valueOf() Method  */
import  java.io.*; 
 public class J08_17{
public static void main(String args[]) throws IOException {
 Float F;	//  f is wrapper class object
 String FString;
 BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
 System.out.print("Enter a floating point number: ");
 FString = BR.readLine();
 F = Float.valueOf(FString);
 System.out.println("You have entered: " +F);
 }
} 

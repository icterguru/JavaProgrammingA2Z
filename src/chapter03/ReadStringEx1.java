package chapter03;
/* ReadStringEx1.java */
/* Reading a string from Keyboard*/
import  java.io.*; 
 public class ReadStringEx1{
public static void main(String args[]) throws IOException {
 String s;
 InputStreamReader IN = new InputStreamReader(System.in);
 BufferedReader BR = new BufferedReader(IN);
 System.out.print("Enter a string (line of characters): ");
 s = BR.readLine();
 System.out.println("You have entered: " +s);
 }
} 

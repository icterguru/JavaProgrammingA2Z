package chapter07;
/* J07_02.java */
/* Array of String Variable */
import  java.io.*; 
 public class J07_02{
public static void main(String args[])throws IOException {
char Ch;
System.out.print("Enter some characters ('Q' to quit) : ");
 do{
  Ch = (char)System.in.read();
  System.out.print(Ch);
  }while(Ch != 'Q');
System.out.print("Program terminated.");
}
}

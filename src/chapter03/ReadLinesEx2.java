package chapter03;
/* ReadLinesEx2.java */
/* Example of readLine() Method */
import  java.io.*; 
 public class ReadLinesEx2{
public static void main(String args[]) throws IOException {
DataInputStream inData = new DataInputStream(System.in);
System.out.print("Please enter your name: ");
String   Name;
Name= inData.readLine();
System.out.print("Your name is : ");
System.out.print(Name);
 }
}

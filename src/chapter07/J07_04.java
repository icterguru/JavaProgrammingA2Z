package chapter07;
/* J07_04.java */
/* Array of String Variable */
import  java.io.* ; 
 public class J07_04{
public static void main(String args[]) {
 DataInputStream inData = new DataInputStream(System.in);
 String   Name;
 Name = new String("");
 try {
 System.out.print("Please enter your name: ");
 Name= inData.readLine();
 }
 catch(Exception E){   }
 System.out.print("Your name is : ");
 System.out.print(Name);
 }
}

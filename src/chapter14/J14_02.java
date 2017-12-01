package chapter14;
/* J14_02.java */
/* Using try/catch Statements while using read() Method */
import  java.io.* ; 
 public class J14_02 {
public static void main(String args[]) {
 DataInputStream in = new DataInputStream(System.in);
 char ch=0;
 try {
 System.out.print("Enter a character: ");
 ch= (char)System.in.read();
 }
 catch(Exception e){   }  // An Empty Exception Handler 
 System.out.println("You have entered: " +ch);
 }
} 

package chapter03;
/* ReadNumberEx1.java */
/* Reading an integer and float type value from Keyboard*/
import  java.io.*; 
 public class ReadNumberEx1 {
public static void main(String args[]) throws IOException {
 int Roll;
 float Mark;	
 String S1, S2;
 InputStreamReader IN = new InputStreamReader(System.in);
 BufferedReader BR = new BufferedReader (IN);
 System.out.print("Enter Roll: ");
 S1 = BR.readLine();
 Roll = Integer.parseInt(S1);
 System.out.print("Enter Mark: ");
 S2 = BR.readLine();
 Mark = Float.parseFloat(S2);
 System.out.println("Roll Entered : " +Roll);
 System.out.println("Mark Entered : " +Mark);
 }
} 

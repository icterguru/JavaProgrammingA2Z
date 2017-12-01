package chapter07;
/* J07_07.java */
/* Using Arithmetic Operator to add one more strings to another and Assign one String by another */

 public class J07_07{
public static void main(String args[]) {
 String   S1, S2, S3, S4;
 S1 = new String("Java");
 S2 = new String("Programming");
 S3 = "Welcome to " + S1 +" " +S2;
 System.out.println(S3);
 S4 = S3;
 System.out.println(S4);
 }
} 

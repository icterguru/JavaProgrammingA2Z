package chapter07;
/* J07_08.java */
/*  Example of toString() Method */
 public class J07_08{
public static void main(String args[]) {
 StringBuffer   S1;
 String   S2;
 S1 = new StringBuffer("Object Oriented Programming");
 S2 = new String(S1.toString());
 System.out.println("The string buffer object is   : " +S1);
 System.out.println("Corresponding string object is: " +S2);
 }
} 

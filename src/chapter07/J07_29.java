package chapter07;
/* J07_29.java */
/* Converting Number System using toString() Method */
 public class J07_29{
public static void main(String args[]){
int N = 34;
System.out.println("In String  System N : " + Integer.toString(N));
System.out.println("In Decimal System N : " + N);
System.out.println("In Binary  System N : " +   Integer.toBinaryString(N));
System.out.println("In Octal   System N : " + Integer.toOctalString(N));
System.out.println("In Hex.    System N : " + Integer.toHexString(N));
 }
}

package chapter10;
/*	J10_10.java   */
/*   Using public Finalize Method  */
class Sample 
 {
 // ... ... ...
Sample()	// Constructor Defined
 {
 System.out.println("Constructor Called.");
 // ... ... ...
 }
public void finalize()		// Finalize Defined
 {
 // ... ... ...
System.out.println("Finalize Called.");
 }
}
 public class J10_10
{
public static void main(String args[])
 {
 Sample S = new Sample();
 System.out.println("\n... ... ... ... ...");
 S.finalize();	// Calling Finalize Method
 } 
}

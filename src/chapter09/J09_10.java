package chapter09;
/* J09_10.java    */
/* Example of Nesting member function */
import java.io.* ;
class SquareNumber {
 private int  Number;
int 	Square() {
 Number= Number*Number;
 return(Number); 
 }
void 	setNumber()  //throws IOException
 {
 String S;
 try {
  System.out.print("Enter an integer number : ");
  BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
  S = BR.readLine();   
  Number = Integer.parseInt(S); 
 }
 catch(Exception E) {
  System.out.print("Error in input! Program Terminated.");
  }
 }
void  display()  throws IOException {
 setNumber();    	    // Nesting of Member Function
 int SV = Square();  // Nesting of Member Function
 System.out.print("\nSquare of " +Number +" is : " +SV); 
 }
}

 public class J09_10 {
public static void main(String args[]) throws IOException {
 SquareNumber Sqr = new  SquareNumber();
  // Sqr is an object of SquareNumber class
 Sqr.display();
 }
} 


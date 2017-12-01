package chapter09;
/*	J09_09.java  */
/*  ERROR in Running */ 
class Sample{
 int display(){
  System.out.println("I Love Object Oriented Programmint");
  System.out.println("I Love Object Oriented Programmint");
  System.out.println("I Love Object Oriented Programmint");
   return 0;	// Method Terminated
  System.out.println("Object Oriented Programmint"); // Illegal use ... ...
  }
 }  
 public class J09_09 {
public static void main(String args[]){   // throws  IOException
 Sample S = new Sample();  // S is an object array of Sample class
 S.display(); // Method Call
 }
} 

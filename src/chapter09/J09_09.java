package chapter09;
/*	J09_09.java  */
/*  ERROR in Running */ 
class Sample{	
String name1;
int display(){
  System.out.println("I Love Object Oriented Programmint");
  System.out.println("I Love Object Oriented Programmint");
  System.out.println("I Love Object Oriented Programmint");;;;;;;;;;;;;;
  return 1;	// Method Terminated
//  System.out.println("Object Oriented Programmint"); // Illegal use ... ...
  }
	
String displayName(String name){
	name1 = name;
	return name1;	
}

float add(int x, int y){
	
	float sum = (x - y); 
	return sum;
 }
 }

public class J09_09 {
public static void main(String args[]){   // throws  IOException
 Sample s = new Sample();  // S is an object array of Sample class
 System.out.println("I Love Object Oriented Programmint");
 System.out.println("I Love Object Oriented Programmint");
 System.out.println("I Love Object Oriented Programmint");;;;;;;;;;;;;;

 s.display(); // Method Call
 
 
 System.out.println("Sum = " + s.add(2, 5));
 System.out.println("Sum = " + s.add(20, 5));
 System.out.println("Sum = " + s.add(200, 5));
 System.out.println("Sum = " + s.add(24, 54));
 System.out.println("Sum = " + s.add(32, 54));
 System.out.println("Sum = " + s.add(662, 577));
  
}

} 

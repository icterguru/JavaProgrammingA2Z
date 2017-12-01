package chapter09;
//  ReferenceEx1.java
// Using Object and Reference
// http://www.c4learn.com/java/java-assigning-object-reference/

class Rectangle {
	  double length;
	  double breadth;
	}

class ReferenceEx1
{
	public static void main(String args[]) {

	Rectangle r1 = new Rectangle();

	Rectangle r2 = r1;
	 // r2 is called a reference of type Rectangle
	 // It can be considered as a copy of r11

	 r1.length = 10;
	 r2.length = 50;

	 System.out.println("Value of r1's Length : " + r1.length);
	 // Used Object here
	 System.out.println("Value of r1's Length : " + r2.length);
	 // Used reference to the object here

	System.out.println("The object r1 is located at: " + System.identityHashCode(r1));
	System.out.println("The reference r2 is located at: " + System.identityHashCode(r2));

	 r1 = null; // Enforcing the object r1 to null

	 System.out.println("Value of r1's Length : " + r2.length);
	 // Used reference to the object here
	System.out.println("The object r1 is located at: " + System.identityHashCode(r1));
	System.out.println("The reference r2 is located at: " + System.identityHashCode(r2));

	  Rectangle r3 = new Rectangle();

	     }
}


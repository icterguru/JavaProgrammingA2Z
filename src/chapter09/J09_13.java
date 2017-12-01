package chapter09;
/* J09_13.java
Usage of this keyword  */


public class J09_13 {
	int x = 5;   // Here x is an instance (class) variable
	public static void main(String args[])	{
		int x = 1;   // Here x is a local variable
		System.out.println("Inside main():: before object creation ");
		System.out.println("x = " + x );  // Uses local x

		J09_13  obj1 = new J09_13();
		obj1.display(500);  // Assigns the instance variable x to 500

		System.out.println("\nWith a different object.... ");
		J09_13  obj2 = new J09_13();
		obj2.display(555);  // Assigns the instance variable x to 555

		System.out.println("\nInside main():: after object creation ");
		System.out.println("x = " + x );  // Uses local x
	}

void display(int x){  // Here x is an argument (local) variable
	System.out.println("Inside display()");
	this.x = x;  // This is how the this keyword is used
	System.out.println("Arguments: x = " + x );
	System.out.println("Using this keyword: this.x = " + this.x );
  }
}

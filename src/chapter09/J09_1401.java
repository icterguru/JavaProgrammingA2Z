/* J09_14.java
Usage of this keyword  */
package chapter09;
public class J09_1401 {
	int x = 5;   // Here x is an instance (class) variable
	public static void main(String args[])	{
	int x = 1;   // Here x is a local variable
	System.out.println("Inside main():: before object creation ");
	System.out.println("x = " + x );  // Uses local x

	J09_1401  obj1 = new J09_1401();
	obj1.display(500);  // Assigns the instance variable x to 500

	System.out.println("\nWith a different object.... ");
	J09_1401  obj2 = new J09_1401();
	obj2.display(555);  // Assigns the instance variable x to 555

	System.out.println("\nInside main():: after object creation ");
	System.out.println("x = " + x );  // Uses local x
	}

void display(int a){  // Here a is an argument (local) variable
	System.out.println("Inside display()");
	x = a;  // Equivalent to this.x = a;
	System.out.println("Argument variable: a = " + a );
	System.out.println("Instance variable x = " + this.x );
 }
}

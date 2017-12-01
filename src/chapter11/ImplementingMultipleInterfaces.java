package chapter11;
/* ImplementingMultipleInterfaces.java	*/
/* Implementing Multiple Interfaces */

/**
 * @author HossaiM
 *
 */
interface Interface11{
	void displayMsg11();
}

interface Interface22{
	void displayMsg22();
}

class MyClass33 implements Interface11, Interface22{
  // Implements Multiple Interfaces here


	@Override
	public void displayMsg11() {
		System.out.println("Inside displayMsg11()...");

	}

	@Override
	public void displayMsg22() {
		System.out.println("Inside displayMsg22()...");

	}

}

public class ImplementingMultipleInterfaces {

	public static void main(String[] args) {
		MyClass33 obj1 = new MyClass33();

		obj1.displayMsg11();
		obj1.displayMsg22();
	}

}


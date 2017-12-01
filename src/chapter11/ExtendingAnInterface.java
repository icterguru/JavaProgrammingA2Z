package chapter11;
/* ExtendingAnInterface.java	*/
/* Extending Multiple Interfaces */


/**
 * @author HossaiM
 *
 */
interface Interface0{
	void displayMsg0();
}

interface Interface1{
	void displayMsg1();
}

interface Interface2 extends Interface0, Interface1{
	void displayMsg2();
}

class MyClass3 implements Interface2{

	@Override
	public void displayMsg0() {
		System.out.println("Inside displayMsg0()...");
	}

	@Override
	public void displayMsg1() {
		System.out.println("Inside displayMsg1()...");

	}

	@Override
	public void displayMsg2() {
		System.out.println("Inside displayMsg2()...");

	}


}

public class ExtendingAnInterface{

	public static void main(String[] args) {

		MyClass3 obj1 = new MyClass3();

		obj1.displayMsg0();
		obj1.displayMsg1();
		obj1.displayMsg2();

	}

}

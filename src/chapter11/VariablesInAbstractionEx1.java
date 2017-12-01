package chapter11;
// VariablesInAbstractionEx1.java
// Using Variables in Abstract Class and Interface

abstract class BaseAbstract1{
	abstract void displaX(); // Abstract by default
	int x = 0;  // x is a variable here
}

interface BaseInterface1{
	void displaY(); // Abstract by default
	int y = 0;	// variable y is static and final, by default
}


class DerivedVA extends BaseAbstract1 implements BaseInterface1{

	@Override
	public void displaX() {
		System.out.println("For abstract class....");
		System.out.println("Before change x = " + x);
		x = 10;  // Allowed
		System.out.println("After change x = " + x);
	}

	@Override
	public void displaY() {
		System.out.println("For interface....");
		System.out.println("Before change y = " + y);
		// y = 20; // Change of y is NOT allowed
		System.out.println("Change of interface variable is not allowed);
	}
}

public class VariablesInAbstractionEx1 {

	public static void main(String args[]){
		DerivedVA x = new DerivedVA(); // x is an object here
		x.displaX();
		System.out.println();
		x.displaY();
	}
}


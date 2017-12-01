package chapter11;
// TypeCastingEx3.java

public class TypeCastingEx3{
	/**
	 * Upcasting and downcasting with Number, Integer, Float etc.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Number n, n1;
		Integer i = 5;
		Double d = 2.5;
	// Upcasting, putting Double and Integer to Number. No issues. Compiler
	// does this automatically.
	n = i;
	n1 = d;
	// Now its time for downcasting. The following code segment will not
	// compile. Although we did the reverse in the upper segment, compiler
	// throws an error while doing this. Try this by uncommenting.
	/*
	 * i = n; d = n1;
	 */
	// So, to downcast properly, we need to explicitly cast it
	// appropriately.

	//i = n;  // Type mismatch: cannot convert from Number to Integer
	//d = n1;   // Type mismatch: cannot convert from Number to Double
	i = (Integer) n;
	d = (Double) n1;
	System.out.println("Here i = " + i + " (Integer) n : " + (Integer) n );
	System.out.println("Here d = " + d + " d = (Double) n1: " + (Double) n1 );
	}
}

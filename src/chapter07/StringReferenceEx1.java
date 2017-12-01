package chapter07;
//  StringReferenceEx1.java
// Using String Reference

public class StringReferenceEx1
{
	public static void main(String args[]) {
		String s1 = new String("java5");
		String r1 = s1; // r1 is called a reference of type String
		// r1 can be considered as a copy of s1
		System.out.println("Value of s1 : " + s1);
		System.out.println("Value of r1 : " + r1);

		System.out.println("The object s1 is located at: " + System.identityHashCode(s1));
		System.out.println("The reference r1 is located at: " + System.identityHashCode(r1));

		r1 = null; // Enforcing the object r1 to null

		System.out.println("Value of s1 : " + s1);
		System.out.println("Value of r1 : " + r1);

		// Used reference to the object here
		System.out.println("The object r1 is located at: " + System.identityHashCode(r1));
		System.out.println("The reference s1 is located at: " + System.identityHashCode(s1));

	}
}

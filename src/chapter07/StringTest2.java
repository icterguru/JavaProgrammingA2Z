package chapter07;
// StringTest2.java

public class StringTest2 {

public static void main(String[] args) {
	String name1 = "Mokter Hossain";
	String name2 = "Mokter Hossain";
	int number1 = 100;
	int number2 = 100;

	System.out.println("name1 is: " + name1);
	System.out.println("number1 is: " + number1);

	name1.toUpperCase(); // string operation
	number1 = number1 * 2;
	number2 = number2 * 2;

	System.out.println("After some operations: ");

	System.out.println("name1 is: " + name1);
	System.out.println("number1 is: " + number1);

	System.out.println("name1 is located at: " + System.identityHashCode(name1));
	System.out.println("name2 is located at: " + System.identityHashCode(name2));

	System.out.println("number1 is located at: " + System.identityHashCode(number1));
	System.out.println("number2 is located at: " + System.identityHashCode(number2));

	}

}

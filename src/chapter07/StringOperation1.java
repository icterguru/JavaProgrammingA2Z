package chapter07;
// StringOperation1.java
public class StringOperation1 {

	public static void main(String[] args) {
		String myString1 = "Hello My 1234 World!";
		myStringOperations(myString1);

	}

private static String myStringOperations(String myString) {
System.out.println("The Original string is:"+ myString);
System.out.println("\n");

System.out.println("The Original string is located at:"+ System.identityHashCode(myString));

System.out.println("The substring starts at index 0 is:" + myString.substring(0));
System.out.println("Length of the substring starts at index 0 is:" + myString.substring(0).length());

System.out.println("The substring starts at index 9 is:" + myString.substring(9));
System.out.println("Length of the substring starts at index 9 is:" + myString.substring(9).length());

System.out.println("Does the substring starts at index starts with 1? :" + myString.substring(9).startsWith("1"));
System.out.println("Does the substring starts at index ends with d? " + myString.substring(9).endsWith("d"));
	System.out.println("Does the substring starts at index ends with !? " + myString.substring(9).endsWith("!"));

	return myString;
    }


}

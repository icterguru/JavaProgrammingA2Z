package chapter07;
// StringImmutableTest.java
public class StringImmutableTest {

	public static void main(String[] args) {
		String str = "Strings are immutable";
		str = str.concat(" all the time");
		System.out.println(str);
		System.out.println("So, a string cannot be altered once it is created");
	}
}

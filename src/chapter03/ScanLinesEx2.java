package chapter03;
// ScanLinesEx2.java
import java.io.IOException;
import java.util.Scanner;
public class ScanLinesEx2 {
	// Demonstrate next() with Scanner object 
	public static void main(String args[]) throws IOException { 
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = scnr.nextLine();
		System.out.print("Enter an integer number: ");
		int number = scnr.nextInt();
		System.out.println("\nYour sentence: " + sentence);
		System.out.println("Your number: " + number);
	}

}

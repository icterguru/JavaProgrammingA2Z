package chapter03;
// ScanLinesEx1.java
import java.io.IOException;
import java.util.Scanner;
public class ScanLinesEx1 {
	// Demonstrate next() with Scanner object 
	public static void main(String args[]) throws IOException { 
		Scanner scnr = new Scanner (System.in);
		String fName = new String();
		System.out.print("Enter your first name and press ENTER: ");
		fName = scnr.next();
		System.out.print("You entered: "+fName);
	}
}

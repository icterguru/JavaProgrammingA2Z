package chapter03;

import java.io.IOException;
import java.util.Scanner;


public class J03_26 {

	// Demonstrate next() with Scanner object 

	public static void main(String args[]) throws IOException { 

		String fName = new String();
		Scanner scnr = new Scanner (System.in);

		System.out.print("Enter your first name and press ENTER: ");
		fName = scnr.next();
		System.out.print("You entered: "+fName);
		
		scnr.close();
	}

}

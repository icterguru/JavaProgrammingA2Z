package chapter05;

import java.io.IOException;


public class J05_06 {


	public static void main(String args[]) throws IOException { 

	 
		System.out.print("Enter A or a ar B or b: ");

		char Ch = (char)System.in.read();  // accepts a single character
		
		switch(Ch)
		{
		case 'A':	// When Ch = A
			System.out.print("You have entered : A");
			break;
		case 'a':	// When Ch = a
			System.out.print("You have entered : a");
			break;
		case 66:	// When Ch = B
			System.out.print("You have entered : B");
			break;
		case 'b':	// When Ch = b
			System.out.print("You have entered : b");
			break;
		default:
			System.out.print("You have not entered A, a, B or b.");
		}   // End of switch


	}

}

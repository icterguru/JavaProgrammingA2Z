package chapter05;

import java.io.IOException;
import java.util.Scanner;

public class J05_05 {


	public static void main(String args[]) throws IOException { 

		Scanner scnr = new Scanner(System.in);

		
		System.out.print("Enter your academic year(From 1 to 4): ");
		int Year = scnr.nextInt();

		switch(Year){
		case 1:   // when Year =1
			System.out.println("You are a student of first year.");
			break;
		case 2:	// when  Year = 2
			System.out.println("You are a student of second year.");
			break;
		case 3:	// when  Year = 3
			System.out.println("You are a student of third year.");
			break;
		case 4:	// when  Year = 4
			System.out.println("You are a student of fourth year.");
			break;
		default:   // when  Year is not between 1 to 4
			System.out.println("\nYou entered an invalid academic year.");
		}   // End of switch

		scnr.close();

	}

}

package chapter05;

import java.io.IOException;
import java.util.Scanner;

public class J05_02 {


	public static void main(String args[]) throws IOException { 

		Scanner scnr = new Scanner(System.in);

		System.out.print("Enter the year to be tested: ");

		int Year = scnr.nextInt();

		if( ((Year%4)==0 &&(Year%100) !=0)||(Year%400)==0)
			System.out.println("" +Year +" is a leap year.");
		else
			System.out.println("" +Year +" is not a leap year.");

		scnr.close();

	}

}

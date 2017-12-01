package chapter05;

import java.io.IOException;
import java.util.Scanner;

public class J05_15 {


	public static void main(String args[]) throws IOException { 

		Scanner scnr = new Scanner(System.in);

		
		int Number=0, RightDigit=0; 
		 
		 System.out.print("Enter the number to be reversed: ");
		   
		 Number = scnr.nextInt();
		 
		 System.out.print("The Number in reverse order is: " );
		 
		 do {
		    RightDigit = Number %10;
		    System.out.print("" +RightDigit);
		    Number = Number/ 10;
		   }while(Number !=0);  // End of do

		 scnr.close();

	}

}

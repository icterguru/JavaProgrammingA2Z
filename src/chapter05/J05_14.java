package chapter05;

import java.io.IOException;
import java.util.Scanner;

public class J05_14 {


	public static void main(String args[]) throws IOException { 

		Scanner scnr = new Scanner(System.in);

		
		int N1=0, N2=0, GCD=0; 

		System.out.print("Enter two nonnegative integers: ");
		N1 = scnr.nextInt();
		N2 = scnr.nextInt();
		int N01 = N1, N02= N2;
		
		while(N2 !=0)
		{
			GCD = N1 % N2;
			N1 = N2;
			N2 = GCD;
		}  // End of while

		System.out.println("Greatest common divisor of " + N01 + " and " + N02 +" is : " +N1); 


		scnr.close();

	}

}

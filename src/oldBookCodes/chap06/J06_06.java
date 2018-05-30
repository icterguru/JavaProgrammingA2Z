package JavaBook1Codes;


import java.io.*;
import java.util.Scanner;


public class J06_06 {

	public static void main(String args[]) throws IOException { 

		int Roll[] = new int [5];
		int L = Roll.length;

		Scanner S = new Scanner (System.in);

		for (int i=0; i<L; i++)
		{
			System.out.print("Enter Roll[" +i +"]: ");
			Roll[i] = S.nextInt();
		}

		System.out.println();
		System.out.println("You entered: ");

		for(int i=0; i<5; i++)
		{
			System.out.println("Roll[" +i +"] = " +Roll[i]);
		}

		S.close();

	}	// End of main()
} // End of class


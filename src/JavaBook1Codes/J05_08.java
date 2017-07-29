package JavaBook1Codes;


import java.io.*;
import java.util.Scanner;


public class J05_08 {


	public static void main(String args[]) throws IOException { 


		int N, f0=0, f1=1, f;
		Scanner S = new Scanner (System.in);

		System.out.print("Enter Value of N (>=1): ");
		N= S.nextInt();

		//System.out.println("N = " + N);
		System.out.println("First " + N + " Fibonacci Numbers are:\n");
		for (int i=1; i<=N; i++)
		{
			f=f0+f1;
			System.out.print("" +f +"\t");
			f1=f0;  
			f0=f;
		}  	// End of for 

		S.close();

	}	// End of main()
} // End of class


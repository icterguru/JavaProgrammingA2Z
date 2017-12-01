package chapter05;


import java.io.*;
import java.util.Scanner;


public class J05_07 {


	public static void main(String args[]) throws IOException { 


		int i=0, N=0, Sum=0;

		Scanner S = new Scanner (System.in);

		System.out.print("Enter Value of N (>=1): ");
		N= S.nextInt();
		
		//System.out.println("N = " + N);
		
		System.out.println("N    1+2+3+...+ N");
		System.out.println("-----------------");
		for (i=1; i<=N; i++)
		{
			Sum = Sum +i;
			System.out.println("" +i +"\t\t" +Sum);
		}   // End of for

		S.close();

	}

}

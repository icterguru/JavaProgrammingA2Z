package chapter05;

import java.io.*;
import java.util.Scanner;

public class J05_18 {


	public static void main(String args[]) throws IOException { 

		Scanner scnr = new Scanner(System.in);

		int N=0; 
		long fact = 1;

		Loop1:
			for( ; ; ) {

				System.out.print("Enter a positive integer: ");

				N = scnr.nextInt(); 

				Loop2:
					if(N<0)
					{
						System.out.println("Negative Number not allowed! Enter Again");
						continue Loop1;
					}  
					else if (N==0)
					{
						System.out.print("Factorial of " +N  +" is : " + fact);
						break Loop1; 
					}
					else 
					{
						for (int i=2; i<=N; i++)
							fact = fact * i;
						System.out.println("Factorial of " +N +" is : " + fact);
						break Loop2; 
					}
			}   // End of for (Loop1)


		scnr.close();

	}

}

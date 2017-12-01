package chapter05;

import java.io.*;
import java.util.Scanner;

public class J05_17 {


	public static void main(String args[]) throws IOException { 

		Scanner scnr = new Scanner(System.in);

		int N=0; 

		for( ; ; ) {

			System.out.print("Enter a positive integer: ");

			N = scnr.nextInt(); 
			if(N<=0)
				continue;
			else
				break;
		}   // End of for
		System.out.print("You have entered : " +N);

		scnr.close();

	}

}

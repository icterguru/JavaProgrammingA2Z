package chapter06;

import java.util.Arrays;
import java.util.Scanner;

public class J06_091 {

	public static void main(String args[]) { 

		int Roll[] = new int [5];
		int L = Roll.length;

		Scanner S = new Scanner (System.in);
		try{
			for (int i=0; i<L; i++)
			{
				System.out.print("Enter Roll[" +i +"]: ");
				Roll[i] = S.nextInt();
			}
		}

		catch(Exception E)
		{
			System.out.print("\nError in input! Program terminated.");
			System.exit(0);
		}

		System.out.println();
		System.out.print("\nGiven  List of Roll is: ");
		for(int i=0; i<L; i++)
		{
			System.out.print("" +Roll[i] +"  " );
		}
		
		
		System.out.print("\nSorted List of Roll is: ");
		
		Arrays.sort(Roll);
		
		for (int i: Roll){
			System.out.print(i);
			System.out.print("\t");
			
		}
		
		S.close();

	}	// End of main()
} // End of class


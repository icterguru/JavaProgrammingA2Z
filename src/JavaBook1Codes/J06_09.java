package JavaBook1Codes;

import java.util.Scanner;

public class J06_09 {

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
			System.out.print("" +Roll[i] +"\t" );
		}
		
		
		System.out.print("\nSorted List of Roll is: ");
		
		for(int i=0; i<L; i++)
		{
			for(int j=i+1; j<L; j++)
			{
				if(Roll[i] > Roll[j])
				{	// Interchange Marks
					int  temp = Roll[i];
					Roll[i] = Roll[j];
					Roll[j] = temp;
				}
			}  
		}
		for(int i=0; i<L; i++)
		{
			System.out.print("" +Roll[i] +"\t" );
		}
		S.close();

	}	// End of main()
} // End of class


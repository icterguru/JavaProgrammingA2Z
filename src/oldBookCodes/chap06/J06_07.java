package JavaBook1Codes;


import java.io.*;


public class J06_07 {

	public static void main(String args[]) throws IOException { 

		int   Roll[] = new int [5];
		String  S[] = new String[5];
		for (int i=0; i<5; i++)
		 {
		 System.out.print("Enter Roll[" +i +"]: ");
		 BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
		 S[i] = BR.readLine();   
		 Roll[i] = Integer.parseInt(S[i]); 
		 }
		for(int i=0; i<5; i++)
		  {
		  System.out.print("\nRoll[" +i +"] = " +Roll[i]);
		  }

	}	// End of main()
} // End of class


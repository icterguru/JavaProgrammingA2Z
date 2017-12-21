package JavaBook1Codes;


public class J05_11 {


	public static void main(String args[]) {
		int i=0, j=0; 
		
		for (i=5; i>=1; i--) // outer for
		{
			for (j=1; j<=i; j++) // inner for
			{
				System.out.print( j +"  ");
			}   // End of inner for
			System.out.print("\n");
		}  // End of outer for

	}	// End of main()
} // End of class


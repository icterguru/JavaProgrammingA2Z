package JavaBook1Codes;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class J06_16{
	
	public static void main(String[] args){
		 int Matrix1[][] = new int[3][3];
		 int Matrix2[][] = new int[3][3];
		 int Matrix3[][] = new int[3][3];
		 int i, j, k;

		 String  S1[] = new String[9];
		 String  S2[] = new String[9];
		 int  Temp1[] = new int[9];
		 int  Temp2[] = new int[9];

		 try
		 {
		 System.out.println("\nEnter Elements of Matrix1 (9 integer elements) : ");
		 for (i=0; i<9; i++)
		  {
		  BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
		  S1[i] = BR.readLine();   
		  Temp1[i] = Integer.parseInt(S1[i]); 
		  for (j=0; j<3; j++)
		  {
		  for(k=0; k<3; k++)
		   Matrix1[j][k] = Temp1[i]; 
		  }
		 }
		 System.out.println("\nEnter Elements of Matrix2 (9 integer elements) : ");
		 for (i=0; i<9; i++)
		  {
		  BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
		  S2[i] = BR.readLine();   
		  Temp2[i] = Integer.parseInt(S2[i]); 
		  for (j=0; j<3; j++)
		  {
		  for(k=0; k<3; k++)
		   Matrix2[j][k] = Temp2[i]; 
		  }
		 } 
		}  // end of try block 

		catch(Exception E)
		 {
		 System.out.print("\nError in input! Program terminated.");
		 System.exit(0);
		 }
		 System.out.println("Elements of the Matrix1 is:");
		 for(i=0; i<3; i++)
		  {
		  for(j=0; j<3; j++)
		  System.out.print(Matrix1[i][j]+ "  ");
		  System.out.println();
		  }
		 System.out.println("Elements of the Matrix2 is:");
		 for(i=0; i<3; i++)
		  {
		  for(j=0; j<3; j++)
		  System.out.print(Matrix2[i][j]+ "  ");
		  System.out.println();
		  }
		  for( i=0; i<3; i++)
		  {		// Addition done here
		  for(j=0; j<3; j++)
		   Matrix3[i][j] =  Matrix1[i][j]+Matrix2[i][j];
		  }
		 System.out.println("Addition of the Matrices is: ");
		 for(i=0; i<3; i++)
		  {
		  for(j=0; j<3; j++)
		  System.out.print(Matrix3[i][j]+ "  ");
		  System.out.println();
		  }

	}	// End of main()
} // End of class


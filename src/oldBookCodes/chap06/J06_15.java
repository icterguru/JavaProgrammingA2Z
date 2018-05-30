package JavaBook1Codes;


public class J06_15 {

	public static void main(String[] args) { 

		int Matrix1[][] = {{1,2,3}, {4,5,6}, {7, 8,9}};
		 int Matrix2[][] = {{9,8,7}, {6,5,4}, {3, 2,1}};
		 int Matrix3[][] = new int[3][3];
		 int i, j;

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


package chapter06;


public class J06_13 {

	public static void main(String[] args) { 

		double Mark[][] = new double[3][3];
		Mark[0][0] = 64.5;
		Mark[0][1] = 75;
		Mark[0][2] = 64;

		Mark[1][0] = 74;
		Mark[1][1] = 74;
		Mark[1][2] = 66;

		Mark[2][0] = 67;
		Mark[2][1] = 85.5;
		Mark[2][2] = 34;
		System.out.println("Elements of the Matrix is:");
		
		int L = Mark.length;
		
		for( int i=0; i<L; i++)
		{
			for(int j=0; j<L; j++){
				System.out.print(Mark[i][j]+ "\t");
			}
			System.out.println();
		}


	}	// End of main()
} // End of class


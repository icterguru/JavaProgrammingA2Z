package chapter06;


public class J06_14 {

	public static void main(String[] args) { 

		double Mark[][]={{34.5, 56, 75.5},{55.6, 87, 80},{57, 60, 70}};
		int i, j;
		System.out.println("Elements of the Matrix is:");

		int L = Mark.length;

		for(i=0; i<L; i++)
		{
			for(j=0; j<L; j++){
				System.out.print(Mark[i][j]+ "\t");
			}
			System.out.println();
		}


	}	// End of main()
} // End of class


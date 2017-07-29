package JavaBook1Codes;

public class J06_18{

	final static int Row = 10;
	final static int Col = 10;

	public static void main(String[] args){
		int r, c, i, j;
		int mul[][]= new int [Row][Col];
		System.out.print("\t=========================\n");
		System.out.print("\t\tMULTIPLICATION TABLE\t\n");
		System.out.print("\t=========================\t\n");
		for(j=1; j<=10; j++)
			System.out.print("   " +j);
		System.out.print("\n =============================");
		System.out.println();
		for(i=0; i<Row; i++)
		{
			r = i+1;
			System.out.print(" " +r +"|");
			for(j=0; j<Col; j++)
			{
				c = j+1;
				mul[i][j] = r*c;
				System.out.print("  " +mul[i][j]);
			}
			System.out.println();
		}

	}	// End of main()
} // End of class


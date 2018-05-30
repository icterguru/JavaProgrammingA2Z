package JavaBook1Codes;


public class J05_12 {


	public static void main(String args[]) {
		int i, j;
		for( i=5; i>=1; i--)
		{
			for( j=i; j>=1; j--)  // Inner for loop
			{
				System.out.print(" P(" + i + "," + j + ")=" );
				System.out.print(P(i, j) + "   ");
			}
			System.out.println();
		}
	} 
	
	static long P(int x, int y)
	{
		return F(x)/F(x-y);
	}
	static long F(int z)
	{
		long f = 1;
		while(z>1)
		{ 
			f = f * z;
			z--;
		}  
		return f;

	}	// End of main()
} // End of class


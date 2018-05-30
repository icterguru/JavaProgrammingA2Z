package JavaBook1Codes;


public class J05_13 {


	public static void main(String args[]) {
		for(int i=0; i<=8; i++)
		{
			for(int j=0; j<=i; j++)
				System.out.print(C(i, j) + "\t");
			System.out.println();
		}
	} 
	static long C(int x, int y)
	{
		return P(x, y)/F(y);
	}
	static long P(int x, int y)
	{
		long p = 1;
		for(int i = 0 ; i<y; i++)
		{ 
			p =p*x;
			x--;
		}  
		return p;
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


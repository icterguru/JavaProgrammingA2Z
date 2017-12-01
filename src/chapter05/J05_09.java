package chapter05;


public class J05_09 {


	public static void main(String args[]) {
			int i=0, j=0; 
			System.out.println("Series of prime number upto 25 is:\n");
			for (i=2; i<=25; i++)
			{
				for (j=2; j<=i; j++)
				{
					if(i%j==0)
						break;
				}  // End of inner for
				if(i==j)
					System.out.print("" +i +"  ");
			}   // End of outer for
		}	// End of main()
	} // End of class


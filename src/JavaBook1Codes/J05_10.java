package JavaBook1Codes;


public class J05_10 {


	public static void main(String args[]) {
		int isprime=0; 
		System.out.println("Series of prime number upto 25 is:\n");
		Loop1: 
			for (int x=2; ; x++)
			{
				if(x>=25)
					break Loop1;
				isprime = 1;
				for (int d =2; d<x; d++)
					if(x % d ==0)
						isprime =0;
				if(isprime !=0)
					System.out.print("" +x +"  ");
			}   // End of  for
	}	// End of main()
} // End of class


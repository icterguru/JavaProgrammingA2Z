package chapter06;


public class J06_11 {

	public static void main(String args[]) { 

		int i;
		 final int  MAX = 10; 
		 int   fibo[] = new int [MAX];
		 fibo[0]=1;
		 fibo[1]=1;
		 System.out.println("\nFirst 10 fibonacci numbers are: ");
		 
		 for(i=2;i<MAX;i++)
		  fibo[i]=fibo[i-2]+fibo[i-1];
		   for(i=0;i<MAX;i++)
		    System.out.print(fibo[i] + "\t");

	}	// End of main()
} // End of class


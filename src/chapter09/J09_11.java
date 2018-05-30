package chapter09;
/* J09_11.java */
/*Example of Recursive Method */
import java.io.*;

class Factorial {
	
	int fact(int n)
	{
		int result;
		if (n<=0)
			return 1;
		else{
			result = n * fact(n-1);  // recursion makes here
			return result ;
		}
	}
}

public class J09_11 {
	public static void main(String args[]) throws IOException {
		Factorial f = new Factorial();
		int N=0; 
		String S;
		Loop1:
			for( ; ; ) {
				BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
				System.out.print("\nEnter a positive integer: ");
				S = BR.readLine();  
				N = Integer.parseInt(S); 
				Loop2:

					if(N==-99){
						System.out.println("You wished to exit. Thank you!");
						System.exit (0);
					}
					else if(N<0){
						System.out.println("Negative Number not allowed! Enter Again");
						continue Loop1;
					}  
					else{
						System.out.print("Factorial of "+N +" is : "+f.fact(N));
						break Loop2; 
					}
			}   // End of for (Loop1)
	}  
}  

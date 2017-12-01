package test_programs;
/* J06_08.java */
/*  Assigning value to array elements through keyboard */
import java.util.Scanner;
public class KeyboardInput_Ex1 {
public static void main(String mokter[]) { 
	
	int Roll[] = new int [5];
	
	int L = Roll.length;
	
	Scanner S = new Scanner (System.in);
	try{
	for (int i=0; i< Roll.length; i++){
	System.out.print("Enter Roll[" +i +"]: ");
	Roll[i] = S.nextInt();
	}
	}
	catch(Exception E){
	System.out.print("\nError in input! Program terminated.");
	System.exit(0);
	}
	System.out.println();
	System.out.println("You entered: ");

	for(int i=0; i< Roll.length; i++)	{
	System.out.println("Roll[" +i +"] = " +Roll[i]);
	}

	S.close();

  }	// End of main()
} // End of class

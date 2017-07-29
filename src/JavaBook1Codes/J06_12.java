package JavaBook1Codes;
import java.util.Scanner;

public class J06_12 {

	public static void main(String[] args) { 

		char Base16[] ={'0','1','2','3','4','5','6','7','8','9','A','B', 'C','D','E','F'};
		int NumtoConvert=0;
		int ConvertedNum[] = new int[64];
		int Index, Base=0, NextDigit;
		Index =0; 
		Scanner S = new Scanner(System.in);
				
		try 
		{
			System.out.print("Enter a Decimal Number to be Converted: ");
			
			NumtoConvert = S.nextInt(); 
		
			BB: 
				for(; ;)
				{
					System.out.print("Enter Base for Conversion (2 or 8 or 10 or 16): ");
					 
					Base = S.nextInt(); 
					
					if ((Base!=2)&&(Base!=8)&&(Base!=10)&&(Base!=16))
						continue BB;
					else
						break BB;
				}
		}
		catch(Exception E)
		{
			System.out.print("\nError in input! Program terminated.");
			System.exit(0);
		}

		while(NumtoConvert !=0)
		{
			ConvertedNum[Index]= NumtoConvert % Base;
			++Index;
			NumtoConvert = NumtoConvert/Base;
		}
		Index = Index-1;
		System.out.print("\nThe Equivalent Number in Base " +Base + " is: ");

		while(Index>=0)
		{
			NextDigit=ConvertedNum[Index];
			System.out.print(Base16[NextDigit]);
			--Index;
		}
		System.out.println();
		
		S.close();
		
	}	// End of main()
} // End of class


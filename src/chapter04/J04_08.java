package chapter04;

public class J04_08 {

	public static void main(String[] args)
	{
		int Op1=5, Op2=10;
		int BitwiseOR, BitwiseAND;
		int LSValue, RSValue, RSZeroFill ;
		BitwiseOR= Op1 | Op2;
		BitwiseAND= Op1 & Op2;
		System.out.println("Bitwise OR of " +Op1 +" and " +Op2 +" is : " +BitwiseOR);
		System.out.println("Bitwise AND of " +Op1 +" and " +Op2 +" is : " +BitwiseAND);

		LSValue = Op2 << 2;
		System.out.println("2 times left shift of " +Op2 +" is: " +LSValue);

		RSValue = Op2 >> 2;
		System.out.println("2 time right shift of " +Op2 +" is: " +RSValue);

		RSZeroFill = Op2 >>> 2;
		System.out.println("2 times rigrt shift with zero fill of " +Op2 +" is: " +RSZeroFill);
	}

}

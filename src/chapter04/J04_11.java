package chapter04;

public class J04_11 {

	public static void main(String args[])
	{
		int a=5, b=10, c=15, d=20;
		int x, y;
		x = a * b -c ; // Implies (5*10) - 15, Not 5 * (10-15)    
		y = a - d / b + c ; // Implies 5 - (20 / 10) + 15     
		System.out.println("a = " +a + "\t b = " +b);
		System.out.println("c = " +c + "\t d = " +d);
		System.out.println("a * b - c = " +x);
		System.out.println("a - d / b + c = " +y);
	}

}

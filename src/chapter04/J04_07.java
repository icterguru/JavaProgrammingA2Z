package chapter04;

public class J04_07 {

	public static void main(String []args)
	{
		boolean a=true, b=true, c=false, Result;
		System.out.println("a = " + a + "\t b = " + b + "\t c = " +c);
		Result = a && b || c;
		System.out.println("a && b || c = " + Result);
		Result = a || b && c;
		System.out.println("a || b && c = " + Result);
		Result = a && !a;
		System.out.println("a && !a = " + Result);
		Result = a || !a;
		System.out.println("a || !a = " + Result);
		Result = c && !c;
		System.out.println("c && !c = " + Result);
		Result = c || !c;
		System.out.println("c || !c = " + Result);
	}

}

package chapter04;

public class J04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 10, b = 15, c = 20;
	
	float d; int result; 
	d = (float) b/ (float) a;
	
	System.out.println("a  =  " + a);
	System.out.println("b  =  " + b);
	System.out.println("c  =  " + c);

	System.out.println("Division: b / a =  " + d);
	
	result = b % a;
	System.out.println("Modulo: b % a =  " + result);
	
	result = a * b + c;
	System.out.println("Expression: a * b + c =  " + result);
	
	result = a + b * c;
	System.out.println("Expression: a + b * c =  " + result);
	
		
	}

}

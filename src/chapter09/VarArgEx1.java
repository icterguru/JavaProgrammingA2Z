package chapter09;
//  VarArgEx1.java

public class VarArgEx1 {

	static int sum(int... marks) {
		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}
		return total;
	}

	static void display(String... values){
		for(String s:values){
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		display();//zero argument
		display("Hello");//one argument
		display("How","How are","How are you","How are you?");
//four arguments

		//invoking with variable arguments
System.out.println("Sum of arguments of sum(0) is: " + sum(0));
System.out.println("Sum of arguments of sum(5) is: " + sum(5));
System.out.println("Sum of arguments of sum(5, 10) is: " + sum(5, 10));
System.out.println("Sum of arguments of sum(5, 10, 15) is: " + sum(5, 10, 15));

	//same invocation using an array
		//		int arr[] = {2,3};
		//		System.out.println(sum(1, arr));


	}
}

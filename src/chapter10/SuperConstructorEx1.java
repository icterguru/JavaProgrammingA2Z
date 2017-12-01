package chapter10;
// SuperConstructorEx1.java
// Usgae of Usage of super() and this() Constructors
class Employee
{
	Employee()
	{
		System.out.println("Employee class Constructor");
	}
}
class HR extends Employee
{
	HR()
	{
	super(); //will invoke or call parent class constructor
	System.out.println("HR class Constructor");
	}
}

public class SuperConstructorEx1 {
	public static void main(String[] args)
	{
	HR obj=new HR();
	}
}

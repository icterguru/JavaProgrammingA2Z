package chapter11;
// ObjectTypeCastingEx2.java

class BaseClass
{
	public void callMe() //Base class method
	{
		System.out.println ("Invokes the BaseClass::callMe() method ");
	}
}
class DerivedClass extends BaseClass
{

	public void callMe() //Derived Class method
	{
		System.out.println ("Invokes the DerivedClass::callMe() method");
	}

	public void callMe2() //Derived Class method
	{
		System.out.println ("Invokes the DerivedClass::callMe2() method");
	}

}

public class ObjectTypeCastingEx2{
	public static void main (String args []) {

	// DerivedClass reference and DerivedClass object
	DerivedClass obj1 = new DerivedClass();
	//Calls the method from DerivedClass class
	System.out.println("Automatic Upcast ....");
	obj1.callMe(); // Automatic Upcasting
	// Invokes the DerivedClass::callMe() method
	((BaseClass)obj1).callMe(); // Upcasting, but....
	// Will not invokes the BaseClass::callMe() method
obj1.callMe2(); // Invokes the DerivedClass::callMe2() method
	System.out.println();

	// BaseClass reference and BaseClass object
	BaseClass obj2 = new BaseClass();
	// Calls the method from BaseClass class
	obj2.callMe(); // Invokes the BaseClass::callMe() method
	System.out.println("Tried to Downcast but.... creates a Runtime Error");
	// ((DerivedClass)obj2).callMe(); // Tried for Downcasting,
	// Okay at compile time but creates Run-time error

	// BaseClass reference but DerivedClass object
	BaseClass obj3 = new DerivedClass();
	//Calls the method from DerivedClass::callMe() class
	System.out.println("\nNo effect of casting....");
	obj3.callMe(); 	// Invokes the DerivedClass::callMe() method
	((DerivedClass)obj3).callMe();  // Invokes the DerivedClass::callMe() method
	((BaseClass)obj3).callMe();  // Still invokes the DerivedClass::callMe()

	System.out.println("Please look at here.........................");

	// obj3.callMe2();  // Will cause following compile time Error:
	// 'The method callMe2() is undefined for the type BaseClass'

	((DerivedClass)obj3).callMe2(); // DownCasting is made here
	// Invokes the DerivedClass::callMe2() method

	System.out.println("DownCasting is made in the above line .......");

	}
}

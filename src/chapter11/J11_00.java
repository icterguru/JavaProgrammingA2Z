package chapter11;
/* J11_00.java */

/* Illustrating Effects of Inheritance	*/
class Student extends Object{   // Base class
	int  Roll;  			// friendly by default
	String Name= new String();  // friendly by default
}
class Result extends Student  {
	float Mark;
	void setData() {
		Roll = 101;	  // Accessing inherited member
		Name = "Masud";  // Accessing inherited member
		Mark = 75.50f;   // Accessing own member
	}
	void display() {
		System.out.println("Roll is : " +Roll);
		// Accessing inherited member
		System.out.println("Name is : " +Name);
		// Accessing inherited member
		System.out.println("Mark is : " +Mark) ;
		// Accessing own member
	}
}

public class J11_00{
	public static void main(String... args) {
	Student S1 = new Student();
	// Creating Base-class object

	System.out.println("Accessing Base-Class Variables.....");
	S1.Name = "Mosaddek Mahdi";
	S1.Roll = 101;

	System.out.println("S1.Name : " + S1.Name);
	System.out.println("S1.Roll : " + S1.Roll);

	System.out.println();

	System.out.println("Accessing Derived-Class Variables.....");
	Result R1 = new Result();
	// Creating Derived-class object
	R1.Name = "Muhaimin Munim";
	R1.Roll = 102;
	R1.Mark = 99.0f;

	System.out.println("R1.Name : " + R1.Name);
	System.out.println("R1.Roll : " + R1.Roll);
	System.out.println("R1.Name : " + R1.Name);

	System.out.println("\nAccessing Derived-Class Methods.....");
	R1.setData();
	R1.display();

System.out.println();

//S1.setData(); // Shows following Compile-time Error
		// The method setData() is undefined for the type Student

	// S1.display(); // Shows following Compile-time Error
		// The method display() is undefined for the type Student


	}
}


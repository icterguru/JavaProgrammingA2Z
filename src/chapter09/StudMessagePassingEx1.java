package chapter09;
/* MessagePassingEx1.java    */
/* MessagePassing */

class Student {
	public int  Roll;
	protected String Name;
	private float Mark;

	void setData(int Roll, String Name, float Mark) {
		this.Roll = Roll ;
		this.Name = Name;
		this.Mark = Mark ;
	}

	void display(){
		System.out.println("Roll is : " + Roll);
		System.out.println("Name is : " + Name);
		System.out.println("Mark is : " + Mark) ;	}
}


public class StudMessagePassingEx1 {
	public static void main(String args[]){
	Student S1 = new Student();	// Creates object S1
	Student S2 = new Student();	// Creates object S2

	S1.setData(101, "Mahdi", 100);  // Invokes S1 objects'a setData() method
	S2.setData(102, "Munim", 102);  // Invokes S2 objects'a setData() method

	S1.display(); 		// Invokes S1 objects'a display() method
	System.out.println();	// Invokes S1 objects'a display() method
	S2.display();

	 if (S1.Roll == S2.Roll) // If (S1.Roll == S2.Roll) is true
		 System.out.println("Mahdi and Munim have same roll");
	 else // If (S1.Roll != S2.Roll) is false
		 System.out.println("Mahdi and Munim do not have same roll");

	 if (S1 == S2) // If (S1 == S2) is true
		 System.out.println("The students S1 and S2 are same ");
	 else // If (S1 != S2) is false
		 System.out.println("The students S1 and S2 are NOT same ");

	}
}

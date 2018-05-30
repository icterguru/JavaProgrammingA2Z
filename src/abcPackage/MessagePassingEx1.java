package abcPackage;

/* MessagePassingEx1.java    */
/* MessagePassing */


public class MessagePassingEx1 {
	
	public static void main(String args[]){
	
	 Student polash = new Student();
	  
	 polash.setData(302, "Polash", 59.50f);
	 polash.display();
	 
	 Student shimul = new Student();
	 shimul.setData(102, "Simul", 95.50f);
	 shimul.display();
	 
	 System.out.println("-  --- - - - -  -- ");
	 
	 
	Student S1 = new Student();	// Creates object S1
	Student S2 = new Student();	// Creates object S2

	S1.setData(101, "Mahdi", 100);  // Invokes S1 objects'a setData() method
	S2.setData(101, "Mahdi", 100);  // Invokes S2 objects'a setData() method

	S1.display(); 		// Invokes S1 objects'a display() method
	
	System.out.println();	// Invokes S1 objects'a display() method
	S2.display();

	System.out.println("====================================== ");
	
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


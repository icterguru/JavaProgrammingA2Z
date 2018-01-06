package abcPackage;


public class Student {
	int  Roll; 
	String Name;  
	float Mark;

	 Student()  	// Default Constructor
	   {
	   Roll = 318;
	   Name = "Masud"; 
	   Mark = 85.5F;
	  }
	 
	public Student(int Roll, String Name, float Mark)  // Argumented Constructor
	{
		this.Roll = Roll;
		this.Name = Name; 
		this.Mark = Mark;

	}

	Student(Student S)	// Copy Constructor
	  {     
	   Roll = S.Roll ; 
	   Name = S.Name ; 
	   Mark = S.Mark;
	  }   	// Copy Constructor Defined

	void display(){
		System.out.println("Roll is : " +Roll);                 
		System.out.println("Name is : " +Name);
		System.out.println("Mark is : " +Mark);
	}
}

package abcPackage;

/*public class Student {
	public int  Roll;
	protected String Name;
	private float Mark;

	void setData(int Roll, String Name, float Mark) {
		this.Roll = Roll ;
		this.Name = Name;
		this.Mark = Mark ;
		
	}

	void display(){
		System.out.println("Roll : " + this.Roll );
		System.out.println("Name : " + this.Name);
		System.out.println("Mark : " + this.Mark) ;	
		}
}

*/

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


		void setData(int Roll, String Name, float Mark) {
		this.Roll = Roll ;
		this.Name = Name;
		this.Mark = Mark ;
		
	}

	void display(){
		System.out.println("Roll : " + this.Roll );
		System.out.println("Name : " + this.Name);
		System.out.println("Mark : " + this.Mark) ;	
		}
}

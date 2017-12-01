package chapter09;
/* DefaultArgMethodEx1.java    */
/* ERROR in using Default Argumented Method */
class Student {
	private int Roll;
	protected String Name;
	private float Mark;
	void getData( String S, float M, int  Roll =101) {
		Roll = R ;
		Name = S;
		Mark =M ;
	}
	void display(){
		System.out.println("Roll is : " +Roll);
		System.out.println("Name is : " +Name);
		System.out.println("Mark is : " +Mark) ;
	}
}

public class DefaultArgMethodEx1 {
	public static void main(String args[]){
		Student S = new Student();	// Creating object
		S.getData("Ritu Moni", 85);
		// ERROR in using Default Argument
		S.display();
	}
}

Eclipse Error and Suggestion:	 



 


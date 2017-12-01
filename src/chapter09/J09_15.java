package chapter09;
/* J09_15.java    */
/* Example of Argumented Method */
class Studentss {
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
		System.out.println("Mark is : " + Mark) ;
	}
}


public class J09_15 {
	public static void main(String args[]){
		Studentss S = new Studentss();	// Creating object
		S.setData(101, "Ritu", 85);  // Calling Argumented Method
		S.display();
	}
}

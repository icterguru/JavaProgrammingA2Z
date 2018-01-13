package chapter00;

public class Student {
	
	public int  roll;

	public String name;

	public float mark;
	
	public int getRoll() {  // get ter
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark() {
		return mark;
	}
	
	public void setMark(float mark) {
		this.mark = mark;
	}
	
		
	
/*
	void setData(int Roll, String Name, float Mark) {
		this.Roll = Roll;
		this.Name = Name;
		this.Mark = Mark ;
	}

	void display(){
		System.out.println("Roll is : " + this.Roll);
		System.out.println("Name is : " + this.Name);
		System.out.println("Mark is : " + this.Mark) ;	
		}*/
}
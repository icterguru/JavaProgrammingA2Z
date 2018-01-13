package chapter00;
/* MessagePassingEx1.java    */
/* MessagePassing */


public class MessagePassingEx1 {
	public static void main(String args[]){
	
	Student shakil = new Student();
	Student nazrul = new Student();
	
	
//	System.out.println("Shakil's Roll = " + shakil.Roll);
System.out.println("-----------------------------------");

//	shakil.setData(107, "Shakil" , 85.50f);

//	shakil.Roll = 105;

	shakil.setRoll(105);
	
	System.out.println("Shakil's Roll = " + shakil.getRoll());
	shakil.setName("Shakil Ahmed");
	System.out.println("Shakil's Name = " + shakil.getName());
	
	shakil.setMark(98.50f);
	System.out.println("Shakil's marks = " + shakil.getMark());
	
	}
}

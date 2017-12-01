package chapter10;

class Student10_06 {
  int  Roll;
  String Name;
  float Mark;
  Student10_06(int Roll, String Name, float Mark)  // Argumented Constructor
   {
   this.Roll = Roll;   // use of this keyword
   this.Name = Name;  // use of this keyword
   this.Mark = Mark; // use of this keyword
   }
  void display() { 	// Normal Method
   System.out.println("Roll is : " +Roll);
   System.out.println("Name is : " +Name);
   System.out.println("Mark is : " +Mark);
   }

  }
 public class J10_06{
public static void main(String args[]){
	Student10_06 S1 = new Student10_06(101, "Mahdi",  85);
// Creating object and Calling Constructor Method
 S1.display();	// Calling Normal public Method

System.out.println("\nWith a different object.... ");
Student10_06 S2 = new Student10_06(202, "Munim",  95);
//Creating object and Calling Constructor Method
S2.display();	// Calling Normal public Method


 }
}

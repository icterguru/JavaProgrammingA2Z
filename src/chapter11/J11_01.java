package chapter11;
/* J11_01.java */
/* Inheriting friendly (default) public members	*/
class Student{   // Base class
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
 public class J11_01{
public static void main(String args[]) {
 Result R = new Result();	// Creating object
 R.setData();
 R.display();
 }
} 

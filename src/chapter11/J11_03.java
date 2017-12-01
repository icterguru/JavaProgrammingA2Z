package chapter11;
/* J11_03.java  */
/* Inheriting protected members */
class Student{   // Base class
 protected int  Roll;
	// protected by declaration
 protected String Name= new String();
	// protected by declaration
  }  
class Result extends Student{
  float Mark;  	
  void setData(){
   Roll = 101;	  // Accessing inherited member
   Name = "Masud";  // Accessing inherited member
   Mark = 75.50f;   // Accessing own member
   }
  }  
 public class J11_03{
public static void main(String args[]) {
 Result R = new Result();	// Creating object
 R.setData();
 System.out.println("Roll is : " +R.Roll);                 
		// Accessing inherited member
 System.out.println("Name is : " +R.Name);
		// Accessing inherited member
 System.out.println("Mark is : " +R.Mark) ;
		// Accessing own member
 }
} 

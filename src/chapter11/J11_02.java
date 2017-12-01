package chapter11;
/* J11_02.java */
/* Inheriting public members	*/
class Student{   // Base class
 public int  Roll; 
 public String;  // public by declaration
  }  
class Result extends Student {
  float Mark;  	
  void setData(){
   Roll = 101;	  // Accessing inherited member
   Name = "Masud";  // Accessing inherited member
   Mark = 75.50f;   // Accessing own member
   }
  }  
 public class J11_02{
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

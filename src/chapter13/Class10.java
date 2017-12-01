/* C:\javacode\Chap13\Pack10\Class10.java */
package chapter13;
class Student   // Base class
  {
  int    Roll; 
  String Name;
  }  

public class Class10 extends Student
  {
  float Mark;  	
  public  void setData()
   {
    Roll = 101;	  // Accessing inherited member
    Name = "Masud";  // Accessing inherited member
    Mark = 75.50f;   // Accessing own member
   }

  public void display()
   {
    System.out.println("Roll is : " +Roll);                 
		// Accessing inherited member
    System.out.println("Name is : " +Name);
		// Accessing inherited member
    System.out.println("Mark is : " +Mark) ;
		// Accessing own member
   }
  }  

package chapter10;
/* J10_03.java    */
/* Using Default Constructor Method	*/

class Student {
  int  Roll; 
  String Name;  
  float Mark;
  
  public Student(){  // Constructor Function
   Roll = 101;
   Name = "Masud"; 
   Mark = 75.5f;
   
   System.out.println("Roll is : " +Roll);                 
   System.out.println("Name is : " +Name);
   System.out.println("Mark is : " +Mark);
  

  }
  
 }  

public class J10_03 {
public static void main(String args[]) {
 
	Student s = new Student();

// Creating object and Calling Constructor Method
 }
} 

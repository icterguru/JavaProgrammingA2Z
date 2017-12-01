package chapter11;
/* J11_09.java*/
/* Implementing Multilevel Inheritance*/
class Student {
  int  Roll; // publice member; inheritable
  String Name= new String();
  void setData() // publice member; inheritable
   {
   Roll = 101;
   Name = "Masud"; 
   }
  void display()  // publice member; inheritable
   {
   System.out.println("Inside Student Class...") ;
   System.out.println("Roll is : " +Roll);                 
   System.out.println("Name is : " +Name);
   }
  }  

class Exam extends Student {
  float Mark;	// publice member; inheritable
  void setData(){	// publice member; inheritable
   Mark = 75.50f;
   }
  void display(){	// publice member; inheritable
   System.out.println("Inside Exam  Class...") ;
   System.out.println("Mark is : " +Mark) ;
   }
  }  
class Result extends Exam {
  Student S = new Student();	
		// S is an object of Student class
  Exam    E = new Exam();	
		// E is an object of Exam class

  void setData(){
   S.setData();
   E.setData();
   }
  void display(){
   S.display();
   E.display();
   }
  }  

 public class J11_09{
public static void main(String args[]) {
 Result R = new Result();	// Creating object
		// R is an object of Result class
 R.setData();
 R.display();
 }
} 

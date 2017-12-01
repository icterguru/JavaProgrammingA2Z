package chapter11;
/* J11_10.java  */
/* Implementing hierarchical inheritance*/
class Student  {
   //  int  Roll;	// Inheritable
   String Name= new String(); 
  void setName(){
   Name = "Masud"; 
   System.out.println("Name is : " +Name);
   }
  }  
class Academic extends Student{
  int Roll; 
  void setRoll(){
   Roll = 101;	
   System.out.println("Roll is : " +Roll); 
   }
 }
class Result extends Student	//Extending Student class
  {
  float Mark;
  void setMark() {
   Mark = 75.50f;
   System.out.println("Mark is : " +Mark) ;
   }
  }  

 public class J11_10{
public static void main(String args[]) {
 Academic A = new Academic();   // A is an object of Academic Class
 A.setRoll();
 Student S = new Student();    // S is an object of Student Class
 S.setName();
 Result R = new Result(); 
      // R is an object of Result Class
 R.setMark();
 }
} 

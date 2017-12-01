package chapter11;
/* J11_12.java */
/* AMBIGUITY in selecting Overridden Method (ERROR IN RUNNING) */
class Student{
  private int  Roll; 
  private String Name= new String();
 void setData() {
   Roll = 101;	  
   Name = "Masud";  
   }
  void display(){
   System.out.println("Roll is : " +Roll);                 
   System.out.println("Name is : " +Name);
   }
  }  
class Result extends Student  // Extending Student class
  {
  float Mark;
  void setData() {
   setData();  // Ambiguity Makes Here
  // Should be super.setData();
   Mark = 75.50f;
   }
  void display() {
   display(); //  Ambiguity Makes Here
  // Should be super.display();
   System.out.println("Mark is : " +Mark) ;
   }
  }  

 public class J11_12{
public static void main(String args[]){
 Result R = new Result();	// Creating object
 R.setData();
 R.display();
 }
}

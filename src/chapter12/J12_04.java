package chapter12;
/* J12_04.java */
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

   super.setData(); // setData();  will make an ambiguity
   Mark = 75.50f;
   }

  void display() {
	  super.display(); // display();  will make an ambiguity
   System.out.println("Mark is : " +Mark) ;
   }
  }
 public class J12_04{
public static void main(String args[]){
 Result R = new Result();	// Creating object
 R.setData();
 R.display();
 }
}

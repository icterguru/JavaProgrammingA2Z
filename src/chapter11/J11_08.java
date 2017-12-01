package chapter11;
/* J11_08.java*/
/* Implementing Single Inheritance*/

class Student {
  int  Roll;
  String Name= new String();
  }  
class Result extends Student {
  float Mark;
  void setData(){
   Roll = 101;
   Name = "Masud"; 
   Mark = 75.50f;
   }
  void display() {
   System.out.println("Roll is : " +Roll);                 
   System.out.println("Name is : " +Name);
   System.out.println("Mark is : " +Mark) ;
   }
  }  
 public class J11_08 {
public static void main(String args[]){
 Result R = new Result();	// Creating object
 R.setData();
 R.display();
 }
} 

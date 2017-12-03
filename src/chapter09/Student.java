package chapter09;
public class Student {
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

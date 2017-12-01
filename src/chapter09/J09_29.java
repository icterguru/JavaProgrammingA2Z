package chapter09;
/* J09_29.java */
/* Implementing Array of Objects */
class Student {
  int  Roll;  
  String Name; 
  double Mark;
  Student(int R, String N, double M)
  {
   Roll = R;
   Name = N;
   Mark = M;   
  }
  void display()  
   {
   System.out.println(" Roll is : " +Roll);               
   System.out.println(" Name is : " +Name);
   System.out.println(" Mark is : " +Mark);
   }
  }  

 public class J09_29 {
public static void main(String args[]){					         
 Student S[] = new Student[10];
		// S is an object array of Student class
 S[0] = new Student(101, "Mira   ", 70.5);
 S[1] = new Student(102, "Masud  ", 75.5);
 S[2] = new Student(103, "Monira ", 85.5);
 S[3] = new Student(104, "Monirul", 80.5);
 for (int i =0; i<=3; i++)
  {
  System.out.println("\nRecord of S[" + i +"] is : " +i);
  S[i].display();   
  }
 }
} 

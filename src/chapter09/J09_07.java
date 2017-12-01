package chapter09;
/*	J09_07.java  */
/* Method call that effects on return value*/ 
class Student{
  float Mark1, Mark2, Tutorial;
  float Total, GTotal;
 float setMark(float M1, float M2)
  {
  Mark1 = M1;
  Mark2 = M2;
  Total = Mark1 + Mark2;
  return(Total);
  }
 void display()  
  {
  Tutorial =10;
  GTotal = Tutorial + setMark(25, 45);
  System.out.print("\nTutorial Mark = " +Tutorial);
  System.out.print("\nMark1 = " +Mark1);
  System.out.print("\nMark2 = " +Mark2);
  System.out.print("\nGrand Total = " +GTotal);
  }
 }  
 public class J09_07{
public static void main(String args[])// throws  IOException
 {					         
 Student S = new Student();	 
		// S is an object array of Student class
 S.display(); // Method Call
 }
} 

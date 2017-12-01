package chapter11;
/* 	J11_15.java   */
/* 	Inheriting Constructor and Finalize Methods */
class Student{
String s;
Student(String c)  // Constructor Method
 {
 s = c;
 System.out.println("Student  Constructor " + s);
 }
protected void finalize() // Finalize Mathod
 {
 System.out.println("Student Finalize " + s);
 }
} 

class Exam {
Exam() {
 Student p = new Student("is alive");
 System.out.println("Calling Exam Constructor");
 }
protected void finalize()  // Finalize Mathod
 {
 System.out.println("Calling Exam Finalize");
 }
}

class Result extends Exam    
{
Result() 
 {
 System.out.println("Calling Result Constructor");
 }
protected void finalize() 
{
 System.out.println("Calling Result Finalize");
}
}

 public class J11_15{
public static void main(String args[]) {
new Result(); // Calls Constructors
System.out.println("After Calling Constructors... ...");
System.gc();    // Run Garbage Collector  
System.runFinalization();  // Calls Finalizes  
}
} 

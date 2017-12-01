package chapter10;
/* J10_08.java       */
/*  Using Multiple Constructor Methods  */

class Student
  {
  int  Roll;	
  String Name;
  float Mark;	

  Student()  	// Default Constructor
   {
   Roll = 318;
   Name = "Masud"; 
   Mark = 85.5F;
  }

  Student(int R, String N, float M)  // Argumented Constructor
   {
   Roll = R;
   Name = N; 
   Mark = M;
   }
Student(Student S)	// Copy Constructor
  {     
   Roll = S.Roll ; 
   Name = S.Name ; 
   Mark = S.Mark;
  }   	// Copy Constructor Defined

 void display()
   {
   System.out.println("Roll is : " +Roll);                 
   System.out.println("Name is : " +Name);
   System.out.println("Mark is : " +Mark);
   }

  }  

 public class J10_08{
public static void main(String args[]) {
  Student	S1 = new Student(); 	// Default Constructor Invoked
   System.out.println("Record of S1 : " );
  S1.display();
  System.out.println();
  Student S2 = new Student(101, "Monirul", 80); 
      // Argumented Constructor Invoked
  System.out.println("Record of S2 : " );
  S2.display();
  Student   S3 = new Student(S2);  //  Copy Constructor Invoked
  System.out.println();
  System.out.println("Record of S3 : " );
  S3.display();  // displays Record of S2

  S3 = S1;  //  Object S3 is initialized by S1
  System.out.println();
  System.out.println("Now Record of S3 : " );
  S3.display();	// displays Record of S2
 }
}

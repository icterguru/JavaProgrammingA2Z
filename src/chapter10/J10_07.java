package chapter10;
/*	J10_07.java    */
/* using Copy Constructor Method   */

class Student10_07{
  int  Roll;	
  String Name;
  float Mark;	

  Student10_07(int R, String N, float M)   // Argumented Constructor
   {
   Roll = R;
   Name = N; 
   Mark = M;
   }
  Student10_07(Student10_07 S)  // Copy Constructor
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

 public class J10_07{
public static void main(String args[]){
	Student10_07	S1 = new Student10_07(); 	// Default Constructor Invoked
   System.out.println("Record of S1 : " );
  S1.display();
  System.out.println();
  Student10_07   S2 = new Student10_07(S1);  //  Copy Constructor Invoked
  System.out.println();
  System.out.println("Record of S2 : " );
  S2.display();  // displays Record of S1
  System.out.println("\nBoth are Same ... ... ... " );

 }
}

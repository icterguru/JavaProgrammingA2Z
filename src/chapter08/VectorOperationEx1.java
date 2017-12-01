package chapter08;
/* VectorOperationEx1.java */
/* Example of Vector Operations using Class and Objects  */
import java.util.*;
class Student{
long Roll;
String Name;
double Mark;
Student NextStudent;
static Student StudentList;
static void paint()
{
Student S = StudentList;
if(S == null)
System.out.println("There is no student in the list");
else 
 do{
   System.out.println(S);
   S = S.NextStudent;
   }while(S!=null);
}
Student (long Roll , String Name , double Mark)
{
this.Roll = Roll;
this.Name = Name;
this.Mark = Mark;
this.NextStudent = StudentList;
StudentList = this;
}
public String toString(){
return new String(Roll  + "\t" +Name + "\t" +Mark + "\n");
}
}
 public class VectorOperationEx1 {
public static void main(String args[])
 {
  Vector V = new Vector();
  V.addElement(new Student(18, "Masud", 75.5));
  V.addElement(new Student(51, "Monira",85.0));

  System.out.println("List of Students : ");
  System.out.println("Roll: \t Name: \t Mark: ");
  for (int i=0; i<3; i++)
   {
    System.out.print(V.elementAt(i)); 
// displaying i-th Element.
   }
  V.insertElementAt(new Student(21, "Mira",80), 1);
       //Inserting a new Element at Position 1 
  System.out.println("\nAfter Inserting Element at Position 1 : ");
  System.out.println("List of Students : ");
  System.out.println("Roll: \t Name: \t Mark: ");
 		// displaying Modified Vector Elements.
  for (int i=0; i<3; i++)
   {
    System.out.print(V.elementAt(i)); 
// displaying i-th Element.
   }

  V.removeElementAt(0);		
    //Removing Element of Position 0
  System.out.println("\nAfter Removing Element of Position 0 : ");
  System.out.println("List of Students : ");
  System.out.println("Roll: \t Name: \t Mark: ");
   for (int i=0; i<3; i++)
   {
    System.out.print(V.elementAt(i)); // displaying i-th Element.
   }
 }
}

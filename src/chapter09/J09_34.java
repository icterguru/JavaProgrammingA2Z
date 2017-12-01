package chapter09;
/* J09_34.java */
/* Implementing Array of Object using Vector */
import java.util.*;
class Student{
int    Roll;
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
Student (int Roll , String Name , double Mark)
{
this.Roll = Roll;
this.Name = Name;
this.Mark = Mark;
this.NextStudent = StudentList;
StudentList = this;
}
public String toString()
{
return new String(Roll  + "\t" +Name + "\t" +Mark + "\n");
}
}
 public class J09_34{
public static void main(String args[]){
  Vector V = new Vector();
  V.addElement(new Student(101, "Masud", 75.5));
  V.addElement(new Student(102, "Monira",85.0));
  V.addElement(new Student(103, "Monirul",80.0));
  System.out.println("List of Students : ");
  System.out.println("Roll: \t Name: \t Mark: ");
  for (int i=0; i<V.size(); i++) {
    System.out.print(V.elementAt(i)); 
// displaying i-th Element.
   }
  V.insertElementAt(new Student(104, "Mira",90), 1);
       //Inserting a new Element at Position 1 
  System.out.println("\nAfter Inserting Element at Position 1 : ");
  System.out.println("List of Students : ");
  System.out.println("Roll: \t Name: \t Mark: ");
 		// displaying Modified Vector Elements.
  for (int i=0; i<V.size(); i++) {
    System.out.print(V.elementAt(i)); 
// displaying i-th Element.
   }
  V.removeElementAt(0);		
    //Removing Element of Position 0
 System.out.println("\nAfter Removing Element of Position 0 : ");
  System.out.println("List of Students : ");
  System.out.println("Roll: \t Name: \t Mark: ");
   for (int i=0; i<V.size(); i++) {
    System.out.print(V.elementAt(i)); 
// displaying i-th Element.
   }
 }
}

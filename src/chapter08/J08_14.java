package chapter08;
/* J08_14.java */
/* Converting Primitive type to corresponding Wrapper class Object using Constructor Method */
import java.util.*;
 public class J08_14{
public static void main(String args[]) {
  Vector V = new Vector();
  int    Roll = 101;
  String Name = "Masud Karim" ;
  float  Mark = 82.5f;
  char   Grade = 'A';
  boolean Pass = true;
  Integer R = new Integer(Roll);
  Float   M = new Float(Mark);
  Character G = new Character(Grade);
  Boolean  P = new Boolean(Pass);

  V.addElement(R); 
  V.addElement(Name); 
  V.addElement(M); 
  V.addElement(G); 
  V.addElement(P); 
  System.out.println("List of Vector Elements : "); 
  for (int i=0; i< V.size(); i++)
  {
   System.out.print("Element At " + i + " is: " );
   System.out.print(V.elementAt(i)); 
// displaying i-th Element.
   System.out.println();
  }
 }
}

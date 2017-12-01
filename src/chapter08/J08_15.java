package chapter08;
/* J08_15.java */
/* Converting Primitive type to corresponding String Object using toString() Method */
import java.util.*;
 public class J08_15{
public static void main(String args[]) {
 Vector V = new Vector();

 int    Roll = 118;
 float  Mark = 74.5f;
 String Name = "Masud" ; 
 String S1, S2;
 S1= Integer.toString(Roll);
 S2= Float.toString(Mark);
 V.addElement(S1);
 V.addElement(Name);
 V.addElement(S2);
 System.out.println("List of Vector Elements : "); 
  for (int i=0; i< V.size(); i++)
  {
   System.out.print("Element At " + i + " is: " );
   System.out.print(V.elementAt(i)); 
   System.out.println();
  }
 }
}

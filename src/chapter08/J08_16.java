package chapter08;
/* J08_16.java */
/* Converting String Object to corresponding Wrapper Class Object using valueOf() Method */
import java.util.*;
 public class J08_16{
public static void main(String args[]) {
 Vector V = new Vector();

 Integer Roll;	//  Roll is a wrapper class object
 String  Name;     //   Name is  a  String Object
 Float Mark;    //  Mark is a wrapper class object

 String R = "101";
 String  N = "Masud";
 String M = "73.56";

 Roll = Integer.valueOf(R);
 Name = N;
 Mark = Float.valueOf(M);

 V.addElement(Roll);
 V.addElement(Name);
 V.addElement(Mark);
 
 System.out.println("List of Vector Elements : "); 
  for (int i=0; i< V.size(); i++)
  {
   System.out.print("Element At " + i + " is: " );
   System.out.print(V.elementAt(i)); 
   System.out.println();
  }

 }
}

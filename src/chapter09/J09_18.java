package chapter09;
/*	J09_18.java   */
/*   Object as  Method's return type  */ 
class Sample {
int a;
Sample(int x) { a = x;  }
Sample ChangeValue()  // Returning Object
 {
 Sample S = new Sample(a*2); 
 return S;
 }
}
 
 public class J09_18 {
public static void main(String args[]){					         
  Sample  Obj1 = new Sample(20);
  Sample  Obj2 ;
  Obj2 = Obj1.ChangeValue();
  System.out.print("\n Obj1.a = " +Obj1.a );
  System.out.print("\t Obj2.a = " +Obj2.a );
  Obj2 = Obj2.ChangeValue();
  System.out.print("\n Obj1.a = " +Obj1.a );
  System.out.print("\t Obj2.a = " +Obj2.a );
 }
}

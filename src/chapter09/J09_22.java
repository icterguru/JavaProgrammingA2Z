package chapter09;
/*  J09_22.java   */
/* 	Example of using static Variable through static Memthod */
class Static {
public static int x=5;   // Static Data Declaration

static int Method1() {
 System.out.print("\nValue of x in Method1() is: " + x);
 return 0;
 }
static int Method2() {
 System.out.print("\nValue of x in Method2() is: " + x);
 return 0;
 }
}
 public class J09_22{
public static void main(String args[]){
 Static.Method1(); // 
 Static.Method2();

 Static S = new Static(); // 
 System.out.println();
 S.Method1(); // 
 S.Method2();
 }
} 

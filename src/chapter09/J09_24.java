package chapter09;
/*  J09_24.java   */
/* 	ERROR in accessing non-ststic member variable through static Memthod */
class Static {
public static int x=5;   // Static Variable
float  y = 2.5F;		// Non-Ststic Variable
static int Method1()	// Static Method
 {
 System.out.print("\nValue of x in Method1() is: " + x);
 System.out.print("\nValue of y in Method1() is: " + y);
 	/* ERROR in accessing non-ststic variable through static method */
 return 0;
 }
}
 public class J09_24 {
public static void main(String args[]){
 Static.Method1(); // 
 }
} 

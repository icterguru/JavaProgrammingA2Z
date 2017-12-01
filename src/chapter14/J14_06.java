package chapter14;
/*  J14_06.java   */
/* Using try/catch Statements in user-defined method  */
class test {
static void Demo() {
   int x, y, z, d;
   x = 5;   y=10;   z=15;
   try {
     d = z/(y-2*x);  // Exception Makes Here (Division by zero)
     System.out.println("This line will not be executed");
		// Above line will not be executed
    }
   catch (ArithmeticException e) {
     System.out.println("Value of d is undetermined");
     System.out.println("\t(Division by zero)");  //ERROR Message
    }
  }  // End of user-defined Method
}
 public class J14_06 {
 public static void main(String args[])  {
  test t = new test();
  t.Demo();
  }
}

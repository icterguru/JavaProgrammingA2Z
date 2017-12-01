package chapter14;
/*  J14_09.java   */
/*  Using finally Statement   */
 public class J14_09 {
  public static void main(String args[]){
   int x, y, z, d, d1, d2;
   x = 5; y=10; z=15;
   try{
     d1 = z/(y-2*x);  // Exception Makes Here (Division by zero)
    System.out.println("Value of d1 is undetermined");
 
   try{
     d2 = y/(z-3*x);  // Exception Makes Here (Division by zero)
    } // End of inner try block
   catch (ArithmeticException e)
    {
     System.out.println("Value of d2 is undetermined");
     System.out.println("\t(Division by zero)");  //ERROR Message
    } // End of inner catch block
   } // End of outer try block

   catch (ArithmeticException e)
    {
     System.out.println("Value of d1 is undetermined");
     System.out.println("\t(Division by zero)");  //ERROR Message
    } // End of outer catch block
  
  finally{
    d = z/(y-x);  // OK and displayed
    System.out.println("Now d = "+d);
   }
  }
 }

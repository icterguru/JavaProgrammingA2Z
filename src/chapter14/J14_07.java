package chapter14;
/*  J14_07.java   */
/* Using Multiple catch Statements in a single try Statement */
 public class J14_07 {
  public static void main(String args[]){
   int x[] = {10, 20};
   int y = 5, d;

try{
   d = x[2] /x[1]; //Exception Makes Here (x[2] does not exist) 
   } 
 catch (ArithmeticException e) // First Exception Handler
  {
   System.out.println("Value of d is undetermined");
   System.out.println("\t(Division by  zero)");
  }
 catch (ArrayStoreException e) // Second Exception Handler
  {
   System.out.println("Invalid Data Type");
  }
 catch (ArrayIndexOutOfBoundsException e) //Third Exception Handler 
  {
   System.out.println("Array Index Error");
  }
   d = x[1]/x[0] ;
   System.out.println("Now d = " +d);
  }
 }

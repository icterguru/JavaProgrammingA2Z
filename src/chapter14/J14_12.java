package chapter14;
/*  J14_12.java   */
/* Creating User-defined Exception Class */
import java.lang.Exception;   // Optional Statement
class MyException extends Exception
{
 MyException(String Msg) // Constructor Defined
  {
   super(Msg); 
  }
}

 public class J14_12 {
 public static void main(String args[])
  {
  int x = 1, y = 100000;
  float z;
   try {
    z = (float)x/(float)y ;
    if(z<0.001)
     throw new MyException("The result is too small");
    } // End of Try Block
   catch (MyException  exObj){ 
// Catching user-defined Exception
    System.out.println("Caught user-defined Exception");
    System.out.println(exObj.getMessage() );
   }  // End of Catch Block
  finally
  {
   System.out.println("Program terminated successfully" );
  }  // End of Default Block
 }
}

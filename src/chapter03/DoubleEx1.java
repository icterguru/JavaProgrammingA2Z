package chapter03;
/* DoubleEx1.java */
/* ERROR IN RUNNING */
 public class DoubleEx1{
public static void main(String args[]) {
 float Value1, Value2, Sum;
// Value1 = 3.123456789; // Illegal
// Value2 = 350.0; // Illegal
 Value1 = 3.123456789f; // Legal
 Value2 = 350.0f; // Legal

 Sum = Value1 + Value2;
 System.out.println("Value1 = " +Value1);
 System.out.println("Value2 = " +Value2);
 System.out.println("Sum = " +Sum);
 }
}

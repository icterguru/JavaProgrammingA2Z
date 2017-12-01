package chapter10;
/* J10_04.java    */
/* 	displaying Fibonacci numbers using Constructor Method  */
class Fibonacci  {
 private int Fibo, F0, F1;
 Fibonacci() {
 F0 = 0; 
 F1 = 1; 
 Fibo = F0 + F1;
 }
void Inc()
{
 F0 = F1; 
 F1 = Fibo; 
 }
void display()
{
 System.out.print(Fibo); 
 Fibo = F0 + F1;
 }
}

 public class J10_04{
public static void main(String args[]) {

 Fibonacci F = new Fibonacci();
// Creating object and Calling Constructor Method
 System.out.println("Frist 10 Fibonacci Numbers are:");
 for (int i=1; i<=10; i++) {
  F.display();
  System.out.print("  ");
  F.Inc();
  }
 }
} 

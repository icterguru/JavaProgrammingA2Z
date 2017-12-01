package chapter18;
/*   J18_08.java   */
/*  Using yield() Thread Control Method */

class A extends Thread   // Thread A
{
public void run()
 {
 for(int  i= 1; i<=5; i++)
   {
    System.out.println("Inside Thread A : i = " +i);
     yield();
   }
  System.out.println("Exit From A.");
  }
}  
class B extends Thread   // Thread B
{
public void run()
 {
  for(int  j= 1; j<=5; j++)
   {
    System.out.println("Inside Thread B : j = " +j);                 
    yield();
   }
  System.out.println("Exit From B.");
 }
}  
 public class J18_08   // Main Thread
{
 public static void main(String args[])
  {
   A Th1 = new A(); //Creating Object of Thread A
   B Th2 = new B(); //Creating Object of Thread B
   System.out.println("Starting Thread A:");
   Th1.start();  // Calls run() Method of Thread A 
   System.out.println("Starting Thread B:");
   Th2.start();  // Calls run() Method of Thread B 
   System.out.println("Exit From Main Thread.");
  }
}  

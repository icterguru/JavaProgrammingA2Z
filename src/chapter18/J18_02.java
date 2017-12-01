package chapter18;
/*   J18_02.java   */
/*  Example of a Multi-Threaded Program */
/*   In extending Thread Class  */
class A extends Thread   // Thread A
{
public void run() {
 for(int  i= 1; i<=5; i=i+2)
   {
    System.out.println("Inside Thread A : i = " +i);
   }
  System.out.println("Exit From A.");
  }
}  

class B extends Thread   // Thread B
{
public void run()
 {
  for(int  j= 2; j<=5; j=j+2)
   {
    System.out.println("Inside Thread B : j = " +j);                 
   }
  System.out.println("Exit From B.");
 }
}  
 public class J18_02   // Main Thread
{
 public static void main(String args[])  {
   A Th1 = new A(); //Creating Object of Thread A
   B Th2 = new B(); //Creating Object of Thread B
   System.out.println("Starting Thread A:");
   Th1.start();  // Calls run() Method of Thread A 
   System.out.println("Starting Thread B:");
   Th2.start();  // Calls run() Method of Thread B
   System.out.println("Exit From Main Thread.");
  }
}  

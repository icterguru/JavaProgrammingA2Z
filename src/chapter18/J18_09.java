package chapter18;
/*   J18_09.java   */
/*  Using stop() and yield() Thread Control Methods */
class A extends Thread   // Thread A
{
public void run()
 {
 for(int  i= 1; i<=5; i++)
   {
    System.out.println("Inside Thread A : i = " +i);
    if(i%2==0) 
     yield();
   }
  System.out.println("Exit From A.");
  }
}  
class B extends Thread   // Thread B
{
public void run()
 {
  for(int  j= 2; j<=6; j=j+2)
   {
    System.out.println("Inside Thread B : j = " +j);                 
    if(j==4) 
     stop();
   }
  System.out.println("Exit From B.");
 }
}  
 public class J18_09   // Main Thread
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

package chapter18;
/*   J18_12.java   */
/*  Example of a Multi-Threaded Program */
/*   In extending Thread Class  */
class A extends Thread   // Thread A
{
public void run()
 {
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
  for(int  j= 2; j<=6; j=j+2)
   {
    System.out.println("Inside Thread B : j = " +j);                 
   }
  System.out.println("Exit From B.");
 }
}  
class C extends Thread   // Thread C
{
public void run()
 {
 for(int  k= 1; k<=5; k=k+2)
   {
    System.out.println("Inside Thread C : k = " +k);
   }
  System.out.println("Exit From C.");
  }
}  
 public class J18_12{   // Main Thread
public static void main(String args[])
  {
   A Th1 = new A(); //Creating Object of Thread A
   B Th2 = new B(); //Creating Object of Thread B
   C Th3 = new C(); //Creating Object of Thread C
   Th1.setPriority(Thread.MIN_PRIORITY);  
          // Setting Thread A with Priority 1     
   Th2.setPriority(Thread.MAX_PRIORITY);
          // Setting Thread B with Priority 15     
   Th3.setPriority(Th1.getPriority()+2);
          // Setting Thread C with Priority 3     
   System.out.println("Starting Thread A:");
   Th1.start();  // Calls run() Method of Thread A 

   System.out.println("Starting Thread B:");
   Th2.start();  // Calls run() Method of Thread B 

   System.out.println("Starting Thread C:");
   Th3.start();  // Calls run() Method of Thread C 
   System.out.println("Exit From Main Thread.");
  }
}  

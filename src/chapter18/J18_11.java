package chapter18;
/*   J18_11.java   */
/*  Using yield(), stop() and sleep() Methods with try and catch Statements */
class A extends Thread   // Thread A
{
public void run(){
 for(int  i= 1; i<=5; i=i+2)
   {
    System.out.println("Inside Thread A : i = " +i);
    if(i==3) 
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
class C extends Thread   // Thread C
{
public void run()
 {
 for(int  k= 1; k<=5; k=k+2)
   {
    System.out.println("Inside Thread C : k = " +k);
    try{
      sleep(1000);  // Causes wait of 1 Sec.
       }
    catch(Exception E)
      {
System.out.println("Eception Caught.");
      }
    }
  System.out.println("Exit From C.");
  }
}  

 public class J18_11   // Main Thread
{
 public static void main(String args[])
  {
   A Th1 = new A(); //Creating Object of Thread A
   B Th2 = new B(); //Creating Object of Thread B
   C Th3 = new C(); //Creating Object of Thread C

   System.out.println("Starting Thread A:");
   Th1.start();  // Calls run() Method of Thread A 

   System.out.println("Starting Thread B:");
   Th2.start();  // Calls run() Method of Thread B 

   System.out.println("Starting Thread C:");
   Th3.start();  // Calls run() Method of Thread C 

   System.out.println("Exit From Main Thread.");
  }
}  

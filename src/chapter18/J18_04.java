package chapter18;
/*   J18_04.java   */
/*  Calling Another Method inside run() Method */

class A extends Thread   // Thread A
{
 void display() {
 for(int  i= 1; i<=5; i++)
   {
    System.out.println("Inside Thread A : i = " +i);
    }
 }

public void run() {
  display();
  System.out.println("Exit From A.");
  }
}  

 public class J18_04   // Main Thread
{
 public static void main(String args[])
  {
   A Th1 = new A(); //Creating Object of Thread A
   System.out.println("Starting Thread A:");

   Th1.start();  // Calls run() Method of Thread A 
   System.out.println("Exit From Main Thread.");
  }
}  

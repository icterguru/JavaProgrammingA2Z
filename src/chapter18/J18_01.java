package chapter18;
/*   J18_01.java   */
/*  Example of a Single Threaded Program */
class MyThread extends Thread   //Creating New Thread 
{
public void run() {
 for(int  i= 1; i<=5; i=i+2)
   System.out.println("Inside Thread A.");
 }
}  
 public class J18_01   // Main Thread
{
 public static void main(String args[])
  {
   MyThread  Th = new MyThread();
   System.out.println("Starting MyThread :");
   Th.start();	// Calls run() Method 
   System.out.println("Exit From Main Thread.");
  }
}  

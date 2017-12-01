package chapter18;
/*   J18_10.java   */
/*  Using sleep() Method with try and catch Statements */
class A extends Thread   // Thread A
{
public void run() {
 for(int  k= 1; k<=5; k=k+2)
   {
    System.out.println("Inside Thread A : k = " +k);
    try{
      sleep(1000);  // Causes wait of 1 Sec.
       }
    catch(Exception E){
 System.out.println("Eception Caught.");
      }
    }
  System.out.println("Exit From A.");
  }
}  

 public class J18_10{   // Main Thread
 public static void main(String args[]){
   System.out.println("Starting Main Thread:");
   A Th1 = new A(); //Creating Object of Thread A
   System.out.println("Starting Thread A:");
   Th1.start();  // Calls run() Method of Thread A 
   System.out.println("Exit From Main Thread.");
  }
}  

package chapter18;
/*   J18_18.java   */
/*  Using Synchronized Method */

class Global   // Global Class
 {
 synchronized void CallMe(String Msg) // Synchronized Method
  {
   System.out.print("[" +Msg);

 try{
   Thread.sleep(1000);
    }
 catch(Exception E)
   {
    System.out.print("Exception Caught.");
   }

 System.out.println("]");
 }
}

class Caller implements Runnable   // Caller Thread 
{
 String Msg;
 Global  Target;
 Thread Th;
 
public Caller(Global Gb, String S)
 {
 Target = Gb;
 Msg = S;
 Th = new Thread(this);
 Th.start();
 }
public void run()
 {
  Target.CallMe(Msg);
 }
}  

 public class J18_13   // Main Thread
{
 public static void main(String args[])
  {
   Global Obj = new Global();
   Caller Obj1 = new Caller(Obj, "Hello");
   Caller Obj2 = new Caller(Obj, "Java");
   Caller Obj3 = new Caller(Obj, "Programmer");
   try{
      Obj1.Th.join();
      Obj2.Th.join();
      Obj2.Th.join();
     }
   catch(Exception E)
     {
     System.out.println("Exception Caught.");   
     } 
  }
}  

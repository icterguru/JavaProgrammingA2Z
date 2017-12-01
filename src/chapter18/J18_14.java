package chapter18;
/*   J18_14.java   */
/*  Using Non-Synchronized Method */

class Global   // Global Class
 {
 void CallMe(String Msg)   // Non-Synchronized Method
  {
   System.out.print("[" +Msg);

 try
   {
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
 Global SyncObj;
 Thread Th;
 
public Caller(Global Gb, String S)
 {
 SyncObj = Gb;
 Msg = S;
 Th = new Thread(this);
 Th.start();
 }
public void run()
 {
 SyncObj.CallMe(Msg);
 }
}  

 public class J18_14   // Main Thread
{
 public static void main(String args[])
  {
   Global Obj = new Global();
   Caller Obj1 = new Caller(Obj, "Hello");
   Caller Obj2 = new Caller(Obj, "Java");
   Caller Obj3 = new Caller(Obj, "Programmer");
   try
    {
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

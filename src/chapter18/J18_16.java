package chapter18;
/*   J18_16.java   */
/*  A Producer-Consumer Problem */

class Queue    	// Class Queue
{
  int n;
  boolean ItemAvailable = false;
  synchronized int setItem()  // Synchronized Method
  {
    if(!ItemAvailable)
    try
    {
      wait();
    }
    catch(Exception E)
    {
      System.out.println("Exception Caught.");
    }
    System.out.println("Got Item: "+n);
    ItemAvailable = false;
    notify();
    return n;
  }
  
  synchronized void PutItem(int n) // Synchronized Method
  {
    if(ItemAvailable)
    try
    {
      wait();
    }
    catch(Exception E)
    {
      System.out.println("Exception Caught.");
    }
    this.n = n;
    ItemAvailable = false;
    System.out.println("Put Item: "+n);
    notify();
  }
}

class Producer implements Runnable   // Thread Producer
{
  Queue Q;
 Producer(Queue Q)
  {
    this.Q = Q;
    new Thread(this, "Producer").start();
  }
 public void run()
  {
    int i = 0;
    while(true)
    {
      Q.PutItem(i++);
    }
  }
}      	  		 

class Consumer implements Runnable	// Thread Consumer
{
  Queue Q;
 Consumer(Queue Q)
  {
    this.Q = Q;
    new Thread(this, "Consumer").start();
  }
  
  public void run()
  {
    while(true)
    {
      Q.setItem();
    }
  }
}

 public class J18_16		// Main Thread 
{
  public static void main(String args[])
  {
    Queue Q = new Queue();
    new Producer(Q);
    new Consumer(Q);
    
    System.out.println("Press Ctrl + C  to Stop");
  }
}    

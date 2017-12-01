package chapter10;
/*	J10_09.java   */
/*   Using Finalize Method  */
 public class J10_09{
static final int MAX = 5;
static int Count = 0;
J10_09() {
 if(Count <MAX)
  Count++;
 else
  {
  System.out.println("ERROR - Fail to Construct.");
  System.exit(0);
  }
 }

protected void finalize()  // Finalize Defined
 {
 Count--;
 }

static void CreateObject()
 {
 J10_09 S = new J10_09();
 } 

public static void main(String args[])
 {
 for(int i=0; i<(MAX*2); i++)
 {
 CreateObject();
 System.out.println("Count = " +Count);
 System.gc();    // Calls Garbage Collector  
 System.runFinalization();  // Calls Finalize but not sure

 }
 } 
}

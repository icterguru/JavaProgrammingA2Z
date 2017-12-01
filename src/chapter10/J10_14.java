package chapter10;
/*	J10_14.java   */
/*   Using Multiple Finalize Methods  */
class Sample {
  int Roll;
  String Name;
Sample()
 {
 System.out.println("Constructor Called.");
 // ... ... ...
 }
protected void finalize()  // Finalize Defined
 {
 // ... ... ...
System.out.println("Normal Finalize Called.");
 }
protected Sample finalize(Sample  S, Sample  T)  // Finalize Defined
 {
 // ... ... ...
System.out.println("Double Argumented Finalize Called.");
return S;
 }

protected Sample finalize(Sample  S)  // Finalize Defined
 {
 // ... ... ...
System.out.println("Single Argumented Finalize Called.");
return S;
 }

}
 public class J10_14{
public static void main(String args[]){
 Sample S = new Sample();
// System.gc();    // Calls Garbage Collector  
// System.runFinalization();
System.runFinalizersOnExit();

 } 
}

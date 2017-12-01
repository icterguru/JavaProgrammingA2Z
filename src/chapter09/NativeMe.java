package chapter09;
/* NativeMe.java */
/* This Program Illustrates of using Native Method */
 
public class NativeMe {
 public int i;
 public static void main(String args[]){
 NativeMe ob = new NativeMe();
 ob.i = 50;
 System.out.println("Inside main() Before Calling test(): ob.i = " +ob.i);
 ob.test();  // Calling Native Method test();
 System.out.println("Inside main() After Calling test(): ob.i = " +ob.i);
 }

 public native void test();   // Native Method Declaration

 static 	// static block 
  {
  System.loadLibrary("NativeMe");  /* Loads NativeMe.dll 
                            first time while Starting*/
  }
}

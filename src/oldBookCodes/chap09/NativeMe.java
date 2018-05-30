
/* NativeMe.java */
/* This Program Illustrates of using Native Method */

public class NativeMe
{
public int i;

public static void main(String args[])
{
NativeMe ob = new NativeMe();
ob.i = 50;
System.out.println("Inside main() Method: ob.i = " +ob.i);
System.out.println("After Calling Native Method test()... ...");
ob.test();  // Calling Native Method test();
System.out.println("Inside test() Method: ob.i = " +ob.i);
}


public native void test();   // Native Method Decleration
static
{
System.loadLibrary("NativeMe");
        // Loading .dll that contains static method
 }
}


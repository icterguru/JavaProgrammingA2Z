package chapter14;
/*  J14_10.java   */
/*  Using throw Statement  */
 public class J14_10 {
static void Demo() {
 try {
   throw new NullPointerException("Demo");
   // No other Statement Allowed here
  }
 catch(NullPointerException exObj){ 
   System.out.println("Caught inside Demo Method");
   throw exObj;  // And throw to main() method
  }
}  // End of user-defined Method

 public static void main(String args[])
  {
  try  {
    Demo();
   }
  catch(NullPointerException exObj) {
    System.out.println("Recaught: " + exObj);
   }
 }
}

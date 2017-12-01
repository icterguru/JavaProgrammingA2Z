package test_programs;
/* J02_03.java   */
/* A Command Line Argumented Program */

 public class Commandline_Argument_Ex{
	 
 public static void main (String  args[]) {
 
 int i, c;
 
// String S;
 c = args.length;
 System.out.println("Number of arguments is : " +c);
 
 for (i =0; i<=10; ++i){
	 System.out.println(i);
	 
//  S = args[i];
//  System.out.println("Arg["+i+"] is : " +S);

//  System.out.println(args[i]);
  
  }// end of for loop
 } // end of main() method
} // end of the class J02_03

 
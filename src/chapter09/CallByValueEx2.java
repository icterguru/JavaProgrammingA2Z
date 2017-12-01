package chapter09;
/*	CallByValueEx2.java   */
/*   Example of Call by Value Process  */

public class CallByValueEx2 {

	public static void main(String[] args) {

	    String myname = "Mokter";  // myname is a local variable
	    System.out.println("Initially, inside main(), Name = " + myname );

	    callMe(myname);

	    System.out.println();
	    System.out.println("After calling callMe(), Name = " + myname); // Look here ??!!??
	    System.out.println();
	    System.out.println("Now, inside main(), Name = " + myname );

	}


	static int callMe(String newname )  // newname is reference of String type
	{
	    newname = "Dr. Mokter Hossain";
	    System.out.println("Inside callMe(), Name = " + newname );
	    return 0;
	}


	}


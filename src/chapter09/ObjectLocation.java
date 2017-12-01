package chapter09;
/* ObjectLocation.java */
/* Finding memory location of objects */

public class ObjectLocation {

public static void main(String[] args) throws Exception {
String fname = "Mokter";
String lname = "Hossain";
String name = fname + " " + lname;
System.out.println("The object 'fname' is located at: " + System.identityHashCode(fname));
System.out.println("The object 'lname' is located at: " + System.identityHashCode(lname));
System.out.println("The object 'name' is located at: " + System.identityHashCode(name));

	}

}

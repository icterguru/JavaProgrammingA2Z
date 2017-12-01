/* J05_061.java */
package chapter05;

import java.io.IOException;
import java.util.Scanner;
public class J05_061 {
public static void main(String args[]) throws IOException {
Scanner scnr = new Scanner(System.in);
System.out.print("Enter your academic year(first, second, third, fourth, graduate): ");

String year = scnr.next().toLowerCase();  
// Converting the String variable year as a lower case string

switch(year){
	case "first":   // when  you are first year student
	System.out.println("You are a student of first year.");
	break;
	case "second":	// when  you are first year student
	System.out.println("You are a student of second year.");
	break;
	case "third":	// when  you are first year student
	System.out.println("You are a student of third year.");
	break;
	case "fourth":	// when  you are first year student
	System.out.println("You are a student of fourth year.");
	break;
	case "graduate":	// when  you are a graduate student
	System.out.println("You are a graduate student.");
	break;

	default:   // when none of the above cases matches
	System.out.println("\nYou entered an invalid academic year.");
	}   // End of switch
	scnr.close();
 }
}

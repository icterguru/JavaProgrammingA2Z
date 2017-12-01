package chapter12;
/*		J12_02.java	 */
/*  	Program to Find area of a room using Function Overloading  */

public class J12_02{

String fName, mName, lName;

public static void main(String Args[]){
	J12_281 mhm = new J12_281();
	System.out.println("This is an alternative way of metheod overloading.. ");

	mhm.withMiddleName("Mosaddek", "Hossain", "Mahdi");
	mhm.withMiddleName("Mosaddek", null, "Mahdi");

	mhm.withMiddleName("Muhaimin", null, "Munim");
	mhm.withMiddleName("Muhaimin", "Hossain", "Munim");
	}

void withMiddleName(String fName, String mName, String lName){
	this.fName = fName;
	this.mName = mName;
	this.lName = lName;

	if (this.mName == null){
		System.out.println("Hello: " + fName + "  " + lName);
		}
	else{
		System.out.println("Hello: " + fName + "  " + mName + "  "+ lName);
	   }

	}

void withoutMiddleName (String fName, String lName){
	this.fName = fName;
	this.lName = lName;

	withMiddleName(fName, null, lName);  
// Alternative to overloading
	}

} // End of the class J12_02

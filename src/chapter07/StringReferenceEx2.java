package chapter07;
//  StringReferenceEx2.java

class Address {
	String address;
}

public class StringReferenceEx2 {
	public static void main(String args[]) {

		Address myAddress = new Address();
		// myAddress is an Object of that refers to an instance (object) of Address type (class)

		Address myCurrentAddress = myAddress;
		Address myDesiredAddress = myCurrentAddress;
		// myCurrentAddress and myDesiredAddress both are reference of type Address

		myCurrentAddress.address = "USA-BD";

		System.out.println("myAddress : " + myAddress.address);
		System.out.println("myCurrentAddress : " + myCurrentAddress.address);
		System.out.println("myDesiredAddress : " + myDesiredAddress.address);


		myDesiredAddress.address = "101 Paradise Road, Heaven Drive";


		System.out.println("myAddress : " + myAddress.address);
		System.out.println("myCurrentAddress : " + myCurrentAddress.address);
		System.out.println("myDesiredAddress : " + myDesiredAddress.address);

		myDesiredAddress.address = null;

		System.out.println("myAddress : " + myAddress.address);
		System.out.println("myCurrentAddress : " + myCurrentAddress.address);
		System.out.println("myDesiredAddress : " + myDesiredAddress.address);

	}
}

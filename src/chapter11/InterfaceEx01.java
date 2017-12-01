package chapter11;
/* J11_17.java	*/
/* Implementing Interface*/

interface Mammall{
	public void move(); // Abstract by default
	public void fly(); // Abstract by default
	public void talk(); // Abstract by default
}

class Humann implements Mammall{
	@Override
	public void move(){
		System.out.println("Human can't fly but can walk and run");
	}

	public void talk(){
		System.out.println("Human can talk");
	}

	@Override
	public void fly() {
		// Do Nothing ...
	}

}

class Birds implements Mammall{
	@Override
	public void move(){
		System.out.println("Birds can fly, but cannot talk");
	}

	public void fly(){
		System.out.println("Bird can fly");
	}

	@Override
	public void talk() {
		// Do Nothing ...
	}
}

public class InterfaceEx01{

	public static void main(String args[]){
		Humann h1 = new Humann();   // Humann reference and Humann object
		// Here h0 is a Humann object that references to a Humann type

		Birds b1 = new Birds(); // Birds reference and Birds object
		// Here b1 is a Birds object that references to a Birds type

		// Mammall h2 = new Humann(); // Illegal
		//  Mammall reference is not allowed

		b1.move();
		b1.fly();

		h1.move();
		h1.talk();

	}
}

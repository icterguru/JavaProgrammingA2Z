package chapter09;
/*
 * StaticBlockEx1.java
 * Java application to demonstrate whether you can run a program without a main method * or not. *
 */

public class StaticBlockEx1 {
static {
	System.out.println("This is a Java progarm with an empty main() method");
	int i = 10; // Can initialize static variables
	System.out.println("Variable i : " + i);

	Thread t = new Thread() {
		@Override
		public void run() {
		System.out.println("Started thread from static initializer block");
		System.out.println("Thread Finished");
		}
	}; // end of the thread t
		t.start(); // starts the thread t
}

	public static void main(String args[]) {
		// Empty main method

	}
}


package chapter05;


import java.io.*;


public class J05_04 {


	public static void main(String args[]) throws IOException { 

		char Ch;
		DataInputStream in = new DataInputStream(System.in);

		System.out.print("Enter the characterar to be tested: ");
		Ch= (char)System.in.read();
		if((Ch >= 'A') && (Ch <= 'Z'))
			System.out.println("You entered an upper case letter: " +Ch);
		else if((Ch >= 'a') && (Ch <= 'z'))
			System.out.println("You entered a lower case letter : " +Ch);
		else
			System.out.println("Oops!! You did not enter a letter!!");

		in.close();

	}

}

package chapter03;
/* ReadCharEx1.java */
/* Reading a character from Keyboard*/
import java.io.IOException;

import java.io.InputStream;

public class ReadCharEx1 {
	public static void main(String[] args) throws IOException 
	{
	// TODO Auto-generated method stub
		System.out.print("Enter a character: ");
		char ch = (char)System.in.read();
       // Accepts a single character 
		System.out.print("You have entered " +ch);
	}
}

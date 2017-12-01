package chapter05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J05_03_1 {


	public static void main(String args[])
	 {
	 int Age=0; 
	 String s;
	 try {
	InputStreamReader IN = new InputStreamReader(System.in);
	BufferedReader BR = new BufferedReader (IN);
	System.out.print("Enter your age: ");
	 s = BR.readLine();  // reading string 
	 Age = Integer.parseInt(s); // converting String to integer

	if(Age<=0)
	 System.out.println("You have not borned yet!");
	else if(Age>0 && Age<=12)
	 System.out.println("You are a child.");
	else if(Age>12 && Age<=19)
	 System.out.println("You are a teen ager.");
	else if(Age>19 && Age<=40)
	 System.out.println("You are young.");
	else if(Age>40)
	 System.out.println("Wish your long life.");
	 }
	 catch(Exception E){   }
	 }

	}


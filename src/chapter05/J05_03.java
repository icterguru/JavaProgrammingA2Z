package chapter05;

import java.io.IOException;
import java.util.Scanner;

public class J05_03 {


	public static void main(String args[]) throws IOException { 

		Scanner scnr = new Scanner(System.in);

		System.out.print("Enter your age: ");

		int Age = scnr.nextInt();

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

		scnr.close();

	}

}

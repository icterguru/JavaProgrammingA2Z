package chapter08;
/* J08_19.java */
/* Converting Wrapper Class Objct to Corresponding Primitive Type using typeValue() Method  */
import  java.io.*;
public class J08_19{
	public static void main(String args[]){
		Integer   I = new Integer(350) ;
		Float     F = new Float(35.0) ;
		Character C = new Character('A') ;
		Boolean   B = new Boolean(true) ;

		int  i = I.intValue();;
		float  f = F.floatValue();
		System.out.println("I = " + I + "\t\t i = " + i);
		System.out.println("F = " + F + "\t f = " + f);
		char c = C.charValue();
		boolean b  = B.booleanValue();
		System.out.println("C = " + C + "\t\t c = " + c);
		System.out.println("B = " + B + "\t b = " + b);
	}
}

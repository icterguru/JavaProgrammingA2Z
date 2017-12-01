package chapter03;

	import java.io.*;

	public class J03_25 {

	// Demonstrate unread(). 
 
	public static void main(String args[]) throws IOException { 
	String s = "if (a == 4) a = 0;\\n"; 
	char buf[] = new char[s.length()]; 
	s.getChars(0, s.length(), buf, 0); 
	CharArrayReader in = new CharArrayReader(buf); 
	PushbackReader f = new PushbackReader(in); 
	int c; 
	while ((c = f.read()) != -1) { 
	switch(c) { 
	case '=': 
	if ((c = f.read()) == '=') 
	System.out.print(".eq."); 
	else { 
	System.out.print("<-"); 
	f.unread(c); 
	} 
	break; 
	default: 
	System.out.print((char) c); 
	break; 
	} 
	} 
	} 
	}

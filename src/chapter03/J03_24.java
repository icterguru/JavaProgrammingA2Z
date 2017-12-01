package chapter03;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class J03_24 {

	public static String SourceFile = "test.txt";
	
	private static PushbackReader Reader;
				
	public static void main(String []args){
		
	try{
		Reader = new PushbackReader (new FileReader(SourceFile));
		
	}	
	
	catch(FileNotFoundException e){
		
		System.out.println("Oops!!! Cannot open the file " + "\'" + SourceFile + "\'");
	
	e.printStackTrace();
	}
	
	int ReadChar = 0;
	
	
	// Reading char by char
	 
	
	while(ReadChar != -1){
		
		try{
			ReadChar = Reader.read() ; 
			
			// Reading char by char 
			
			System.out.print((char) ReadChar);
			// Printing char by char
			 			
		}
		
		catch(IOException e){
			
		e.printStackTrace();	
			
		}
		
	}
	
	
	} // End of main()
	
		
} // End of class

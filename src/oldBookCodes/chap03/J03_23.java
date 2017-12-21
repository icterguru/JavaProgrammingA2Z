package JavaBook1Codes;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;



public class J03_23 {

	public static void main(String[] args) throws IOException 

	{
		// TODO Auto-generated method stub

		int ReadChar;
		InputStreamReader IN = new InputStreamReader(System.in);

		PushbackReader Reader = new PushbackReader(IN);


		ReadChar = Reader.read() ; 
		System.out.print(ReadChar);




	} // End of main()


}

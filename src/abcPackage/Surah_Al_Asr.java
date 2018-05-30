package abcPackage;

public class Surah_Al_Asr {

	public static void main(String[] args) {
		
		boolean hasIman = true;
		boolean hasAmal = true;
		boolean beOnHuk= false;
		boolean bePatient= true;
		
		boolean isSucceeded = hasIman && hasAmal && beOnHuk && bePatient;

		System.out.println("isSucceeded = " + isSucceeded);
		
	}

}

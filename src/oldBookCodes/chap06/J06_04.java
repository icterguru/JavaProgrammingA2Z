package JavaBook1Codes;



public class J06_04 {

	public static void main(String[] args) {

		int Mark[];
		Mark = new int [5];
		Mark[0] = 23;
		Mark[1] = 54;
		Mark[2] = 50;
		Mark[3] = 45;
		Mark[4] = 65;

		int L = Mark.length;
		for (int i = 0; i<L; ++i){
			System.out.println("Mark[" +i +"] = " +Mark[i]);
		}  // End of for

	}	// End of main()
} // End of class


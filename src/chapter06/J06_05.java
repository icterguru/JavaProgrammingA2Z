package chapter06;



public class J06_05 {

	public static void main(String[] args) {

		int   Roll[];
		float Mark[];
		Roll = new int [5];
		Mark = new float [5];

		int size = Mark.length;
		for (int i = 0; i<size; ++i){
			System.out.print("Roll[" +i +"] = " +Roll[i]);
			System.out.println("\t Mark[" +i +"] = " +Mark[i]);

		}  // End of for

	}	// End of main()
} // End of class


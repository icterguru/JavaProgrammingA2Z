package chapter06;



public class J06_02 {

	public static void main(String[] args) {
		int x = 12 + 1000;
		System.out.println(x);
		String s = "1000"+1+2;
		System.out.println(s);
		
		int[] Mark = new int [] {23, 54, 50, 45, 65};
		
		int L = Mark.length;
		
		for (int i = 0; i<L; ++i){
			System.out.println("Mark[" + i + "] = " +Mark[i]);	
			 
		
		}  // End of for
		
	}	// End of main()
} // End of class


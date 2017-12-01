package test_programs;
/* J06_01.java */
/*  Assigning value to array elements */

public class ArrayExample_01{

public static void main(String[] args) {

	String Mark[];
	Mark = new String [10000];
	Mark[0] = "Mokter";
	Mark[3] = "45";
	Mark[4] = "65";
	Mark[1] = "54";
	Mark[2] = "50";
	
	Mark[12] = "65";
	
	Mark[6] = "65";
	Mark[7] = "65";
	

//	int Mark[] = {23, 54, 50, 45, 65, 34, 4, 5, 66, 666, 55};

	
//System.out.println("Mark[0] = " + Mark[0]);
//System.out.println("Mark[1] = " + Mark[1]);
//System.out.println("Mark[2] = " + Mark[2]);
//System.out.println("Mark[3] = " + Mark[3]);
//System.out.println("Mark[4] = " + Mark[4]);

for(int i=0; i< Mark.length; ++i)  // trying to access more elements
	  System.out.println("Mark[" +i +"] = " +Mark[i]);

  }	// End of main()
} // End of class

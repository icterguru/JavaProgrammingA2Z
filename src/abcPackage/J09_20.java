package abcPackage;
/*        J09_20.java   */
/* Auto Initialization of Static Member variable */
class Static {
	static int i;
	int j ;
	
	static String DrYounus;
	
	String MrYounus;
	
	Static(){	// Constructor Function
		++i; 
	}
	
	void display() {
		System.out.println(" Number of Objects Created : " + i);
	}
}

public class J09_20 {
	public static void main(String args[]){
		Static S1 = new Static() ;
		S1.display();
		
		Static S2 = new Static() ; 
		Static S3 = new Static() ;
		S3.display();
		Static S4 = new Static() ; 
		Static S5 = new Static() ; 

		S5.display();
		
		Static.i = 10;
		
		System.out.println(Static.i);
		
		S5.j = 20;
		
		Static bd = new Static();
		bd.MrYounus = "Mr. Muhammed Younus";
	
		Static.DrYounus = "Dr. Muhammed Younus";
		
				
	}
} 

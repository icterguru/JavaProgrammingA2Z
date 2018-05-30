package chapter03;

public class J03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Year = 10;
		int LightSpeed = 186000;
		
		long Distance; 
		Distance = Year * 365 * 24 * 60 * 60 * LightSpeed;
		
		System.out.println("This is incorrect result...");

		System.out.println("This is incorrect result...");
		
		
		
		System.out.print("In " + Year + " years ");
		System.out.print("light will travel about ");
		System.out.print(Distance + "miles");
	}

}

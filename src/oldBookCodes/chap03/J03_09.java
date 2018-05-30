package JavaBook1Codes;

public class J03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	long Year = 10;
	long LightSpeed = 186000;
	long Distance; 
	Distance = Year * 365 * 24 * 60 * 60 * LightSpeed;
	
	System.out.print("In " + Year + " years ");
	System.out.print("light will travel about ");
	System.out.print(Distance + " miles");
	
	
	}

}

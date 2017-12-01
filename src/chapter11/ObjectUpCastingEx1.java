package chapter11;
//
//  ObjectUpCastingEx1.java

// Inheritance Hierarchy and Object Type Casting

class Vehicle{
	void vehicleInfo()
	{
	System.out.println("Invokes Vehicle::vehicleInfo()");
	}
}
class Car extends Vehicle{
	void carInfo(){
	super.vehicleInfo();
	// Invokes Vehicle::vehicleInfo() through super reference
	System.out.println("Invokes Car::carInfo()");
	}
}

class Toyota extends Car {
	@Override
	void carInfo() {
	System.out.println("Invokes Toyota::carInfo()");

	}

	void toyotaSpecial() {
	System.out.println("Invokes Toyota::toyotaSpecial()");
	}
}

class Maruti extends Car {
	@Override
	void carInfo() {
	System.out.println("Invokes Maruti::carInfo()");
	}

	void marutiSpecial() {
	System.out.println("Invokes Toyota::marutiSpecial()");
	}

}


public class ObjectUpCastingEx1{

	public static void main(String[] args) {

	System.out.println("Effect of Inheritance.......");
	Toyota carref1 ;// carref1 has been created as an instance of Toyota class
		// carref1 has not been assigned yet.
	carref1 = new Toyota(); 
// carref1 is assigned as a run-time object of : class Toyota

	System.out.println("The carref1 is a run-time object of : " + carref1.getClass());
	System.out.println("Is carref1 an instance of Car? " + (carref1 instanceof Car));
	System.out.println("Is carref1 an instance of Toyota? "+(carref1 instanceof Toyota));

	System.out.println();

	System.out.println("Effect of UpCasting :: Please look carefully...");
	carref1.vehicleInfo();   	// Invokes Vehicle::vehicleInfo()
	((Car)carref1).vehicleInfo(); // Invokes Vehicle::vehicleInfo()
	((Toyota)carref1).vehicleInfo(); // Still Invokes Vehicle::vehicleInfo()
	((Car)((Toyota)carref1)).vehicleInfo(); // Still Invokes Vehicle::vehicleInfo()
	((Toyota)((Car)((Toyota)carref1))).vehicleInfo(); 
// Still Invokes Vehicle::vehicleInfo()

	System.out.println();

	carref1.carInfo();   	// Invokes Toyota::carInfo()
	((Car)carref1).carInfo(); // Invokes Toyota::carInfo()
	((Toyota)carref1).carInfo(); // Still Invokes Toyota::carInfo()
	((Car)((Toyota)carref1)).carInfo(); // Still Invokes Vehicle::vehicleInfo()
	((Toyota)((Car)((Toyota)carref1))).carInfo(); // Still Invokes Toyota::carInfo()

	System.out.println();

	carref1.toyotaSpecial();   	// Invokes Toyota::toyotaSpecial()
	// ((Car)carref1).toyotaSpecial(); // Shows Compile-time Error
	// The method toyotaSpecial() is undefined for the type Car
	((Toyota)carref1).toyotaSpecial(); // Still Invokes Toyota::toyotaSpecial()
	//((Car)((Toyota)carref1)).toyotaSpecial(); // Shows Compile-time Error
	// The method toyotaSpecial() is undefined for the type Car
	((Toyota)((Car)((Toyota)carref1))).toyotaSpecial(); 
// Still Invokes Vehicle::vehicleInfo()
	}

}

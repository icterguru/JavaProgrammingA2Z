package chapter11;
// VehicleHierarchyEx1.java
interface Vehicle{
	boolean hasAnEngine= true;
	public void vehicleInfo();
}
class Car implements Vehicle {
	String vehicleInfo;
	int  maxSpeed;
	int  maxCapacity;
	Car(String carInfo){
		this.vehicleInfo = carInfo;
	}
	
	@Override
	public void vehicleInfo() {
		System.out.println("This is a " + this.vehicleInfo);
	}

}

class Truck implements Vehicle {
	String vehicleInfo;
	int  maxSpeed=0;
	int  maxLoad=0;

	Truck(String truckInfo){
		this.vehicleInfo = truckInfo;
	}

	@Override
	public void vehicleInfo() {
		System.out.println("This is a " + this.vehicleInfo);
	}

}

public class VehicleHierarchyEx1 {
	public static void main(String[]  args) {
		Car myCar1 = new Car("Toyota Camry 2016");
		myCar1.vehicleInfo();
		Car myCar2 = new Car("Maruti Swift 2015");
		myCar2.vehicleInfo();
		Truck myTruck1 = new Truck("Ford Focus-150 2016");
		myTruck1.vehicleInfo();

	}
}

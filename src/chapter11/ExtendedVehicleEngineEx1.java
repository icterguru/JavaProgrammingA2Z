package chapter11;
//
// ExtendedVehicleEngineEx1.java
interface Vehicle{
	boolean hasAnEngine= true;
	public void vehicleInfo();
}

class Engine {
	String engineType;
	int 	maxSpeed;

	Engine (String engineType, int maxSpeed )
	{
		this.engineType = engineType;
		this.maxSpeed = maxSpeed;

	}

	void engineInfo(){
		System.out.println("Engine Type: " + this.engineType);
		System.out.println("Engine MaxSpeed: " + this.maxSpeed);

	}
}

class Car implements Vehicle {
	String cengine;
	int  maxSpeed=0;

	Car (Engine cengine){
		cengine = new Engine(this.cengine, this.maxSpeed);
	}

	@Override
	public
	void vehicleInfo() {
	}

}


class Toyota extends Car{
	Toyota(Engine crengine) {
		super(crengine);
	}

	private String  makeModel;
	private int 	makeYear;
	protected boolean hasAnEngine = true;
	public void setMakeModel(String makeModel) {
		this.makeModel = makeModel;

	}
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getMakeModel() {
		return makeModel;
	}

	public int getMakeYeARI() {
		return makeYear;
	}

	@Override
	public void vehicleInfo() {

		System.out.println("Model: " + this.makeModel);
		System.out.println("Year: " + this.makeYear);

		System.out.println("Does this car have an engine? " + this.hasAnEngine);

	}

}

public class ExtendedVehicleEngineEx1 {
	public static void main(String[] args) {

		Engine myCarEngine= new Engine("6-Cylinder", 120);
		Toyota myCar = new Toyota(myCarEngine);
		myCar.setMakeModel("Toyota Camry");
		myCar.setMakeYear(1999);
		myCar.vehicleInfo();
		myCarEngine.engineInfo();

		System.out.println();
		Engine my2ndCarEngine= new Engine("4-Cylinder", 180);
		Toyota my2ndCar = new Toyota(my2ndCarEngine);
		my2ndCar.setMakeModel("Toyota RAV4");
		my2ndCar.setMakeYear(2007);
		my2ndCar.vehicleInfo();
		my2ndCarEngine.engineInfo();

		System.out.println();
		Engine myNextCarEngine= new Engine("6-Cylinder", 200);
		Toyota myNextCar = new Toyota(myNextCarEngine);
		myNextCar.setMakeModel("Toyota Camry");
		myNextCar.setMakeYear(2020);
		myNextCar.vehicleInfo();
		myNextCarEngine.engineInfo();


	}
}

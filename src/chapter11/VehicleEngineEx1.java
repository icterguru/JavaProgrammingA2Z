package chapter11;
// VehicleEngineEx1.java
	interface Vehicle{
		boolean hasAnEngine= true;
		public void vehicleInfo();
	}

	class Engine {
		String engineInfo;
		Engine (String engineType)
		{
			this.engineInfo = engineType;
		}

		void engineInfo(){
			if (this.engineInfo == null)
				System.out.println("Engine info is not available");
			else
				System.out.println("Engine info: " + this.engineInfo);
		}
	}

	class Car implements Vehicle {
		String engineInfo;
		String carInfo;
		Car (Engine engineInfo, String carInfo){
			engineInfo = new Engine(this.engineInfo);
			this.carInfo = carInfo ;
		}

		@Override
		public
		void vehicleInfo() {
			if (this.carInfo == null)
				System.out.println("Car info is not available");
			else
				System.out.println("Car info is : " + this.carInfo);
		}

	}

	public class VehicleEngineEx1 {
		public static void main(String[]  args) {

		Engine 	myCarEngine= new Engine("6-Cylinder Hybrid");
		Car 	myCar = new Car(myCarEngine, "Toyota Camry 2016");

		myCarEngine.engineInfo();
		myCar.vehicleInfo();

		System.out.println();
		Engine my2ndCarEngine= new Engine("4-Cylinder");
		Car my2ndCar = new Car(my2ndCarEngine, null);
		my2ndCarEngine.engineInfo();
		my2ndCar.vehicleInfo();

		System.out.println();
		Engine myNextCarEngine= null;
		Car myNextCar = new Car(myNextCarEngine, null);
		myNextCar.vehicleInfo();

		// myNextCarEngine.engineInfo(); // NOT ALLOWED
		/* Null pointer access: The variable myNextCarEngine can only be null at this location
			 */
		}
	}

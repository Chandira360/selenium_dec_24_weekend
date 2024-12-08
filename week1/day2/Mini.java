package week1.day2;

public class Mini {
	// global/classLevel variable
	String brandName = "Mini";
	String modelName;
	String carColor; 
	int noOfWheels = 4;
	int noOfMirors =2;
	int noOfDoors = 4;
	
	
	//accessModifier returnType methodName(input args){}
	public void startCar() {
		System.out.println("Start the car");
	}
	
	public void driveCar() {
		System.out.println("Drive the car");
	}
	
	public void applyBreak() {
		System.out.println("Apply car");
	}

	public void increaseSpeed() {
		System.out.println("Increase the speed");
	}
	
	public void changeGear() {
		System.out.println("Change the gear");
	}
	
	public void cooperS() {
		System.out.println("Brand name is "+brandName);
		System.out.println("Model name is "+modelName);
		System.out.println("Color of the car is "+carColor);;
		System.out.println("no of wheels"+noOfWheels);
		System.out.println("no of mirors"+noOfMirors);
		System.out.println("no of doors "+noOfDoors);
		startCar();
	}
	
	public void countryMan() {
		System.out.println("Brand name is "+brandName);
		System.out.println("Model name is "+modelName);
		System.out.println("Color of the car is "+carColor);;
		System.out.println("no of wheels"+noOfWheels);
		System.out.println("no of mirors"+noOfMirors);
		System.out.println("no of doors "+noOfDoors);
		driveCar();
	}
	
	public static void main(String[] args) {
//		ClassName objectName = new ClassName();
		boolean isWorking = true;
		System.out.println("is Working "+ isWorking);
		Mini ajay = new Mini();
		Mini ragu = new Mini();
		Mini nandhini = new Mini();
		System.out.println("-----------Ajay-----------");
		ajay.modelName = "CooperS";
		ajay.carColor = "Blue";
		ajay.noOfWheels = 5;
		ajay.cooperS();
		System.out.println("----------Ragu------------");
		ragu.modelName = "CountryMan";
		ragu.carColor = "Green";
		ragu.countryMan();
		System.out.println("----------Nandhini------------");
		nandhini.modelName ="CooperS";
		nandhini.carColor = "White";
		nandhini.cooperS();
		System.out.println("----------------------------");
		ajay.cooperS();
	}
	
}

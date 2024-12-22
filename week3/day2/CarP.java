package week3.day2;
// subclass extends superClass
public class CarP extends VehicleGP{

	int noOfSeats = 4;
	int noOfWheels = 5;
	
	public void startCar() {
		System.out.println("Start the car");
	}
	
	public static void main(String[] args) {
		CarP p = new CarP();
		System.out.println("No of seats "+p.noOfSeats);
		System.out.println("No of wheels "+p.noOfWheels);
		p.startCar();
		/*
		 * VehicleGP gp = new VehicleGP(); gp.applyBreak(); gp.soundHorn();
		 */
		p.applyBreak();
		p.soundHorn();
	}
	
}

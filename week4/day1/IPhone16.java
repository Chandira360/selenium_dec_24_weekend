package week4.day1;

public class IPhone16 extends IPhone{

	@Override
	public void chargingPort() {
		System.out.println("IPhone 16 supports type-c port");
	}
	
	
	public static void main(String[] args) {
		//InterfaceName objectName = new ImplementationClass();
		IPhone16 ip16 = new IPhone16();
		ip16.voiceAssistance();
		ip16.os();
		ip16.makeCall();
		ip16.chargingDetails();
		ip16.frontCamera();
		
		
	}
	
	
}

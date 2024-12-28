package week4.day1;

public class Android implements SmartPhone{

	
	public void os() {
		System.out.println("Runs on andriod");
	}

	
	public void voiceAssistance() {
		System.out.println("google as voice assistance");
	}

	@Override
	public void defaultCallingApp() {
		System.out.println("Make call through dailer");
	}
	
	

}

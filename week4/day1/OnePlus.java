package week4.day1;

public class OnePlus extends Android{
	
	@Override
	public void os() {
		System.out.println("OnePlus runs on oxygen OS");
	}
	
	public void os2() {
		super.os();// super keyword represent super class instance
		this.os(); // this keyword represent current/same class instance
	}
	
	private void oxygenOS() {
		System.out.println("OnePlus supports oxygen OS");
	}
	
	public static void main(String[] args) {
		System.out.println("<-----OnePlus----->");
		OnePlus oneplus = new OnePlus();
		oneplus.makeCall();
		oneplus.os2();
		oneplus.voiceAssistance();
		
	}
	
}

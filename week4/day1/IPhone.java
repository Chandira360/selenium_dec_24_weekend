package week4.day1;

public abstract class IPhone implements SmartPhone{

	@Override
	public void os() {
		System.out.println("Runs on ios");
	}

	@Override
	public void voiceAssistance() {
		System.out.println("siri use as voice assistance");
	}

	protected abstract void chargingPort();
	
	public void chargingDetails() {
		chargingPort();
	}
	
	
	public void frontCamera() {
		System.out.println("front facing camera 12MP");
	}
	
	@Override
	public void defaultCallingApp() {
		System.out.println("Make call through phone");
	}
	
	/*
	 * public static void main(String[] args) { IPhone ip = new IPhone(); }
	 */
	
}

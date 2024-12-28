package week4.day1;

public interface SmartPhone {
	
	
	public abstract void os();// unimplemented/abstract method
	
	public void voiceAssistance();
	
	public void defaultCallingApp();
	 default void makeCall() {
		defaultCallingApp();
	}

}

package week4.day1;

public class Calculator {

	public void add(int a, int b) {
		int c = a+b;
		System.out.println("The addition of "+a+" and "+b+" is "+c);
	}
	
	public void add(float a, int b) {
		float c = a+b;
		System.out.println("The addition of "+a+" and "+b+" is "+c);
	}
	
	public void add(int a, float b) {
		float c = a+b;
		System.out.println("The addition of "+a+" and "+b+" is "+c);
	}
	
	public void add(float a, float b) {
		float c = a+b;
		System.out.println("The addition of "+a+" and "+b+" is "+c);
	}
	
	
	public void add(int a, float b, int c) {
		float d = a+b+c;
		System.out.println("The addition of "+a+" and "+b+" and "+c+" is "+d);
	}
	
	public void add(float a, float b, int c) {
		float d = a+b+c;
		System.out.println("The addition of "+a+" and "+b+" and "+c+" is "+d);
	}
	
	public void add(int a, int b, int c) {
		float d = a+b+c;
		System.out.println("The addition of "+a+" and "+b+" and "+c+" is "+d);
	}
	
	public void add(float a, float b, float c) {
		float d = a+b+c;
		System.out.println("The addition of "+a+" and "+b+" and "+c+" is "+d);
	}
}
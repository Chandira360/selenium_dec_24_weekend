package week8.day1;

public class SuperClassConstructor {

	public SuperClassConstructor() {
//		 this("Hello"); 
	  System.out.println("This is constructor from super class"); 
	  }

	public SuperClassConstructor(String x) {
		System.out.println("This is single argument constructor and the input is " + x);
	}
	
	
	static {
		System.out.println("static block from super class");
	}

}

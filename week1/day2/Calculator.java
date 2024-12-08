package week1.day2;

public class Calculator {

	// action is calculator - add, sub, multiple, divison
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public float sub(int a, float b) {
		float c = a-b;
		return c;
	}
	
	public String multiple(float a, int b, float c) {
		float d = a*b*c;
		String output = "The multiple of a as "+a+", b as "+b+", c as "+c+" is "+d;
		return output;
	}
	
	public float divison(int a, int b) {
		return a/b;
	}
	
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 5));
		System.out.println(calc.add(15, 5));
		float subResult = calc.sub(7, 3.5f);
		System.out.println(subResult);
		String multiple = calc.multiple(2.3f, 10, 5.3f);
		String multiple2 = calc.multiple(1.2f, 23, 7.1f);
		float divison = calc.divison(5, 3);
		System.out.println(multiple);
		System.out.println(multiple2);
		System.out.println(divison);
	}
	
	
}

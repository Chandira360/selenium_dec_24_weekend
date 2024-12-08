package week1.day2;

public class LearnIf {

	
	public static void main(String[] args) {
		
		//if(boolean expression/value){}
		
		boolean flag = false;
		
		if(flag) {
			System.out.println("If condition is satisfied");
		}
		
		int a= 2;
		int b = 2;
		int c = 2;
		if(a==b) {
			System.out.println("Both A and B are same");
		}else {
			System.out.println("A and B are different");
		}
		
		System.out.println("________________________________");
//		&& - and operator
//		|| - or operator
		
		if((a>b)&&(b>c)) {
			System.out.println("A is greater than B and B is greater than C ");
		}else if((b>a)&&(a>c)) {
			System.out.println("B is greater than A and A is greater than C");
		}else if((a>c)||(c>b)) {
			System.out.println("Either A is greater than C or C is greater than B");
		}else {
			System.out.println("The above conditions are not satisfied");
		}
		
		System.out.println(a==b);
		
		System.out.println("<---------End----------->");
	}
	
	
}

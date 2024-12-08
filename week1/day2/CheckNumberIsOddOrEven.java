package week1.day2;

public class CheckNumberIsOddOrEven {

	public void checkNumber(int a) {
		if(a%2==0){
			System.out.println("The number "+a+" is Even");
		}else {
			System.out.println("The number "+a+" is Odd");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		CheckNumberIsOddOrEven check = new CheckNumberIsOddOrEven();
		check.checkNumber(7);
		check.checkNumber(8);
		check.checkNumber(13);
		check.checkNumber(5);
		check.checkNumber(2);
		check.checkNumber(12);
		
		
		
	}
	
	
}

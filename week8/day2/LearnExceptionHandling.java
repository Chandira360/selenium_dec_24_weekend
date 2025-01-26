package week8.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		
		int a = 1;
		int b = 0 ;
		int[] c = {1,2,3};
		Thread.sleep(2000);
		try {
			try {
				System.out.println(a/b);
			} catch (NumberFormatException e) {
				System.out.println("This is from nested try catch block");
			}finally {
				System.out.println("Finally block from nested try");
			}
			System.out.println("This is from try block");
			System.out.println(c[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(c[c.length-1]);
			System.out.println("This is from catch block");
		}catch(ArithmeticException e) {
			System.out.println("Any number not possible to divisble by zero");
		}
		
		System.out.println("Hello world!");
		
		try {
			System.out.println("Open the DB");
			throw new RuntimeException("Your sql query is not available in the table");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Close the DB");
		}
		
	}

}

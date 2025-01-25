package week8.day1;

public class LearnEncapsulation extends LearnThreadLocal{

	public void accessCardPin() {
		System.out.println(getCardPin());
	}
	
	public static void main(String[] args) {
		LearnEncapsulation le = new LearnEncapsulation();
		le.setCardPin(1234);
		le.accessCardPin();
	}
	
}

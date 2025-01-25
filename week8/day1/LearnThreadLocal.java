package week8.day1;

public class LearnThreadLocal {
	
	private int cardPin;
private static ThreadLocal<String> pin = new ThreadLocal<String>();
	public int getCardPin() {
		return cardPin;
	}

	public void setCardPin(int cardPin) {
		this.cardPin = cardPin;
	}

	public static void main(String[] args) {
		pin.set("XX13");
		pin.get();
	}
}

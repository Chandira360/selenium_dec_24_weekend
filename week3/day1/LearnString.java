package week3.day1;

public class LearnString {

	
	public static void main(String[] args) {
		
		String name1 = "Testleaf";
		String name2 = "Testleaf";
		System.out.println(name1==name2);
		String name3 = new String("Testleaf");
		String name4 = new String("testleaf");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name1==name3);
		System.out.println(name4==name3);
		
		int length = name1.length();
		System.out.println(length);
		System.out.println(name1.equals(name4));
		System.out.println(name1.equalsIgnoreCase(name4));
		System.out.println(name4.contains("Test"));
	}
	
	
}

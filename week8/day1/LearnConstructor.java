package week8.day1;

public class LearnConstructor extends SuperClassConstructor {
int b =10;
	LearnConstructor() {
//		this();
		this.b++;
		System.out.println("This is default constructor");
		int x =0;
		if(x==2) {
			x++;
			
		}else {
	
		}
	}

	public LearnConstructor(int a) {
		
		System.out.println(++a);
	}

	public static void main(String[] args) {
		LearnConstructor lc = new LearnConstructor();
		LearnConstructor lc2 = new LearnConstructor(6);
		//		this.b++;
//		Select select = new Select();
//		Actions action = new Actions();
//		ChromeDriver driver = new ChromeDriver();
	}

	
	public void callSameClass() {
		this.callSameClass();
		System.out.println(this.b);
	}
	
	{
		System.out.println("non -static block -1");
	}
	
	{
		System.out.println("non -static block - 2");
	}
	
	static {
		System.out.println("Static block");
	}
}

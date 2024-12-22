package week3.day2;

public class User{

	public static void main(String[] args) {
		User u = new User();
		
		ChromeBrowser cb = new ChromeBrowser();
		cb.openBrowser("chrome");
		cb.openIncognitoWindow();
		cb.openApplication("http://leaftaps.com/opentaps");
		cb.closeBrowser();
		
		System.out.println("<------------------------->");
		SafariBrowser sb = new SafariBrowser();
		sb.openBrowser("safari");
		sb.sercureSignIn();
		sb.openApplication("https://www.google.com/");
		sb.closeBrowser();
		
	}
	
}

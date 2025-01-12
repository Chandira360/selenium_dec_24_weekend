package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt87:growl_container")));
//		driver.findElement(By.xpath("//span[text()='Click Second']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']"))).click();
		
	}
	
}

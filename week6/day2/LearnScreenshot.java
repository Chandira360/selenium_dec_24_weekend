package week6.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// take screenshot
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		//choose location, filename and extension
		File location = new File("./snaps/snapshot2.png");
		//save the Screenshot
		FileUtils.copyFile(screenshot, location);
		
		WebElement loginForm = driver.findElement(By.id("form"));
		
		File src = loginForm.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/webSnap1.jpeg");
		FileUtils.copyFile(src, des);
		driver.quit();
		
	}
	
}

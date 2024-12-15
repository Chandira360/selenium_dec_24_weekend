package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver cd = new ChromeDriver();
		EdgeDriver ed = new EdgeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the application url
		driver.get("http://leaftaps.com/opentaps/");
		// locate the username field
		WebElement usernameField = driver.findElement(By.id("username"));
		// enter the input as demosalesmanager for usernameField
		usernameField.sendKeys("demosalesmanager");
		// locate the password field and enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// locate the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		// to get the title of the webpage -> getTitle() and returnType as string
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		// locate the CRM/SFA link and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		//locate the Leads tab and click 
		driver.findElement(By.linkText("Leads")).click();
		//locate the Create Lead link and click
		driver.findElement(By.linkText("Create Lead")).click();
		//locate the company name field and enter the company name as Testleaf
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf ");
		//locate the first name field and enter the first name as Gokul
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		//locate the last name field and enter the last name as Sekar
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		
		//locate the source dropdown element
//		step1: locate the dropdown element
		WebElement sourceEle = driver.findElement(By.id("createLeadForm_dataSourceId"));
//		step2: Create object for Select class and pass the WebElement reference into the argument
		Select sourceDD = new Select(sourceEle);
//		step3: using method to select value from the dropdown
		sourceDD.selectByIndex(5);
		
		//locate the marketing campaign and select ecommerce
		WebElement marketingEle = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingDD = new Select(marketingEle);
		marketingDD.selectByValue("9000");
		
		//locate the industry dropdown and select general services
		WebElement industryEle = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDD = new Select(industryEle);
		industryDD.selectByVisibleText("General Services");

		//locate the create lead button and click
//		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		//locate the leadId and retrive the text
		String companyNameAndLeadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyNameAndLeadId);
		
	}

}

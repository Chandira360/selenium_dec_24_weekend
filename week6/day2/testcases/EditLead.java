package week6.day2.testcases;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day2.DataLibrary;



public class EditLead extends ProjectSpecificMethod{

	@Test(dataProvider = "fetchData")
	public void runEditLead(String phNo, String cname) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyNameEle = driver.findElement(By.id("updateLeadForm_companyName"));
		companyNameEle.clear();
		companyNameEle.sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	@DataProvider(indices = {1})
	public String[][] fetchData() throws InvalidFormatException, IOException {
		
		return DataLibrary.readExcel("CreateLead", "Sheet2");
	}
	
	
	
	
	
}







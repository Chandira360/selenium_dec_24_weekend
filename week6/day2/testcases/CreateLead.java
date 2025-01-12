package week6.day2.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day2.DataLibrary;



public class CreateLead extends ProjectSpecificMethod {

	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String cname, String fname, String lname, String phNo) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(indices = {1,0})
	public String[][] sendData() throws InvalidFormatException, IOException {
		/*
		 * String[][] data = new String[2][4]; data[0][0] = "Testleaf"; data[0][1] =
		 * "Gokul"; data[0][2] = "Sekar"; data[0][3] = "99";
		 * 
		 * data[1][0] = "Qeagle"; data[1][1] = "Babu"; data[1][2] = "M"; data[1][3] =
		 * "98";
		 * 
		 * return data;
		 */
		return DataLibrary.readExcel("CreateLead", "Sheet1");
	}
	
}







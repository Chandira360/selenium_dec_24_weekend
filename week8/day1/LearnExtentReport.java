package week8.day1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	
	public static void main(String[] args) throws IOException {
		Date date = new Date();
		LocalDateTime curentDateAndTime = LocalDateTime.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy _ HH:mm:ss");
		String format = ofPattern.format(curentDateAndTime);
		System.out.println(format);
		
		File reportFolder = new File("./report/result.html");	
//		boolean mkdir = reportFolder.mkdir();
//		System.out.println(mkdir);
		
		//Set the path for report
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(reportFolder);
		reporter.setAppendExisting(true);//maintain history
		//Create Report
		ExtentReports report = new ExtentReports();
		// attach the report to the report path
		report.attachReporter(reporter);
		
		ExtentTest test = report.createTest("Login testcase", "login functionality with valid testdata");
		test.assignAuthor("Gokul");
		test.assignCategory("regression");
		
		test.pass("username entered successful");
		test.fail("password failed to enter");
		
		test.pass("Login button clicked sucessful", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/snapshot.png").build());
		//close the report
		report.flush();
		
	}
	
}

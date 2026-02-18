package week7.day1;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	
	/*
	 * what are the details to be included in the report ?
	 * 1.Results
	 * 2.ExecutionTime
	 * 3.Test case name
	 * 4.Test execution Summary
	 * 5.Snapshot of the execution page
	 * 6.Test Description
	 * 7.Test Author
	 * 8.Test Category
	 * all the reports are generated as the HTML Report
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// Step 1: Set Physical Report Path
		// i want to create a rich standalone HTML 
		String filename = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh_mm_ss_a"));
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./reports/"+filename+".html");
		//extent.setAppendExisting(null)
		// Step 2: Create ExtentReports Object
		ExtentReports reporter = new ExtentReports();
		// Step 3: Attach Reporter to ExtentReports
		reporter.attachReporter(extent);
		// Step 4: Create a Test & Assign Details
		ExtentTest createLeadTest = reporter.createTest("LeadModule", "Verify and validate the create of the Lead");
		createLeadTest.assignAuthor("Bhuvanesh");
		createLeadTest.assignCategory("Regression");
		//Step 5: Add Test Logs (Pass/Fail Status)
		createLeadTest.pass("Company Name entered successfully");
		createLeadTest.pass("First Name entered Successfully");
		createLeadTest.fail("Last Name not enterd", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/frameSS.png").build());
		//Step 6 :  Flush the Report (Mandatory)
		reporter.flush();
		System.out.println("Report Generated Successfully");
	}

}
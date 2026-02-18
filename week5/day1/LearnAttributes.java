package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAttributes {

	@Test(priority = 2,dependsOnMethods = {"duplicateLead"}, alwaysRun = true)
	public void editLead() {
		System.out.println("Lead is Edited Successfully");
	}

	@Test(priority = -4, enabled = false)
	public void createLead() {
		System.out.println("Lead is created Successfully");
	}

	@Test(priority = 3)
	public void deleteLead() {
		System.out.println("Lead is deleted Successfully");
	}

	@Test(priority = 1,invocationCount = 5,threadPoolSize =5)
	public void duplicateLead() throws Exception {
		
		System.out.println("Lead is dulipcated Successfully");
//		Thread.sleep(500);// 520+520+520 => 1560 ==> 620
		throw new Exception();
		
	}

}
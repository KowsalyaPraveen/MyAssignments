package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations {

	@Test(dataProvider = "extractData")
	public void createLead(String name) {
		System.out.println("Lead is created Successfully \nLead name is -->" + name);
	}

	@Parameters({ "uname" })
	@BeforeMethod
	public void beforeMethod(String userName) {
		System.out.println("--BeforeMethod--");
		System.out.println("--Parameterization--");
		System.out.println("Value from XML: " + userName);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("--AfterMethod--");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("--BeforeClass--");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("--AfterClass--");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("--BeforeTest--");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("--AfterTest--");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("--BeforeSuite--");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("--AfterSuite--");
	}

	@Test(enabled = true)
	public void deleteLead() {
		System.out.println("Lead deleted Successfully");
	}

	@DataProvider(name = "extractData")
	public String[] dataLibaray() {
		String[] name = { "Bhuvanesh" };
		System.out.println("--dataprovider--");
		return name;
	}

}
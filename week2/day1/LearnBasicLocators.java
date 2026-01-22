package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnBasicLocators {
	/*
	 * Requirement : To develop the test script , which
	 *  url -->   http://leaftaps.com/opentaps/control/login
	 *  1) locates the user name field and enter the value for the user name field 
	 *  2) locates the password field and enter the value for the password field 
	 *  3) locates the login button and Click the button
	 *  4) verify the title of the web page
	 *  5) locates the crm/sfa link and click the link
	 */

	public static void main(String[] args) {

		// Step no.1: Establishing environment for the automation testing
		// Instantiation of browser driver
		FirefoxDriver driver; // declaration
		driver = new FirefoxDriver();// instantiation
		// Step no.2: maximize the browser
		driver.manage().window().maximize();
		// Step no.3: Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Step no.4 : locates the username field
		WebElement usernameField = driver.findElement(By.id("username"));
		// Step no.5 : enter the value for the username field --> demosalesmanager
		usernameField.sendKeys("demosalesmanager");
		// Step no.6 : locates the password field and enter the value for the password field  --> crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// Step no.7 : locates the login button and Click the button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Step no.8 : verify the title of the webpage
		String titleOfTheCurrentWindow = driver.getTitle();
		if (titleOfTheCurrentWindow.equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("Title is verified successfully");
		}else {
			System.out.println("Title is mismatching");
		}
		// Step no.9 : locates the crm/sfa link and click the link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		// Step no.10 : Close the browser
		driver.close();
	}
}
package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// Establishing environment for the automation testing
		// declaration of browser driver
		ChromeOptions chromeOpt = new ChromeOptions();
		chromeOpt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(chromeOpt);
		// maximize the browser
		driver.manage().window().maximize();
		// Inputs from Requirements
		String url = "http://leaftaps.com/opentaps/";
		String userName = "demosalesmanager";
		String password = "crmsfa";
		String companyName = "Qeagle";
		String firstName = "Kowsalya";
		String lastName = "Muthu";
		String title = "Manager";
	

		// Load the url
		driver.get(url);
		System.out.println(" Launced the URL " + url + " on the browser");

		// Enter Username and password and click login button in login page
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys(userName);
		System.out.println("Entered the Username " + userName + "");
		driver.findElement(By.name("PASSWORD")).sendKeys(password);
		System.out.println("Entered the Password " + password + "");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Clicked on Login button in LoginPage");
		System.out.println("Welcome Page is opened");

		// Click CRM/SFA link in Welcome page
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		System.out.println("Clicked on CRM/SFA link in welcome page");
		System.out.println("My Home page is opened");

		// Click on Leads tab in My Home page
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Clicked on Leads tab");

		// Click on Create lead link from shortcuts
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Clicked on Create Lead shortcuts");

		// Enter values in Create lead form
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		System.out.println("Entered the companyName " + companyName + "");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		System.out.println("Entered the firstName " + firstName + "");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		System.out.println("Entered the lastName " + lastName + "");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(title);
		System.out.println("Entered the Title " + title + "");
		
		// Click on create Lead button
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Clicked on Create Lead button");

		String actualtitleName = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		if (actualtitleName.equalsIgnoreCase(title)) {
			System.out.println("Verified that the Title " + title + " is displayed correctly. ");

		} else {
			System.out.println("Verified that the Title not displayed correctly. ");
		}
		driver.quit();

	}

}

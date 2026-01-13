package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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
		
		String accountName="TestAccountKowsalya2";
		String description="Selenium Automation Tester.";
		String noOfEmployees="10";
		String siteName="LeafTaps";
		String expectedtitleName="Account Details";
			
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

		// Click on Accounts tab in My Home page
		driver.findElement(By.linkText("Accounts")).click();
		System.out.println("Clicked on Accounts tab");

		// Click on Create Account link from shortcuts
		driver.findElement(By.linkText("Create Account")).click();
		System.out.println("Clicked on Create Account shortcuts");

		// Enter values in Create Account form
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		System.out.println("Entered the account Name " + accountName + "");
		driver.findElement(By.name("description")).sendKeys(description);
		System.out.println("Entered the description " + description + "");
		driver.findElement(By.id("numberEmployees")).sendKeys(noOfEmployees);
		System.out.println("Entered the Number Of Employees " + noOfEmployees + "");
		driver.findElement(By.id("officeSiteName")).sendKeys(siteName);
		System.out.println("Entered the siteName " + siteName + "");
		
		// Click on create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Clicked on Create Account button");
		String actualtitleName = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
		System.out.println(actualtitleName);
		if (actualtitleName.contains(expectedtitleName)) {
			System.out.println("Verified that the Title " + expectedtitleName + " is displayed correctly. ");

		} else {
			System.out.println("Verified that the Title not displayed correctly. ");
		}
		driver.quit();

	}

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectDropdown {

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
		String sourceOptionToSelect = "Employee";
		String marketingCompaignOptionToSelect = "Automobile";
		String industryOptionToSelect = "Aerospace";
		String ownershipOptionToSelect = "Corporation";
		
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
		
		// Select option from Source dropdown based on index
		WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceoption = new Select(sourceDropDown);
		sourceoption.selectByIndex(4);
		System.out.println("Selected " + sourceOptionToSelect + " from Source dropdown");
		
		// Select option from marketingCamp dropdown based on visibleText
		WebElement marketingCampDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingOption = new Select(marketingCampDropDown);
		marketingOption.selectByVisibleText("Automobile");
		System.out.println("Selected " + marketingCompaignOptionToSelect + " from MarketingCompaign dropdown");
		
		// Select option from industryDropdown based on value as attribute
		WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryOption = new Select(industryDropdown);
		industryOption.selectByValue("IND_AEROSPACE");
		System.out.println("Selected " + industryOptionToSelect + " from Industry dropdown");
		
		// Select option from ownershipDropdown
		WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipOption = new Select(ownershipDropdown);
		ownershipOption.selectByValue("OWN_CCORP");
		System.out.println("Selected " + ownershipOptionToSelect + " from Ownership dropdown");
		
		// Click on create Lead button
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Clicked on Create Lead button");
		
		// verify the current webpage title
		String currentPageTitle = driver.getTitle();
		System.out.println("Current webPage title is " + currentPageTitle + "");
		if (currentPageTitle.equalsIgnoreCase("View Lead | opentaps CRM")) {
			System.out.println("Current Webpage title " + currentPageTitle + "  verified");
		} else {
			System.out.println("Current Webpage title mismatched ");
		}

		driver.quit();

	}

}

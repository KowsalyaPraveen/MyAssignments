package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JSClick {

	/*
	 * TestNG :
	 * 
	 * Java Reflection : manipalicating Class,method, variabe at run time
	 * 
	 * 1) public, protected , default ,(it should not be a private) 2) non - static
	 * () , it create an object at the run time , it identify the test method object
	 * which is created at the runtime 3) void - it should not return any Datatype
	 * or expression why ? it will halt the report generation, listener 4)() --> No
	 * augment is need if augment is need , using the testng annotations it is
	 * possible
	 */
	@Test
	public void runCreateLead() throws InterruptedException {
		FirefoxDriver driver; // declaration
		driver = new FirefoxDriver();// instantiation
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhuvanesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Moorthy");
		WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		// select class --> Choosing the option based on index
		Select option = new Select(sourceDropDown);
		int sizeOfOption = option.getOptions().size();// 13
		option.selectByIndex(sizeOfOption - 1);
		WebElement marketingCampDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		// Choosing the option based on value as the attribute
		Select marketingOption = new Select(marketingCampDropDown);
		marketingOption.selectByValue("DEMO_MKTG_CAMP");
		WebElement submitButton = driver.findElement(By.name("submitButton"));
		driver.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		
	}
}
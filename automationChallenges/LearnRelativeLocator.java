package automationChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LearnRelativeLocator {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		

		// relative Locator
		WebElement source = driver.findElement(By.xpath("//*[text()='Username']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(source)).sendKeys("demosalesmanager");
		Thread.sleep(500);
		
		WebElement source1 = driver.findElement(By.xpath("//*[text()='Password']"));
		driver.findElement(RelativeLocator.with(By.id("password")).toRightOf(source1)).sendKeys("crmsfa");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(source1)).click();
		
		// Window -- selenium 4
		driver.switchTo().newWindow(WindowType.TAB);
		// Creates a new browser window and switches the focus for future commands of this driver to the new window

		driver.navigate().to("https://login.salesforce.com/?locale=in");
		System.out.println(driver.getTitle());
		Thread.sleep(500);

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		driver.quit();

		

	}

}
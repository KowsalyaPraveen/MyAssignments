package week7.day1;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExceptionHandling {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		Thread.sleep(1000);
		By locator = By.xpath("//span[@class='ui chkboxlabel']");
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(15));
		 try {
			WebElement ele = driver.findElement(locator);
			ele.click();
			// throw new ElementClickInterceptedException("PlannedException");
			Thread.sleep(2000);
		 }catch (NoSuchElementException e) { //NoSuchElement
			driver.findElement(By.xpath("//span[text()='Basic']")).click();
			Thread.sleep(2000);
		 }catch (ElementClickInterceptedException e) { //ElementClickIntercepted
			System.out.println(e);
			WebElement ele = driver.findElement(locator);
			driver.executeScript("arguments[0].click()", ele);
		 }catch (WebDriverException e) { //WebDriverException 
			System.out.println(e);
			// fallback logic 
			WebElement visibility = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
			driver.executeScript("arguments[0].click()", visibility);
		 }finally {
			System.out.println("Finally block will be executed forcefully ");
			WebElement seletedStateOfTheElement = driver.findElement(By.xpath("//span[@class='ui-chkbox-label']/preceding-sibling::div/input"));
			System.out.println(seletedStateOfTheElement.isSelected());
			driver.close();
		 }
		 
		 
		
	}

}
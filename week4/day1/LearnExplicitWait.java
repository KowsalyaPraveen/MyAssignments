package week4.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {
	public static void main(String[] args) {
		
		int expectedWindowCount =3;
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));// TimeOutException
		Boolean validatesWindowsCount = waits.until(ExpectedConditions.numberOfWindowsToBe(expectedWindowCount));
		//driver.getWindowHandles().size() == expectedNumberOfWindows;
		// 3 == 2 --> false --> TimeOutException
		// 3 == 3 --> true
		if (validatesWindowsCount) {
			driver.quit();// Quits this driver, closing every associated window
		}
	}

}
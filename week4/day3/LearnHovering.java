package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnHovering {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.myntra.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Men']"))).pause(3000)
				.click(driver.findElement(By.xpath("//a[text()='T-Shirts']"))).build().perform();
		action.scrollToElement(driver.findElement(By.xpath("//a[text()=' Contact Us ']"))).perform();
	}

}

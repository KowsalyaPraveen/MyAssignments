package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyboardAndMouseEvent {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		Actions action = new Actions(driver);
		// Keyboard events 
		action.sendKeys(driver.findElement(By.xpath("//i[@class='pi pi-search']/following-sibling::input")),"bhuvanesh")
		.keyDown(Keys.SHIFT)// press and hold
		.keyDown(Keys.HOME)// press and hold
		.keyUp(Keys.HOME)// release
		.keyUp(Keys.SHIFT) // release
		.pause(2000)
		.keyDown(Keys.BACK_SPACE)
		.keyUp(Keys.BACK_SPACE)
		.keyDown(Keys.TAB)
		.keyUp(Keys.TAB)
		.perform();
		
		// Mouse events 
		action.dragAndDropBy(driver.findElement(By.id("form:conpnl")), 300, 0)
		.pause(2000)
		.dragAndDrop(driver.findElement(By.id("form:drag")), driver.findElement(By.id("form:drop_content")))
		.build()
		.perform();
		
	}

}
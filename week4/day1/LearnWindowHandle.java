package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		String url = "https://www.irctc.co.in/";
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Launched Url "+ url);
		WebElement buttonOK=driver.findElement(By.xpath("//button[text()='OK']"));
		buttonOK.click();
		System.out.println("Clicked on OK button");
		String parentWindow=driver.getWindowHandle();
		WebElement flightLink=driver.findElement(By.xpath("//label[text()='FLIGHTS']"));
		flightLink.click();
		System.out.println("Clicked on FLIGHT link");
		Set<String> currentlyActiveWindow = driver.getWindowHandles();
		List<String> listOfCurrentlyActiveWindows= new ArrayList<String>(currentlyActiveWindow);
		driver.switchTo().window(listOfCurrentlyActiveWindows.get(listOfCurrentlyActiveWindows.size()-1));
		System.out.println("Switched to new window");	
		String title=driver.getTitle();
		System.out.println("New Window title is "+ title);	
		driver.switchTo().window(parentWindow);
		System.out.println("Switched to Parent  window");
		driver.close();
		System.out.println("Closed the Parent  window");
		

	}

}

package week3.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListInterface {

	public static void main(String[] args) {	

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in//");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);
		List<WebElement> priceElementList = driver.findElements(By.className("a-price-whole"));		
		List<Integer> priceTextList = new ArrayList<Integer>();
		for (int i = 0; i < priceElementList.size(); i++) {
			String priceInText = priceElementList.get(i).getText();
			String fomattedPriceInText = priceInText.replaceAll("\\D", "");
			int priceInNumber = Integer.parseInt(fomattedPriceInText);
			priceTextList.add(priceInNumber);
			System.out.println(priceInNumber);
		}
		Collections.sort(priceTextList);
		System.out.println("Lowest Mobile Price");
		System.out.println(priceTextList.get(0));
	}

}

package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class TatacliqTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Launched the URL
		String url = "https://www.tatacliq.com/";
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Launched the url: " + url);

		// Clicking button on Alert
		WebElement button = driver.findElement(By.id("moe-dontallow_button"));
		button.click();
		System.out.println("Clicked on No Thanks Button");

		// Navigating to Brands-->Watch-->Casio
		Actions action = new Actions(driver);
		WebElement divBrand = driver.findElement(By.xpath("//div[contains(text(),'Brands')]"));
		action.moveToElement(divBrand).click().perform();
		System.out.println("MouseHovering on Brands");
		WebElement divWatch = driver.findElement(By.xpath("//div[contains(text(),'Watches')]"));
		action.moveToElement(divWatch).click().perform();
		System.out.println("MouseHovering on Watch & Accessories");
		WebElement divCitizen = driver.findElement(By.xpath("(//div[contains(text(),'Citizen')])[1]"));
		WebElement divCasio = driver.findElement(By.xpath("(//div[contains(text(),'Casio')])[1]"));
		action.moveToElement(divCitizen).moveToElement(divCasio).click().perform();
		System.out.println("Cliked on Casio");

		// Select particular option from dropdown
		WebElement dropdownSortBy = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		dropdownSortBy.click();
		System.out.println("Clicked on SortBy dropdown");
		Select sortByoption = new Select(dropdownSortBy);
		sortByoption.selectByIndex(3);
		System.out.println("Selected New Arrivals from dropdown");

		// Check Men Checkbox
		WebElement checkboxMen = driver.findElement(By.xpath("//div[contains(text(),'Men')]/preceding-sibling::div"));
		//checkboxMen.click();
		action.moveToElement(checkboxMen).click().perform();
		System.out.println("Checked  Men under catagory");
		Thread.sleep(5000);
		System.out.println("Page is loaded");
		

		// Get and Print All the watch prices and
		List<WebElement> priceList = driver
				.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		String firstProductPrice = priceList.get(0).getText();
		firstProductPrice.replaceAll("", " ");
		System.out.println("Price in first window :"+firstProductPrice);
		System.out.println("Printing price");
		for (WebElement priceElement : priceList) {
			
			System.out.println(priceElement.getText());
		}

		// Click first Product
		WebElement firstWatch = driver.findElement(By.xpath("(//div[@class='ProductDescription__header'])[1]"));
		firstWatch.click();
		System.out.println("Clicked on first product");

		// Move to second window
		Set<String> currentlyActiveWindow = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(currentlyActiveWindow);
		int windowcount = windowList.size();
		driver.switchTo().window(windowList.get(windowcount - 1));
		System.out.println("Switched to second window");

		// Compare the price in parent and second window
		WebElement SecondWindowElement = driver
				.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"));
		String priceInSecondWindow = SecondWindowElement.getText();
		priceInSecondWindow.replaceAll("", " ");
		System.out.println("Price in Second window :"+priceInSecondWindow);
		if (priceInSecondWindow.contains(firstProductPrice)) {
			System.out.println("Verified that Price is same");
		}

		// Click on Add to Bag and verify cart count
		WebElement buttonAdd = driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')]"));
		buttonAdd.click();
		System.out.println("Clicked on ADD TO BAG button");
		WebElement iconCart = driver.findElement(By.className("DesktopHeader__cartCount"));
		String cartCount = iconCart.getText();
		System.out.println("Verified that product is added in Cart,count displayed on the cart icon is : " + cartCount);

		// Clicked on Cart icon
		iconCart.click();
		System.out.println("Clicked on Cart icon");
		Thread.sleep(5000);

		//Wait for element to loaded		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//WebElement elementWatch = driver.findElement(By.id("pd-brand-name"));
		//wait.until(ExpectedConditions.elementToBeClickable(elementWatch));
		
		// Take Screenshot of Mybag
		File src = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/myBag.png");
		FileUtils.copyFile(src, target);
		System.out.println("Screenshot Taken Successfully");

		// Close window one by one
		driver.close();
		System.out.println("Closed the second window");
		driver.quit();
		System.out.println("Closed the first window");
	}

}

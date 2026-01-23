package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAmazonProduct {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.amazon.in/";
		String searchProduct = "Bags for boys";
		String expectedSortOption = "Newest Arrivals";
		String checkboxOption1 = "Skybags";
		String checkboxOption2 = "Gear";

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Launched url: " + url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchProduct);
		System.out.println("Entered " + searchProduct + " in search textbox");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("Clicked search icon");
		String text1 = driver
				.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"))
				.getText();
		System.out.println("Below text is displayed on top left corner ");
		System.out.println(text1);

		Thread.sleep(3000);
////div[@id='brandsRefinements']/ul/span/span/li/span/a/div/label/input
		// div[@id='brandsRefinements']/ul/span/span/li
		List<WebElement> checkboxList = driver
				.findElements(By.xpath("//div[@id='brandsRefinements']/ul/span/span/li/span/a/div/label/input"));

		for (WebElement checkbox : checkboxList) {
			if (checkbox.getText().equalsIgnoreCase(checkboxOption1)
					|| checkbox.getText().equalsIgnoreCase(checkboxOption2)) {
				System.out.println("Selected checkbox " + checkbox.getText());
				checkbox.click();
			}
		}

		List<WebElement> sortOptions = driver.findElements(By.xpath("//li[@class='a-dropdown-item a-declarative']"));
		for (WebElement sortoption : sortOptions) {
			if (sortoption.getText().equalsIgnoreCase(expectedSortOption)) {
				System.out.println("Selected sorted option " + sortoption.getText());
				sortoption.click();

			}
		}

		String text3 = driver
				.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"))
				.getText();
		System.out.println("Below text is displayed on top left corner after sorting");
		System.out.println(text3);
		System.out.println("Current Page Title is " + driver.getTitle());
		driver.close();
		driver.quit();
	}

}

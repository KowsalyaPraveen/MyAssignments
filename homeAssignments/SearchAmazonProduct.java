package homeAssignments;

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

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Launched url: " + url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Enter keywords and click search icon
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchProduct);
		System.out.println("Entered " + searchProduct + " in search textbox");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("Clicked search icon");
		String text1 = driver
				.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"))
				.getText();
		System.out.println("Below text is displayed on top left corner ");
		System.out.println(text1);

		// Click brands checkbox
		WebElement checkbox1 = driver
				.findElement(By.xpath("(//div[@id='brandsRefinements']/ul/span/span/li/span/a/div/label/input)[1]"));

		if (checkbox1.isEnabled()) {
			WebElement correctCheckbox1 = checkbox1.findElement(By.xpath("following-sibling::i"));
			if (correctCheckbox1.isEnabled()) {
				correctCheckbox1.click();
				System.out.println("Selected Skybags from Brands list");
			}
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		System.out.println("Page is reloaded based on selection");
		WebElement checkbox2 = driver
				.findElement(By.xpath("(//div[@id='brandsRefinements']/ul/span/span/li/span/a/div/label/input)[2]"));
		if (checkbox2.isEnabled()) {
			WebElement correctCheckbox2 = checkbox2.findElement(By.xpath("following-sibling::i"));
			if (correctCheckbox2.isEnabled()) {
				correctCheckbox2.click();
				System.out.println("Selected Gear from Brands list");
			}
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		System.out.println("Page is reloaded based on selection");
		
		//Select sort option
		WebElement sortByLink = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		if (sortByLink.isDisplayed()) {
			sortByLink.click();
			System.out.println("Clicked on SortBy Link");
		}

		List<WebElement> sortOptions = driver.findElements(By.xpath("//li[@class='a-dropdown-item a-declarative']"));
		for (WebElement sortoption : sortOptions) {
			if (sortoption.isDisplayed()) {
				if (sortoption.getText().equalsIgnoreCase(expectedSortOption)) {
					System.out.println("Selected sorted option " + expectedSortOption);
					sortoption.click();
					break;

				}
			}
		}

		String text3 = driver
				.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"))
				.getText();
		System.out.println("Below text is displayed on top left corner after sorting");
		System.out.println(text3);
		System.out.println("Current Page Title is " + driver.getTitle());
		driver.quit();
	}

}

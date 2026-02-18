package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BookMovieTicket {

	public static void main(String[] args) {

		String locationName = "INOX National,Virugambakkam Chennai";
		String date = "Tomorrow,24 Jan";
		String url = "https://www.pvrcinemas.com/";
		String movieName="DRAUPATHI 2";
		String time="09:10 AM";

		// FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(url);
		System.out.println("Launched url: " + url);
		WebElement cinemaLink = driver.findElement(By.xpath("//span[@class='cinemas-inactive']"));
		cinemaLink.click();
		System.out.println("Cinema link is clicked");

		
		////span[(text()='Brands')]
		WebElement locationLink = driver.findElement(By.xpath("//span[contains(text(),'Select Cinema')]"));
		locationLink.click();
		System.out.println("Select Cinema Location dropdown  is clicked");
		
		//select cinema from dropdown
		List<WebElement> locationOptions = driver.findElements(By.xpath("//li[@class='p-dropdown-item']"));
		for (WebElement locationOption : locationOptions) {
			if (locationOption.getText().equals(locationName)) {
				System.out.println("Selected Cinema location" +locationOption.getText());		
				locationOption.click();
				break;
			}

		}

		// Select Date from drop down
		WebElement dateDropdown = driver.findElement(By.xpath("//span[contains(text(),'Select Date')]"));
		//dateDropdown.click();
		System.out.println("Date dropdown opened automatically");
		
		List<WebElement> dateOptions = driver.findElements(By.xpath("//li[@class='p-dropdown-item']"));
		for (WebElement dateoption : dateOptions) {
			if (dateoption.getText().equals(date)) {
				System.out.println("Selected  Date " +dateoption.getText());
				
				dateoption.click();
				break;
			}

		}
		
		// Select movie from drop down
		WebElement movieDropdown = driver.findElement(By.xpath("//span[contains(text(),'Select Movie')]"));
		//dateDropdown.click();
		System.out.println("Movie dropdown opened automatically");		
		List<WebElement> movieOptions = driver.findElements(By.xpath("//li[@class='p-dropdown-item']"));
		for (WebElement movieoption : movieOptions) {
			if (movieoption.getText().equals(movieName)) {
				System.out.println("Selected  Movie " +movieoption.getText());				
				movieoption.click();
				break;
			}

		}
		
		// Select time from drop down
				WebElement timeDropdown = driver.findElement(By.xpath("//span[contains(text(),'Select Date')]"));
				//dateDropdown.click();
				System.out.println("Time dropdown opened automatically");		
				List<WebElement> timeOptions = driver.findElements(By.xpath("//li[@class='p-dropdown-item']"));
				for (WebElement timeoption : timeOptions) {
					if (timeoption.getText().equals(time)) {
						System.out.println("Selected  Time" +timeoption.getText());				
						timeoption.click();
						break;
					}

				}
	}

}

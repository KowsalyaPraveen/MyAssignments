package homeAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BookMovieTicket {

	public static void main(String[] args) {

		String url = "https://www.pvrcinemas.com/";
		String locationName = "INOX National,Virugambakkam Chennai";
		String date = "Tomorrow";
		String movieName = "DRAUPATHI 2";
		String time = "09:10 AM";

		// FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(url);
		System.out.println("Launched url: " + url);
		WebElement cinemaLink = driver.findElement(By.xpath("//span[@class='cinemas-inactive']"));
		cinemaLink.click();
		System.out.println("Clicked Cinema from Quick Book option");

		// Click cinema theatres names dropdown
		WebElement locationLink = driver.findElement(By.xpath("//span[contains(text(),'Select Cinema')]"));
		locationLink.click();
		System.out.println("Clicked on Select Cinema Location dropdown");

		// select cinema theatres name from dropdown
		List<WebElement> locationOptions = driver.findElements(By.xpath("//li[@class='p-dropdown-item']"));
		for (WebElement locationOption : locationOptions) {
			if (locationOption.getText().contains(locationName)) {
				System.out.println("Selected Cinema  " + locationOption.getText());
				locationOption.click();
				break;
			}

		}

		// Select Date from drop down
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println("Date dropdown opened automatically");

		List<WebElement> dateOptions = driver.findElements(By.xpath("//li[@class='p-dropdown-item']"));
		for (WebElement dateoption : dateOptions) {
			// System.out.println(dateoption.getText());
			if (dateoption.getText().contains(date)) {
				System.out.println("Selected  Date " + dateoption.getText());
				dateoption.click();
				break;
			}

		}

		// Select movie from drop down
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println("Movie dropdown opened automatically");
		List<WebElement> movieOptions = driver.findElements(By.xpath("//li[@class='p-dropdown-item']"));
		for (WebElement movieoption : movieOptions) {
			// System.out.println(movieoption.getText());
			if (movieoption.getText().contains(movieName)) {
				System.out.println("Selected  Movie " + movieoption.getText());
				movieoption.click();
				break;
			}

		}

		// Select time from drop down
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println("Time dropdown opened automatically");
		List<WebElement> timeOptions = driver.findElements(By.xpath("//li[@class='p-dropdown-item']"));
		for (WebElement timeoption : timeOptions) {
			// System.out.println(timeoption.getText());
			if (timeoption.getText().contains(time)) {
				System.out.println("Selected  Timing " + timeoption.getText());
				timeoption.click();
				break;
			}

		}

		// Clicking on book button
		WebElement button = driver.findElement(By.xpath("//button[@aria-label='Submit']"));
		button.click();
		System.out.println("Clicked on Book Button");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		System.out.println("Page is Loaded");

		

		// Terms and Conditions
		System.out.println("Terms and Conditions is opened");
		WebElement acceptButton = driver.findElement(By.xpath("//button[@class='sc-kCuUfV iBvycX reject-terms']"));
		acceptButton.click();
		System.out.println("Clicked Accept button in Terms and Conditions");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		System.out.println("Screen Page is Loaded");
		WebElement seat = driver.findElement(By.id("SL.SILVER|C:6"));
		seat.click();
		System.out.println("Selected seat C6");

		// Click proceed from booking summary
		WebElement proceedButton = driver.findElement(By.xpath("//button[contains(text(),'Proceed')]"));
		proceedButton.click();
		System.out.println("Clicked on Proceed button in Booking Summary");

		// Verify Seat no and Grand total from Booking Summary
		WebElement seatInfoElement = driver.findElement(By.className("seat-number"));
		String seatInfo = seatInfoElement.getText();
		System.out.println("Verified Seat number " + seatInfo + " in SEAT INFO");

		WebElement grandTotalElement = driver.findElement(By.xpath("(//div[@class='grand-tota col-md-3']/h6)[2]"));
		String grandTotal = grandTotalElement.getText();
		System.out.println("Verified Grand Total " + grandTotal + " is displayed in Booking Summary");

		// Click Continue button from Order Snacks Page
		WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		continueButton.click();
		System.out.println("Clicked on Continue button from Order Snacks Page");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		System.out.println("After clicking Continue button Popup is opened for verification");

		// Click Close icon in the popup
		WebElement closeIcon = driver.findElement(By.xpath("(//i[@class='pi pi-times'])[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(closeIcon).click().build().perform();
		// closeIcon.click();
		System.out.println("Clicked Close icon in the Popup");

		// Capture current page title
		System.out.println("Current Page title is " + driver.getTitle());

	}

}

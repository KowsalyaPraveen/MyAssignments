package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1: Establishing Environment for automation testing
		// Instantiation of browser driver
		ChromeDriver driver;
		driver =new ChromeDriver();
		// Step2: Maximize the browser
		driver.manage().window().maximize();
		// Step3: Load the url
		driver.get("https://www.facebook.com/");
		// Step4: Verify the title
		String title = driver.getTitle();
		System.out.println(title);
		// Step5: Close the browser
		driver.quit();

	}

}

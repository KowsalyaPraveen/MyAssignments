package marathon;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class ServiceNowApp {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//To access  Shadow root element, added dependency in POM.xml
		Shadow shadow=new Shadow(driver);

	}

}

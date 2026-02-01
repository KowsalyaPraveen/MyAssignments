package homeAssignments;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableErail {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://erail.in/");
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		WebElement to = driver.findElement(By.id("txtStationTo"));
		from.clear();		
		from.sendKeys("MAS", Keys.ENTER);
		to.clear();
		to.sendKeys("MDU", Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> trainElements = driver
				.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]"));
		Set<String> trainNames = new LinkedHashSet<String>();
		System.out.println("Total no of Trains "+ trainElements.size());
		System.out.println("Train Names ");
		for (WebElement trainElement : trainElements) {
			String trainName = trainElement.getText();
			System.out.println(trainName);
			trainNames.add(trainName);
		}
	}

}

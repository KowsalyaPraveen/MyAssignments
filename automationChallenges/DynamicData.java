
 package automationChallenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class DynamicData {

	public static void main(String[] args) {
		
		 Faker unique = new Faker();
		 String companyName = unique.company().name();
		 System.out.println(companyName);
		 String firstName = unique.name().firstName().toLowerCase();
		 System.out.println(firstName);
		 String lastName = unique.name().lastName().toLowerCase();
		 String email = firstName+"."+lastName+"@qeagle.com";
		 System.out.println(email);
		
		 
		 ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
				
		 
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	    driver.get("https://www.amazon.in/");
	}

}


package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.CommonBase;

public class HooksImplementation extends CommonBase {
	//io.cucumber.java.InvalidMethodException
	@Before
	public void preCondition() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	
	@After
	public void postCondition() {
		driver.close();
	}

}

package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CreateLead extends ProjectSpecificMethod {

	@Test
	public void runCreateLead() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kowsalya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("m");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String[] splitText = text.split(" ");
		String actualText = splitText[0];
		String expectedText = "Testleaf";
		Assert.assertEquals(actualText, expectedText);

	}

}

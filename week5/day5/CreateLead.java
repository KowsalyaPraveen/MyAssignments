
package week5.day5;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class CreateLead extends ProjectSpecificMethod {

	@BeforeTest
	public void sendLeadData() {
		fileName = "CreateLead";
		System.out.println("@BeforeTest from CreateLead class");
	}

	@Test(dataProvider = "extractData")
	public void runCreateLead(String cname, String fname, String lname, String phNo) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String[] split = text.split(" ");
		String actualText = split[0];
		Assert.assertEquals(actualText, cname);
		System.out.println("@Test from CreateLead class");
	}

}

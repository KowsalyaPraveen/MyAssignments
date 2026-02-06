package week5.day4;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CreateLead extends ProjectSpecificMethod {

	@DataProvider(name = "extractLeadData")
	public String[][] sendLeadData() {

		String[][] testData = new String[2][4];

		testData[0][1] = "Testleaf";
		testData[0][2] = "Kowsalya";
		testData[0][3] = "M";
		testData[0][4] = "9894";
		testData[1][1] = "TL";
		testData[1][2] = "Kowsy";
		testData[1][3] = "M";
		testData[1][4] = "9880";
		return testData;

	}

	@Test(dataProvider = "extractLeadData")
	public void runCreateLead(String cName,String fName,String lName,String phNo) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String[] splitText = text.split(" ");
		String actualText = splitText[0];
		String expectedText = cName;
		Assert.assertEquals(actualText, expectedText);

	}

}

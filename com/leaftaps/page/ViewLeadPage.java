package com.leaftaps.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.leaftaps.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public void verifyCompanyName() {
		String companyName = "Testleaf";
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String[] split = text.split(" ");
		String actualText = split[0];
		Assert.assertEquals(actualText, companyName);
	}
}

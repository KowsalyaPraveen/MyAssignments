package com.leaftaps.page;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	public CreateLeadPage clickCreateLeadLink()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
}

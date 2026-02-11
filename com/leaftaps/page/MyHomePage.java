package com.leaftaps.page;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	 public MyLeadsPage clickLeadsLink() {
		  driver.findElement(By.linkText("Leads")).click();
		  return new MyLeadsPage();
	}
}

package com.leaftaps.page;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
  public MyHomePage clickCrmsfaLink() {
	  driver.findElement(By.linkText("CRM/SFA")).click();
	  return new MyHomePage();
}
}

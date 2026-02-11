package com.leaftaps.testcases;

import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.page.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods{
	@Test
	public void runVerifyLogin() {
    LoginPage user =new LoginPage();
    user.enterUsername();
    user.enterPassword();
    user.clickLoginButton();
	}
}

package com.leaftaps.testcases;

import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.page.CreateLeadPage;
import com.leaftaps.page.LoginPage;
import com.leaftaps.page.ViewLeadPage;

public class TC002_CreateLead extends ProjectSpecificMethods {
	@Test
	public void runCreateLead() {
		LoginPage user = new LoginPage();

		// User Clicking the link and navigated to CreateLeadPage
		CreateLeadPage createLeadPage = user.enterUsername().enterPassword().clickLoginButton().clickCrmsfaLink()
				.clickLeadsLink().clickCreateLeadLink();

		// User Entering details in Create Lead page
		ViewLeadPage viewLeadPage = createLeadPage.enterCompanyName().enterFirstName().enterLastName()
				.enterPhoneNumber().clickCreateLeadButton();

		// Verify company name in view Lead Page
		viewLeadPage.verifyCompanyName();
	}
}

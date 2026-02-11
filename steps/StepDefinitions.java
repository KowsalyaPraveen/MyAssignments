package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import hooks.HooksImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends CommonBase {

	String leadID;

	// You're not allowed to extend classes that define Step Definitions or hooks.
	// class steps.StepDefinitions extends class hooks.HooksImplementation
	@Given("user launch the browser")
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	// io.cucumber.testng.UndefinedStepException:
	@Given("user loads the application url")
	public void user_loads_the_application_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("user enters username as {string}")
	public void user_enters_username_as_demo_sales_manager(String userName) {

		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@Given("user enters password as {string}")
	public void user_enters_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("user redirected to welcome page")
	public void user_redirected_to_welcome_page() {
		String expectedText = "CRM";
		String text = driver.findElement(By.xpath("//div[@id='label']/a")).getText();
		String[] split = text.trim().split("/");
		String actualText = split[0];
		Assert.assertEquals(actualText, expectedText);
	}

	@Then("user redirected to login page")
	public void user_redirected_to_login_page() {

		String expectedText = " User not found.";
		String text = driver.findElement(By.id("errorDiv")).getText();
		String[] split = text.split("login:");
		String actualText = split[1];
		Assert.assertEquals(actualText, expectedText);
	}

	@When("user clicks {string} link")
	public void user_clicks_link(String aText) {
		driver.findElement(By.linkText(aText)).click();
	}

	@Given("user enters Company Name as {string}")
	public void user_enters_company_name_as(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@Given("user enters First name as {string}")
	public void user_enters_first_name_as(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}

	@Given("user enters Last name as {string}")
	public void user_enters_last_name_as(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@When("user clicks Create Lead button")
	public void user_clicks_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("user redirected to View Lead page")
	public void user_redirected_to_view_lead_page() {
		String expectedText = "View";
		String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		String[] split = text.split(" ");
		String actualText = split[0];
		Assert.assertEquals(actualText, expectedText);
	}

	@When("user should view the error message")
	public void user_should_view_the_error_message() {
		String expectedText = "The Following Errors Occurred:";
		String actualText = driver.findElement(By.className("errorMessageHeader")).getText();
		Assert.assertEquals(actualText, expectedText);
	}

	@Given("user enters phone number in create lead Page as {string}")
	public void user_enters_phonenumber_in_createleadPage_as(String phNo) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
	}

	// Delete

	@Given("user enters phone number as {string}")
	public void user_enters_phone_number_as(String phNo) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
	}

	@When("user clicks find leads button")
	public void user_clicks_find_leads_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
	}

	@When("user clicks on first data")
	public void user_clicks_on_first_data() throws InterruptedException {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(3000);
	}

	@Given("user enters the deleted lead id")
	public void user_enters_the_deleted_lead_id() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@Then("user gets no records message")
	public void user_gets_no_records_message() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		String expectedText = "No records to display";
		Assert.assertEquals(text, expectedText, "Defect Is identified");
	}
}

package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import banking.cucumber_framework.AdminHomePage;
import banking.cucumber_framework.BankHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utitlities.BrowserHelper;

public class LoginSteps extends BrowserHelper {

	BankHomePage bankHomePage;

	@Given("user is in bank home page")
	public void user_is_in_bank_home_page() {
		openBrowser("chrome", "http://primusbank.qedgetech.com/");
		bankHomePage = new BankHomePage(driver);
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		bankHomePage.fillUserName("Admin");
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
		bankHomePage.fillPassword("Admin");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		bankHomePage.clickLogin();
	}

	@Then("user can see admin home page with logout link")
	public void user_can_see_admin_home_page_with_logout_link() {
		AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		Assert.assertTrue(adminHomePage.isLogoutLinkDisplayed());
		driver.close();
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
		bankHomePage.fillPassword("Adminnnnn");
	}

	@Then("user can see an error message saying incorrect username or password")
	public void user_can_see_an_error_message_saying_incorrect_username_or_password() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		Assert.assertTrue(alertText.toLowerCase().contains("incorrect"));
		driver.close();
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() {
		bankHomePage.fillUserName("adminnnn");
	}

}

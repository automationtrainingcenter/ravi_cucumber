package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import banking.cucumber_framework.AdminHomePage;
import banking.cucumber_framework.BankHomePage;
import banking.cucumber_framework.RoleCreationPage;
import banking.cucumber_framework.RoleDetailsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utitlities.BrowserHelper;

public class RoleCreationSteps extends BrowserHelper{
	BankHomePage bankHomePage;
	AdminHomePage adminHomePage;
	private RoleDetailsPage roleDetailsPage;
	private RoleCreationPage roleCreationPage;
	private Alert alert;
	
	@Given("user do login with valid credentials")
	public void user_do_login_with_valid_credentials() {
		bankHomePage = new BankHomePage(driver);
		bankHomePage.fillUserName("Admin");
		bankHomePage.fillPassword("Admin");
		bankHomePage.clickLogin();
		adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		
	}

	@Given("user click on role button in Admin home page")
	public void user_click_on_role_button_in_Admin_home_page() {
	    roleDetailsPage = adminHomePage.clickRoles();
	}

	@Given("user click on new role button in role details page")
	public void user_click_on_new_role_button_in_role_details_page() {
	    roleCreationPage = roleDetailsPage.clickNewRole();
	}
	@When("user enters role name as {string}")
	public void user_enters_role_name_as(String string) {
	   roleCreationPage.fillRoleName(string);
	}

	@When("user selects role type as {string}")
	public void user_selects_role_type_as(String string) {
	    roleCreationPage.selectRoleType(string);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    alert = roleCreationPage.clickSubmit();
	}


	@Then("user can see a message role created successully")
	public void user_can_see_a_message_role_created_successully() {
	   String alertText = alert.getText();
	   alert.accept();
	   Assert.assertTrue(alertText.toLowerCase().contains("new role123"));
	   driver.close();
	}
	
	@When("user clicks on reset button")
	public void user_clicks_on_reset_button() {
	    roleCreationPage.clickReset();
	}

	@Then("user can see empty role creation form")
	public void user_can_see_empty_role_creation_form() {
	  Assert.assertTrue(roleCreationPage.isFormReset());
	  driver.close();
	}

}

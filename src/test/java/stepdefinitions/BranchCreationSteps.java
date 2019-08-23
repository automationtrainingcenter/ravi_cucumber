package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import banking.cucumber_framework.AdminHomePage;
import banking.cucumber_framework.BranchCreationPage;
import banking.cucumber_framework.BranchDetailsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import utitlities.BrowserHelper;

public class BranchCreationSteps extends BrowserHelper{
	
	private BranchDetailsPage branchDetailsPage;
	private BranchCreationPage branchCreationPage;

	@Given("user clicks on branches button in admin home page")
	public void user_clicks_on_branches_button_in_admin_home_page() {
	   AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
	   branchDetailsPage = adminHomePage.clickBranches();
	}

	@Given("user clicks on new branch button in branch details page")
	public void user_clicks_on_new_branch_button_in_branch_details_page() {
		branchCreationPage = branchDetailsPage.clickNewbranch();
	}

	@When("user enters branch name as {string}")
	public void user_enters_branch_name_as(String string) {
	    branchCreationPage.fillbranchName(string);
	}

	@When("user enters addressOne as {string}")
	public void user_enters_address_as(String string) {
	   branchCreationPage.fillAdress1(string);
	}

	@When("user enters zipcode as {string}")
	public void user_enters_zipcode_as(String string) {
	    branchCreationPage.fillZipcode(string);
	}

	@When("user selects country as {string}")
	public void user_selects_country_as(String string) {
	    branchCreationPage.selectcountry(string);
	}

	@When("user selects state as {string}")
	public void user_selects_state_as(String string) {
	   branchCreationPage.selectstate(string);
	}

	@When("user selects city as {string}")
	public void user_selects_city_as(String string) {
	    branchCreationPage.selectcity(string);
	}

	@When("user clicks on reset button in branch creation form")
	public void user_clicks_on_reset_button_in_branch_creation_form() {
	    branchCreationPage.clickReset();
	}

	@Then("user can see an empty branch creation form")
	public void user_can_see_an_empty_branch_creation_form() {
	   Assert.assertTrue(branchCreationPage.isFormReset());
	}
	
	@When("user enters invalid branch name user can see error message")
	public void user_enters_invalid_branch_name_as_branchName_user_can_see_error_message(DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<String> branchNames = dataTable.asList();
	    for(String branchName : branchNames) {
	    	branchCreationPage.fillbranchName(branchName);
	    	Thread.sleep(2000);
	    	System.out.println(driver.switchTo().alert().getText());
	    	driver.switchTo().alert().accept();
	    }
	}
}

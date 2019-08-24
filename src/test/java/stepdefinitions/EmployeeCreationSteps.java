package stepdefinitions;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import org.openqa.selenium.support.PageFactory;

import banking.cucumber_framework.AdminHomePage;
import banking.cucumber_framework.EmployeeCreationPage;
import banking.cucumber_framework.EmployeeDetailsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.Gson;
import pojo.Employee;
import utitlities.BrowserHelper;
import utitlities.GenericHelper;

public class EmployeeCreationSteps extends BrowserHelper {

	private EmployeeDetailsPage employeeDetailsPage;
	private EmployeeCreationPage employeeCreationPage;

	@Given("user clicks on employee button in admin home page")
	public void user_clicks_on_employee_button_in_admin_home_page() {
		AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		employeeDetailsPage = adminHomePage.clickEmployee();
	}

	@Given("user clicks on new employee button in branch details page")
	public void user_clicks_on_new_employee_button_in_branch_details_page() {
		employeeCreationPage = employeeDetailsPage.clickNewEmployee();
	}

	@When("user clicks on submit button by filling the employee creation form by taking data from json file")
	public void user_clicks_on_submit_button_by_filling_the_employee_creation_form_by_taking_data_from_json_file() {
		try {
			Gson gson = new Gson();
			FileInputStream fis = new FileInputStream(GenericHelper.getFilePath("testdata", "empData.json"));
			InputStreamReader ir = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(ir);
			Employee[] employees = gson.fromJson(reader, Employee[].class);
			for (Employee emp : employees) {
				employeeCreationPage.fillEmployerName(emp.getEmpName());
				employeeCreationPage.fillLoginPassword(emp.getPassword());
				employeeCreationPage.selectRole(emp.getRole());
				employeeCreationPage.selectBranch(emp.getBranch());
				employeeCreationPage.clickReset();
				Thread.sleep(3000);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

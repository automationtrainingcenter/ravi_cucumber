package banking.cucumber_framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		BankHomePage bankHomePageObj = new BankHomePage(driver);
		
		bankHomePageObj.fillUserName("Admin");
		bankHomePageObj.fillPassword("Admin");
		bankHomePageObj.clickLogin();
		
		// role creation
		AdminHomePage adminHomePageObj = PageFactory.initElements(driver, AdminHomePage.class);
		RoleDetailsPage roleDetailsPageObj = adminHomePageObj.clickRoles();
		RoleCreationPage roleCreationPageObj = roleDetailsPageObj.clickNewRole();
		roleCreationPageObj.fillRoleName("anynewrole");
		roleCreationPageObj.selectRoleType("E");
		Alert alert = roleCreationPageObj.clickSubmit();
		System.out.println(alert.getText());
		
	}

}

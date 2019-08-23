package banking.cucumber_framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		features = {"src/test/java/features/branch_creation.feature"},
		glue = {"stepdefinitions"},
		monochrome = true,
		plugin = {"html:target/reports"}
		)
public class TestRunner {

}

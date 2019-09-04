package banking.cucumber_framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		features = {"src/test/java/features"},
		glue = {"stepdefinitions"},
		monochrome = true,
		plugin = {"html:target/reports"},
		tags = {"@role","@create"}
		)
public class TestRunner {

}
/* anding of tags
 * {"@tag1", "@tag2"} executes scenarios which contains both tag1 and tag2
 * 
 * oring of tags
 * {"@tag1,@tag2"} executes scenarios which contains either tag1 or tag2
 * In latest version of cucumber the above oring will not work
 * we have to use following syntax
 * {"@tag1 or @tag2"} 	
 */

/*
 * To run code through maven use the following commands
 * in command prompt go to the project directory and enter the commands
 * in Jenkins add the commands at goals and options
 * or if you are running through eclipse don't use mvn before each command 
 * mvn test------- to run whole project
 * mvn test -Dcucumber.options="--tags @tagName" ---- to run a specific tag
 */
package testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@Test
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Appala naidu\\OneDrive\\Desktop\\java\\wingify\\feature\\login.feature",
		glue="stepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin= {"pretty","html:test-output"}
		
		)
public class TestRun {
	
}

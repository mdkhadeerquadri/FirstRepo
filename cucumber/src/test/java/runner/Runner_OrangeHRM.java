package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "feature/orangeHRM.feature",
		glue = {"orangeHRM"}
		)
public class Runner_OrangeHRM extends AbstractTestNGCucumberTests
{
	
}

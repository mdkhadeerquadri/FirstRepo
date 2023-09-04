package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "feature/login_page.feature",
		glue = "QAFOX"
		)
public class Runner_QAFOX extends AbstractTestNGCucumberTests {

}

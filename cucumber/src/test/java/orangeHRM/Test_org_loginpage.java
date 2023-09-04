package orangeHRM;

import java.lang.reflect.Method;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.*;

public class Test_org_loginpage extends DriverClass {

public static ExtentTest test;
@Given("url:{string}")
public void url(String string) {
    // Write code here that turns the phrase above into concrete actions
  Loginpage.pageload(string);

}

@Then("login page should open")
public static void login_page_should_open() {
    // Write code here that turns the phrase above into concrete actions
	 test = et.createNode("test 1");
}

@Given("username {string}")
public void username(String string) {
    // Write code here that turns the phrase above into concrete actions
	Loginpage.Username(string);
	test.info("username entered");
}

@Given("password {string}")
public void password(String string) {
    // Write code here that turns the phrase above into concrete actions
	Loginpage.Password(string);
	test.info("password entered");
	
}

@Given("click on login button")
public void click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
	Loginpage.Login_button();
	test.info("login btn clicked");
}

@Then("Dashboard page should open")
public void dashboard_page_should_open() {
    // Write code here that turns the phrase above into concrete actions
   //Loginpage.closePage();
}

@Then("Dashboard page should not open")
public void dashboard_page_should_not_open() {
    // Write code here that turns the phrase above into concrete actions
	Loginpage.closePage();
}
///////////////////////////////////////////////////////////////////////////////////





}

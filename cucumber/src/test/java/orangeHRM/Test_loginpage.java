package orangeHRM;

import io.cucumber.java.en.*;

public class Test_loginpage {

	@Given("url:{string}")
	public void url(String string) {
		Loginpage.pageload(string);
	}

	@Given("username:{string}")
	public void username(String string) {
		Loginpage.Username(string);
	}

	@Given("password:{string}")
	public void password(String string) {
		Loginpage.Password(string);
	}

	@Given("click on login button")
	public void click_on_login_button() {
		Loginpage.Login_button();
	}

	@Then("home page should display")
	public void home_page_should_display() {
		
	}
	@Then("invalid credentials should display")
	public void invalid_credentials_should_display() {

	}


}

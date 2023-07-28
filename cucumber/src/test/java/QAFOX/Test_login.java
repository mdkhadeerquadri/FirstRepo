package QAFOX;

import io.cucumber.java.en.*;

public class Test_login {

	@Given("url  {string}")
	public void url(String string) {
		Login_page.pageload(string);
	}

	@Then("Login page should display")
	public void login_page_should_display() {

	}

	@Given("email: {string}")
	public void email(String string) {
		Login_page.emailAction(string);
	}

	@Given("password: {string}")
	public void password(String string) {
		Login_page.passAction(string);
	}

	@Given("click login button")
	public void click_login_button() {
		Login_page.btnAction();
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {

	}

	@Then("No match for credientials")
	public void no_match_for_credientials() {

	}

}

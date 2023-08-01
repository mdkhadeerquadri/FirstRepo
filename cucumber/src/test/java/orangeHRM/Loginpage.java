package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Loginpage extends DriverClass {

	

	// By objects

	
	static By username = By.xpath("//input[@name='username']");
	static By password = By.xpath("//input[@name='password']");
	static By login_btn = By.xpath("//button[@type='submit']");
	static By byprofile = By.xpath("//p[@class='oxd-userdropdown-name']");
	static By bylogout = By.xpath("//a[text()='Logout']");
	static By byforget = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	static By byreset = By.xpath("//button[@type='submit']");

	// Element methods

	static public WebElement webelement_username() {
		return d.findElement(username);
	}

	static public WebElement webelement_password() {
		return d.findElement(password);
	}

	static public WebElement webelement_login_btn() {
		return d.findElement(login_btn);
	}

	

	static public WebElement profileelement() {
		return d.findElement(byprofile);
	}

	static public WebElement logoutelement() {
		return d.findElement(bylogout);
	}

	public static WebElement forgetelement() {

		return d.findElement(byforget);
	}
	public static WebElement resetelement() {

		return d.findElement(byreset);
	}

	// Action methods
	static public void Username(String input) {
		WebElement user = webelement_username();
		user.click();
		user.sendKeys(input);
	}

	static public void Password(String input) {
		WebElement pass = webelement_password();
		pass.click();
		pass.sendKeys(input);
	}

	static public void Login_button() {
		WebElement login_btn = webelement_login_btn();
		login_btn.click();
	}

	
	public static void forgetAction() {
		WebElement forget = forgetelement();
		forget.click();
	}
	public static void resetAction() {
		WebElement reset = resetelement();
		reset.click();
	}

}

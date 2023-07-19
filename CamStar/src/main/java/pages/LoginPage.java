package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

	// by
	static By user_by = By.xpath("//input[@name=\"username\"]");
	static By password_by = By.xpath("//input[@name=\"password\"]");
	static By lg_btn_by = By.xpath("//button[@type=\"submit\"]");

	// element
	public static WebElement user_element() {
		return driver.findElement(user_by);
	}

	public static WebElement password_element() {
		return driver.findElement(password_by);
	}

	public static WebElement lg_btn_element() {
		return driver.findElement(lg_btn_by);
	}

	// Actions
	public static void user_Action(String data) {
		WebElement e = user_element();
		e.click();
		e.sendKeys(data);
	}
	public static void password_Action(String data) {
		WebElement e = password_element();
		e.click();
		e.sendKeys(data);
	}
	public static void lg_btn_Action() {
		WebElement e = lg_btn_element();
		e.click();
		
	}
}

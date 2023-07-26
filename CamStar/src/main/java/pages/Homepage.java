package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends BaseClass {

	// By
	static By by_admin_btn = By.xpath("//span[text()='Admin']");
	static By by_add_btn = By.xpath("//button[text()=\" Add \"]");
	static By by_user_role = By.xpath("//div[@tabindex=\"0\"]");

	// element
	public static WebElement Element_admin_btn() {
		return driver.findElement(by_admin_btn);
	}

	public static WebElement Element_add_btn() {
		return driver.findElement(by_add_btn);
	}

	public static WebElement Element_select() {
		return driver.findElement(by_user_role);
	}

	// Action
	public static void Action_admin_btn() {
		WebElement e = Element_admin_btn();
		e.click();
	}

	public static void Action_add_btn() {
		WebElement e = Element_add_btn();
		e.click();
	}

	public static void Action_select() {
		WebElement e = Element_select();
		Select s = new Select(e);
		s.selectByVisibleText("Admin");
	}
}

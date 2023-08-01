package orangeHRM.pages;

import java.util.List;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.SelectOption;

public class Loginpage extends BaseClass {

	// By objects

	static String username = "//input[@name='username']";
	static String password = "//input[@name='password']";
	static String login_btn = "//button[@type='submit']";
	static String profile = "//p[@class='oxd-userdropdown-name']";
	static String logout = "//a[text(='Logout']";
	static String forget = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']";
	static String reset = "//button[@type='submit']";
	static String text = "//p[text()=\"Invalid credentials\"]";
	static String popup = "//h6[text()=\"Reset Password link sent successfully\"]";
	static String required = "//span[text()=\"Required\"]";
	static String sidepanal_option = "//ul[@class=\"oxd-main-menu\"]//li";
	static String delete = "//div[@class=\"oxd-table-card\"][2]//i[@class=\"oxd-icon bi-trash\"]";
	static String yes_del ="//button[@type=\"button\" and text()=\" Yes, Delete \"]";
	static String add_btn ="//button[text()=\" Add \"]";
	static String confirm_popup ="//div[@id=\"oxd-toaster_1\"]";
	static String UserRole_and_Status ="//div[@class=\"oxd-select-text oxd-select-text--active\"]";

	// Element methods

	static public Locator Locator_username() {
		return pg.locator(username);
	}

	static public Locator Locator_password() {
		return pg.locator(password);
	}

	static public Locator Locator_login_btn() {
		return pg.locator(login_btn);
	}

	static public Locator profileelement() {
		return pg.locator(profile);
	}

	static public Locator logoutelement() {
		return pg.locator(logout);
	}

	public static Locator forgetelement() {

		return pg.locator(forget);
	}

	public static Locator resetelement() {

		return pg.locator(reset);
	}

	public static Locator Locator_invalid_text() {

		return pg.locator(text);
	}

	public static Locator Locator_popup() {

		return pg.locator(popup);
	}

	public static Locator Locator_required() {

		return pg.locator(required);
	}

	public static List<Locator> Locator_sidePanal() {

		return pg.locator(sidepanal_option).all();
	}
	public static Locator Locator_delete_btn() {

		return pg.locator(delete);
	}
	public static Locator Locator_yes_del() {

		return pg.locator(yes_del);
	}
	public static Locator Locator_add_btn() {

		return pg.locator(add_btn);
	}
	public static Locator Locator_confirm_popup() {

		return pg.locator(confirm_popup);
	}
	public static List<Locator> Locator_UserRole_and_Status() {

		return  pg.locator(UserRole_and_Status).all();
	}
	// Action methods
	static public void Username(String input) {
		Locator user = Locator_username();
		user.click();
		user.type(input);
	}

	static public void Password(String input) {
		Locator pass = Locator_password();
		pass.click();
		pass.type(input);
	}

	static public void Login_button() {
		Locator login_btn = Locator_login_btn();
		login_btn.click();
	}

	public static void forgetAction() {
		Locator forget = forgetelement();
		forget.click();
	}

	public static void resetAction() {
		Locator reset = resetelement();
		reset.click();
	}

	public static void sidePanal_Action(String s) {
		List<Locator> op = Locator_sidePanal();
		for (Locator l : op)
		{
			if (s.equals(l.innerText())) 
			{
				l.click();
				break;
			}
		}
	}
	public static void delete_Action() {
		Locator r = Locator_delete_btn();
		r.click();
	}
	public static void yes_del_Action() {
		Locator r = Locator_yes_del();
		r.click();
	}
	public static void add_btn_Action() {
		Locator r = Locator_add_btn();
		r.click();
	}
	public static void UserRole_and_Status_Action(String s) {
		List<Locator> op = Locator_UserRole_and_Status();
		for (Locator l : op)
		{
			if(l.selectOption(s) != null) {
				break;
			}
		}
	}

}

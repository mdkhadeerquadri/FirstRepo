package QAFOX.pages;



import com.microsoft.playwright.Locator;

public class Login_page extends BaseClass{

	// selector
	static String ac = "//span[text()=\"My Account\"]";
	static String log = "//a[text()=\"Login\"]";
	static String email = "//input[@id=\"input-email\"]";
	static String pass = "//input[@id=\"input-password\"]";
	static String btn = "//input[@class=\"btn btn-primary\"]";
	
	static String componant = "//a[text(=\"Components\"]";
	static String allitem = "//a[text(=\"Monitors (2\"]";
	static String item = "//button[@onclick=\"cart.add('42', '2';\"]";
	static String radio = "//input[@name='option[28]' and @value='7']";
	static String checkbox = "//input[@value='8']";
	static String text = "//input[@name=\"option[208]\"]";
	static String select ="//select";
	static String textarea = "//textarea[@id='input-option209']";
	static String file =  "//button[@id=\"button-upload222\"]";
	static String date = "//input[@id=\"input-option29\"]";
	static String time = "//input[@id=\"input-option22\"]";
	static String datetime ="//input[@id=\"input-option220\"]";
	static String addcart = "//button[@id=\"button-cart\"]";
	
	//locators
	public static Locator Locator_ac() {
		return pg.locator(ac);
	}
	public static Locator Locator_log() {
		return pg.locator(log);
	}
	public static Locator Locator_email() {
		return pg.locator(email);
	}
	public static Locator Locator_pass() {
		return pg.locator(pass);
	}
	public static Locator Locator_btn() {
		return pg.locator(btn);
	} 
	
	//Action
	public static void Click_Ac() {
		Locator l = Locator_ac();
		l.click();
	}
	public static void Click_log() {
		Locator l = Locator_log();
		l.click();
	}
	public static void Enter_email(String data) {
		Locator l = Locator_email();
		l.click();
		l.type(data);
	}
	public static void Enter_pass(String data) {
		Locator l = Locator_pass();
		l.click();
		l.type(data);
	}
	public static void Click_btn() {
		Locator l = Locator_btn();
		l.click();
	}
}

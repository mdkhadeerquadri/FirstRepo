package orangeHRM.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.testng.annotations.*;

import orangeHRM.pages.BaseClass;
import orangeHRM.pages.Loginpage;

public class Test_login_page extends BaseClass {

	private static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	private static String username = "Admin";
	private static String password = "admin123";
	private static String home_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	private static String reset_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
	private static String side_panal = "Admin";
	private static String user_management_url = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";

	@BeforeClass
	public static void BC() {
		test = report.createTest("Test_login_page");
	}
	@BeforeMethod
	public static void open_url(Method m) {
		Loginpage.open_browser(url);
		et = test.createNode(m.getName());
	}

	@AfterMethod
	public static void close_url() {
		Loginpage.close_browser();
	}

	@Test(priority = '1', description = "Verify user able to login using valid credentials")
	public static void Login_valid() {
		Loginpage.Username(username);
		assertEquals(username, Loginpage.Locator_username().inputValue(), "username is invalid");
		et.info("username entered successfully");

		Loginpage.Password(password);
		assertEquals(password, Loginpage.Locator_password().inputValue(), "password is invalid");
		et.info("password entered successfully");

		Loginpage.Login_button();
		assertEquals(home_url, Loginpage.pg.url());
		et.info("Login Successful");
	}

	@Test(priority = '2', description = "Verify user unable to login using invalid credentials")
	public static void Login_invalid() throws InterruptedException {

		Loginpage.Username("fjhgfjfnnxc");
		assertNotEquals(username, Loginpage.Locator_username().inputValue(), "valid username is not required");
		et.info("username entered successfully");

		Loginpage.Password("jfdvnjdvnds");
		assertNotEquals(password, Loginpage.Locator_password().inputValue(), "valid password is not required");
		et.info("password entered successfully");

		Loginpage.Login_button();
		Thread.sleep(2000);
		assertTrue(Loginpage.Locator_invalid_text().isVisible());
		et.info("Login Unsuccessful");
	}

	@Test(priority = '3', description = "User able to change password")
	public static void Forgot_Password() throws InterruptedException {
		Loginpage.forgetAction();
		assertEquals(reset_url, Loginpage.pg.url());
		et.info("click on forgot password");

		Loginpage.Username(username);
		assertEquals(username, Loginpage.Locator_username().inputValue(), "username is invalid");
		et.info("Entered username");

		Loginpage.resetAction();
		Thread.sleep(2000);
		assertTrue(Loginpage.Locator_popup().isVisible());
		et.info("Passsword Change Successful");
	}

	@Test(priority = '4', description = "Fill up the username To be able to log in")
	public static void No_Username() throws InterruptedException {
		Loginpage.Password(password);
		assertEquals(password, Loginpage.Locator_password().inputValue(), "password is invalid");
		et.info("password entered successfully");

		Loginpage.Login_button();
		Thread.sleep(2000);
		assertTrue(Loginpage.Locator_required().isVisible());
		et.info("Login Unsuccessful");
		
	}

	@Test(priority = '5', description = "Fill up the password To be able to log in")
	public static void No_Password() throws InterruptedException {
		Loginpage.Username(username);
		assertEquals(username, Loginpage.Locator_username().inputValue(), "username is invalid");
		et.info("username entered successfully");


		Loginpage.Login_button();
		Thread.sleep(2000);
		assertTrue(Loginpage.Locator_required().isVisible());
		et.info("Login Unsuccessful");
	}

	@Test(priority = '6', description = "Admin can delete records")
	public static void User_Management() throws InterruptedException {
		Login_valid() ;
		Thread.sleep(2000);
		
		Loginpage.sidePanal_Action(side_panal);
		Thread.sleep(6000);
		assertEquals(Loginpage.pg.url(), user_management_url," Admin url is incorrect ");
		et.info("Successfully Open Admin url");
		
		Loginpage.delete_Action();
		Thread.sleep(3000);
	     assertTrue(Loginpage.Locator_yes_del().isVisible(), "delete popup is not displayed");
	     et.info("Delete popup displayed");
		
		Loginpage.yes_del_Action();
		Thread.sleep(3000);
		assertTrue(Loginpage.Locator_confirm_popup().isVisible(),"confirm popup is not displayed" );
		et.info("Record Deleted");
	}
	
}

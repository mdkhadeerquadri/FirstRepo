package orangeHRM.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Window;

import org.testng.annotations.*;

import com.microsoft.playwright.ElementHandle.ScrollIntoViewIfNeededOptions;

import orangeHRM.pages.Loginpage;

public class Test_login_page {

	private static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	private static String username = "Admin";
	private static String password = "admin123";
	private static String home_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	private static String reset_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
	private static String side_panal = "Admin";
//	private static String user_management_url = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";

	@BeforeMethod
	public static void open_url() {
		Loginpage.open_browser(url);
	}

	@AfterMethod
	public static void close_url() {
		Loginpage.close_browser();
	}

	@Test(priority = '1', description = "User able to login using valid credentials and redirected to dashboarb",enabled=false)
	public static void Login_valid() {
		Loginpage.Username(username);
		assertEquals(username, Loginpage.Locator_username().inputValue(), "username is invalid");

		Loginpage.Password(password);
		assertEquals(password, Loginpage.Locator_password().inputValue(), "password is invalid");

		Loginpage.Login_button();
		assertEquals(home_url, Loginpage.pg.url());
	}

	@Test(priority = '2', description = "User unable to login and 'Invalid credentials'  error should occur",enabled=false)
	public static void Login_invalid() throws InterruptedException {

		Loginpage.Username("fjhgfjfnnxc");
		assertNotEquals(username, Loginpage.Locator_username().inputValue(), "valid username is not required");

		Loginpage.Password("jfdvnjdvnds");
		assertNotEquals(password, Loginpage.Locator_password().inputValue(), "valid password is not required");

		Loginpage.Login_button();
		Thread.sleep(2000);
		assertTrue(Loginpage.Locator_invalid_text().isVisible());
	}

	@Test(priority = '3', description = "Change password is need an approval to reset password",enabled=false)
	public static void Forgot_Password() throws InterruptedException {
		Loginpage.forgetAction();
		assertEquals(reset_url, Loginpage.pg.url());

		Loginpage.Username(username);
		assertEquals(username, Loginpage.Locator_username().inputValue(), "username is invalid");

		Loginpage.resetAction();
		Thread.sleep(2000);
		assertTrue(Loginpage.Locator_popup().isVisible());
	}

	@Test(priority = '4', description = "Username cannot be empty",enabled=false)
	public static void No_Username() throws InterruptedException {
		Loginpage.Password(password);
		assertEquals(password, Loginpage.Locator_password().inputValue(), "password is invalid");

		Loginpage.Login_button();
		Thread.sleep(2000);
		assertTrue(Loginpage.Locator_required().isVisible());
	}

	@Test(priority = '5', description = "password cannot be empty",enabled=false)
	public static void No_Password() throws InterruptedException {
		Loginpage.Username(username);
		assertEquals(username, Loginpage.Locator_username().inputValue(), "username is invalid");

		Loginpage.Login_button();
		Thread.sleep(2000);
		assertTrue(Loginpage.Locator_required().isVisible());
	}

	@Test(priority = '6', description = "Confirmation required delete to records")
	public static void User_Management() throws InterruptedException {
		Login_valid() ;
		Thread.sleep(2000);
		Loginpage.sidePanal_Action(side_panal);
	    
		//assertTrue(Loginpage.Locator_delete_btn().isVisible(),"delete button is not visible");

		Loginpage.delete_Action();
		//assertTrue(Loginpage.Locator_yes_del().isVisible(), "del popup is not visible");
		
		Loginpage.yes_del_Action();
	}
}

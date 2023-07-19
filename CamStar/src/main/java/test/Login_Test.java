package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

import pages.BaseClass;
import pages.LoginPage;

public class Login_Test extends BaseClass {
	static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String user = "Admin";
	static String pass = "admin123";
	static String dashurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	@Test
	public static void open_page() {
		open_url(url);
		String acqurl = driver.getCurrentUrl();
		assertEquals(acqurl, url," Incorrect url ");
		
		LoginPage.user_Action(user);
		assertEquals(LoginPage.user_element().getAttribute("value"),user,"user name is invalid ");
		LoginPage.password_Action(pass);
		assertEquals(LoginPage.password_element().getAttribute("value"),pass,"password is invalid" );
		
		assertTrue(LoginPage.lg_btn_element().isEnabled());
		LoginPage.lg_btn_Action();
		assertEquals(driver.getCurrentUrl(), dashurl,"");
		
	}
	
	
	
}

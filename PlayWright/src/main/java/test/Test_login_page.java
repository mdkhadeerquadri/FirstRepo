package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

import pages.Login_page;

public class Test_login_page {
	
    private	static String url ="https://tutorialsninja.com/demo/index.php?route=common/home";
    private static String login_url = "https://tutorialsninja.com/demo/index.php?route=account/login";
    private static String ac_url = "https://tutorialsninja.com/demo/index.php?route=account/account";
	private static String suser = "shah@gmail.com";
	private static String spass = "shahzohaib";

	@BeforeClass
	public static void open_browser() {
		Login_page.open_browser(url);
		assertEquals( url, Login_page.pg.url(),"Home page url is incorrect");
	
		
		Login_page.Click_Ac();
		assertTrue(Login_page.Locator_log().isVisible());
		
		Login_page.Click_log();
		assertEquals(login_url,Login_page.pg.url(),"login page url is incorrect");
		
	}
	@Test
	public static void Login_with_valid_credentials() 
	{
		Login_page.Enter_email(suser);
		assertEquals(suser,Login_page.Locator_email().getAttribute("value"),"email is incorrect");
		
		Login_page.Enter_pass(spass);
		assertEquals(spass,Login_page.Locator_pass().textContent(),"password is incorrect");
		Login_page.Click_btn();
		assertEquals(ac_url, Login_page.pg.url());
	}
	
}

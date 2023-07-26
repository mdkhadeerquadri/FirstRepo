package test;

import org.testng.annotations.*;

import pages.Homepage;

public class Home_Test {

	@BeforeMethod
	public static void login_valid_data() { 
		Login_Test.open_page();
	}
	@Test
	public static void add_user() { 
		Homepage.Action_admin_btn();
		Homepage.Action_add_btn();
	}


}

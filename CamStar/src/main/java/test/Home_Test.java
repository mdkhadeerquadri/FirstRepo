package test;

import org.testng.annotations.*;

import pages.Homepage;

public class Home_Test {

	@BeforeMethod
	public static void login_valid_data() {
		Login_Test.open_page();
	}
	public static void add_user() {
		Homepage.Action_abtn();
		
	}
}

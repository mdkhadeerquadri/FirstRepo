package QAFox;

import org.testng.annotations.*;



public class LoginTestClass {
	public static String suser="shah@gmail.com";
	public static String spass="shahzohaib";

	@BeforeTest
	public static void OpenLoginPage() {
		DriverClass.pageload();
		Login_page.acAction();
		Login_page.logAction();
	}
	@Test
	public static void test1( ) {
		Login_page.emailAction(suser);
		Login_page.passAction(spass);
		Login_page.btnAction();
	}
	
	@AfterTest
	public static void closepage() {

		DriverClass.d.close();
	}
}

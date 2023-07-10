package QAFox;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class LoginTestClass {
	public static String suser = "shah@gmail.com";
	public static String spass = "shahzohaib";
	public static String sdate = "2023-11-25";
	public static String stime = "05-11";
	
	

	@BeforeTest
	public static void OpenLoginPage() {
		DriverClass.pageload();
		Login_page.acAction();
		Login_page.logAction();
	}

	@Test(priority = 1)
	public static void Login_with_valid_credentials() {
		Login_page.emailAction(suser);
		Login_page.passAction(spass);
		Login_page.btnAction();
	}

	@Test(priority = 2)
	public static void Added_item_cart() throws AWTException {
		Login_page.componantAction();
		assertTrue(Login_page.allitemElement().isDisplayed());
		
		Login_page.allitemAction();
		String requrl ="https://tutorialsninja.com/demo/index.php?route=product/category&path=25_28";
		assertEquals(requrl, DriverClass.d.getCurrentUrl());
		
		Login_page.itemAction();
		Login_page.radioAction();
		Login_page.textAction();
		
		Select s = new Select(Login_page.selectElement());
		s.selectByValue("3");
		Login_page.textareaAction();
		Login_page.fileAction();
		Login_page.dateAction(sdate);
		Login_page.timeAction(stime);
		Login_page.datetimeAction(sdate+" "+stime);
		Login_page.addcartAction();
	}

	@AfterTest
	public static void closepage() {

		DriverClass.d.close();
	}
}

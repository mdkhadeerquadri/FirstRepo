package test;

import java.lang.reflect.Method;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;

import pages.BaseClass;
import pages.Page1;

public class Page1_Test extends BaseClass {

	
//	public static ExtentTest test;
//	public static ExtentTest et;

	////////////////////////////////////////////////////////////////////////////////
	@BeforeClass
	public static void BC() {
		test = report.createTest("Page1_Test");
	}

	@BeforeMethod
	public static void BF(Method m) {
		et = test.createNode(m.getName());
	}

	
	///////////////////////////////////////////////////////////////////////////////

	@Test
	public static void TC_1() {
		et.info("tc1 statment 1");
		System.out.println("TC_1");
		et.info("tc1 statement 2");
		Page1.Action();
	}

	@Test
	public static void TC_2() {
		et.info("tc2 statment 1");
		System.out.println("TC_2");
		et.info("tc2 statment 2");
	}

	@Test
	public static void TC_3() {
		et.info("tc3 statement 1");
		System.out.println("TC_3");
		et.info("tc3 statement 2");
	}

	@Test
	public static void TC_4() {
		et.info("tc4 statement 1");
		System.out.println("TC_4");
		et.info("tc4 statement 2");
	}
   
}

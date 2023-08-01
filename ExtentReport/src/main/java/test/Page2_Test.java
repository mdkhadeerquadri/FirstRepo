package test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.BaseClass;

public class Page2_Test extends BaseClass {
	

	@BeforeClass
	public static void BC() {
		test = report.createTest("Page2_Test");
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

}

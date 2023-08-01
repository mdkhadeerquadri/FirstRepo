package orangeHRM.pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass {

	public static Page pg;
	private static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentTest et;

	public static void open_browser(String url) {
		Playwright pw = Playwright.create();
		Browser br = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		pg = br.newPage();
		// BrowserContext context = br.newContext(new
		// Browser.NewContextOptions().setViewportSize(1920, 1080));
		pg.navigate(url);
		
	}
	@BeforeSuite
	public void BeforeSuite() {
		spark = new ExtentSparkReporter("Extent_Report.html");
		report = new ExtentReports();
		report.attachReporter(spark);

	}

	@AfterSuite
	public static void AS() {
		report.flush();
	}
	public static void close_browser() {
		pg.close();
	}
}

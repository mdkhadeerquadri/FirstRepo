package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public static WebDriver d;

	private static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentTest et;

	@BeforeSuite
	public void BeforeSuite() {
		// d = new ChromeDriver();
		// d.manage().window().maximize();
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		spark = new ExtentSparkReporter("Extent_Report11.html");
		report = new ExtentReports();
		report.attachReporter(spark);

	}

	@AfterSuite
	public static void AS() {
		report.flush();
	}
}

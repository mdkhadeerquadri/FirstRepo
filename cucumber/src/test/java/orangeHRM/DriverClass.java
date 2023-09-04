package orangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DriverClass {
	public static WebDriver d;
	public static ExtentSparkReporter spark;
	public static ExtentReports er;
	public static ExtentTest et;
	
	public static void pageload(String url) {
		d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		spark = new ExtentSparkReporter("Extent_Report.html");
		er = new ExtentReports();
		er.attachReporter(spark);
		et = er.createTest("login test");
		
	}

	public static void closePage() {
		d.close();
		er.flush();
	}
}

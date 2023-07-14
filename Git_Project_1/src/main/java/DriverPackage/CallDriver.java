package DriverPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallDriver {
	public static WebDriver d = new ChromeDriver();
	public static void pageload(String url) {
	d.get(url);
    d.manage().window().maximize();
    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public static void closepage() {
		d.close();
	}

}

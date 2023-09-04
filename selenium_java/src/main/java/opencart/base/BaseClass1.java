package opencart.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
	static WebDriver d;

	public static void open_url(String url) {
		d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void close_url() {
		d.close();
	}
}

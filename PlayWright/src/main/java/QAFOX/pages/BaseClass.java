package QAFOX.pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass {

	public static Page pg;
	
	public static void open_browser(String url)
	{
		Playwright pw = Playwright.create();
		Browser br = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 pg = br.newPage();
		//BrowserContext context = br.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
		pg.navigate(url);

	}
}

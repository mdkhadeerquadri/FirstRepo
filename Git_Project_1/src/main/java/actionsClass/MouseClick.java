package actionsClass;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();

		d.get("https://mousetester.com");

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		d.manage().window().maximize();

		By click_mouse= By.xpath("//div[@id=\"clickMe\"]");

		WebElement click = d.findElement(click_mouse);

		Actions a = new Actions(d);

		//click.click();

		a.doubleClick(click).perform();

		a.contextClick(click).perform();
		
		
	}

}

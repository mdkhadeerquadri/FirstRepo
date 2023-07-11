package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.orangehrm.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.manage().window().maximize();

		By res = By.xpath("//a[text()='Resources']");
		WebElement r = d.findElement(res);

		By ebook = By.xpath("//li[@class=\"sub-menu-title menu-title-row pt-2 pb-2\"]//a[text()='eBooks']");
		WebElement e = d.findElement(ebook);
		Actions a = new Actions(d);
		a.moveToElement(r).perform();
		a.click(e).perform();
		
		

		
	}

}

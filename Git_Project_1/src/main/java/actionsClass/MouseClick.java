package actionsClass;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import DriverPackage.CallDriver;

public class MouseClick extends CallDriver {
	public static void main(String[] args) {
		pageload("https://mousetester.com");

		By click_mouse= By.xpath("//div[@id=\"clickMe\"]");

		WebElement click = d.findElement(click_mouse);

		Actions a = new Actions(d);
		a.doubleClick(click).perform();
		a.contextClick(click).perform();
		
		
	}

}

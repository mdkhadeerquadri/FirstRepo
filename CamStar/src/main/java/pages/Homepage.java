package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage extends BaseClass{
	

	//By 
	static By by_abtn = By.xpath("//span[text()='Admin']");
	
	//element
	public static WebElement  Element_abtn() {
		
		return driver.findElement(by_abtn);
	}
	//Action 
	public static void Action_abtn() {
		WebElement e = Element_abtn();
		e.click();
	}
}

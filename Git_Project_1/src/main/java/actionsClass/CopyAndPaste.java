package actionsClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import DriverPackage.CallDriver;

public class CopyAndPaste extends CallDriver 
{
	public static void main(String[] args) throws Exception {
		
	pageload("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
    By e=By.xpath("//input[@name=\"username\"]");
	WebElement e1 = d.findElement(e);
	
	e1.click();
	e1.sendKeys("hello world, welcome to hyderabad");
	
	e1.sendKeys(Keys.CONTROL+"A");
	e1.sendKeys(Keys.CONTROL+"V");
	
	
	e1.sendKeys(Keys.TAB);
	
	
	WebElement e2 = d.findElement(By.xpath("//input[@name=\"password\"]"));
	e2.sendKeys(Keys.CONTROL+"V");


	assertEquals(e1.getAttribute("value"),e2.getAttribute("value"));
	
	
	
}

}

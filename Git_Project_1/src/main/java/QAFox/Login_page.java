package QAFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Login_page extends DriverClass
{
	//by
	static By byac = By.xpath("//span[text()=\"My Account\"]");
	static By bylog = By.xpath("//a[text()=\"Login\"]");
	static By byemail = By.xpath("//input[@id=\"input-email\"]");
	static By bypass = By.xpath("//input[@id=\"input-password\"]");
	static By bybtn = By.xpath("//input[@class=\"btn btn-primary\"]");
	
	
	
	//element
	public static WebElement acElement() {
		return d.findElement(byac);
	}
	public static WebElement logElement() {
		return d.findElement(bylog);
	}
	public static WebElement emailElement() {
		return d.findElement(byemail);
	}
	public static WebElement passElement() {
		return d.findElement(bypass);
	}
	public static WebElement btnElement() {
		return d.findElement(bybtn);
	}
	
	//actions
	 public static void acAction() {
		   WebElement e = acElement();
		   e.click();
	   }
	 public static void logAction() {
		   WebElement e = logElement();
		   e.click();
	   }
	 public static void emailAction(String email) {
		   WebElement e = emailElement();
		   e.click();
		   e.sendKeys(email);
	   }
	 public static void passAction(String pass) {
		   WebElement e = passElement();
		   e.click();
		   e.sendKeys(pass);
	   }
	 public static void btnAction() {
		   WebElement e = btnElement();
		   e.submit();
		   
	   }
	 
}

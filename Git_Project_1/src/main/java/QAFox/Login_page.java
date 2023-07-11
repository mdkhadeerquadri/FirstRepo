package QAFox;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_page extends DriverClass {
	// by
	static By byac = By.xpath("//span[text()=\"My Account\"]");
	static By bylog = By.xpath("//a[text()=\"Login\"]");
	static By byemail = By.xpath("//input[@id=\"input-email\"]");
	static By bypass = By.xpath("//input[@id=\"input-password\"]");
	static By bybtn = By.xpath("//input[@class=\"btn btn-primary\"]");
	static By bycomponant = By.xpath("//a[text()=\"Components\"]");
	static By byallitem = By.xpath("//a[text()=\"Monitors (2)\"]");
	static By byitem = By.xpath("//button[@onclick=\"cart.add('42', '2');\"]");
	static By byradio = By.xpath("//input[@name='option[218]' and @value='7']");
	static By bycheckbox = By.xpath("//input[@value='8']");
	static By bytext = By.xpath("//input[@name=\"option[208]\"]");
	static By byselect =By.xpath("//select");
	static By bytextarea = By.xpath("//textarea[@id='input-option209']");
	static By byfile =  By.xpath("//button[@id=\"button-upload222\"]");
	static By bydate = By.xpath("//input[@id=\"input-option219\"]");
	static By bytime = By.xpath("//input[@id=\"input-option221\"]");
	static By bydatetime =By.xpath("//input[@id=\"input-option220\"]");
	static By byaddcart = By.xpath("//button[@id=\"button-cart\"]");
	
	// element
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

	public static WebElement componantElement() {
		return d.findElement(bycomponant);
	}

	public static WebElement allitemElement() {
		return d.findElement(byallitem);
	}

	public static WebElement itemElement() {
		return d.findElement(byitem);
	}
	public static WebElement radioElement() {
		return d.findElement(byradio);
	}
	public static WebElement checkboxElement() {
		return d.findElement(bycheckbox);
	}
	public static WebElement textElement() {
		return d.findElement(bytext);
	}
	public static WebElement selectElement() {
		return d.findElement(byselect);
	}
	public static WebElement textareaElement() {
		return d.findElement(bytextarea);
	}
	public static WebElement fileElement() {
		return d.findElement(byfile);
	}
	public static WebElement dateElement() {
		return d.findElement(bydate);
	}
	public static WebElement timeElement() {
		return d.findElement(bytime);
	}
	public static WebElement datetimeElement() {
		return d.findElement(bydatetime);
	}
	public static WebElement addcartElement() {
		return d.findElement(byaddcart);
	}


	// actions
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

	public static void componantAction() {
		WebElement e = componantElement();
		e.click();

	}

	public static void allitemAction() {
		WebElement e = allitemElement();
		e.click();

	}

	public static void itemAction() {
		WebElement e = itemElement();
		e.click();

	}
	public static void radioAction() {
		WebElement e = radioElement();
		e.click();

	}

	public static void checkboxAction() {
		WebElement e = checkboxElement();
		e.click();

	}
	public static void textAction() {
		WebElement e = textElement();
		e.click();
		e.sendKeys("Buy my first apple TV");

	}
	public static void selectAction() {
		WebElement e = selectElement();
		e.click();

	}
	public static void textareaAction() {
		WebElement e = textareaElement();
		e.click();
		e.sendKeys("Good product");
	}
	public static void fileAction() throws AWTException {
		
		WebElement e = fileElement();
		e.sendKeys("C:\\FileHandling\\text.txt");		
	}
	public static void dateAction(String date) {
		WebElement e = dateElement();
		e.click();
		e.clear();
		e.sendKeys(date);
	}
	public static void timeAction(String time) {
		WebElement e = timeElement();
		e.click();
		e.clear();
		e.sendKeys(time);
	}
	public static void datetimeAction(String dtime) {
		WebElement e = datetimeElement();
		e.click();
		e.clear();
		e.sendKeys(dtime);
	}
	public static void addcartAction() {
		WebElement e = addcartElement();
		e.click();

	}

}

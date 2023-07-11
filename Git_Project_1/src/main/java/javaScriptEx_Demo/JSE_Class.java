package javaScriptEx_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE_Class {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.jiomart.com/c/groceries/fruits-vegetables/219?prod_mart_groceries_products_popularity%5Bpage%5D=4");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		
		//scroll window
		//js.executeScript("window.scrollBy(0,2050)","");
		
		
		WebElement e = d.findElement(By.xpath("//div[text()=' Watermelon Kiran Big 1 pc (Approx. 2800 g - 4000 g) ']"));
		
		//scroll to view element
		js.executeScript("arguments[0].scrollIntoView();",e);
		

		
	}

}

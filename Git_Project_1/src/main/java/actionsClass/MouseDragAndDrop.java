package actionsClass;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {

	public static void main(String[] args) 
	{
		WebDriver d = new ChromeDriver();
		Actions a = new Actions(d);
		d.get("https://demoqa.com/droppable/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.manage().window().maximize();

		By drag = By.xpath("//div[@id='draggable']");
		WebElement drage = d.findElement(drag);
		
		By drop = By.xpath("//div[@id='droppable']//p[text()='Drop here']");
		WebElement drope = d.findElement(drop);
		
		a.dragAndDrop(drage, drope);
		
	}
}

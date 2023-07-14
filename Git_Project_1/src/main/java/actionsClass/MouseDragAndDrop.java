package actionsClass;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import DriverPackage.CallDriver;

public class MouseDragAndDrop extends CallDriver{

	public static void main(String[] args) 
	{
		

		By drag = By.xpath("//div[@id='draggable']");
		WebElement drage = d.findElement(drag);
		
		By drop = By.xpath("//div[@id='droppable']//p[text()='Drop here']");
		WebElement drope = d.findElement(drop);
		Actions a = new Actions(d);
		a.dragAndDrop(drage, drope);
		
	}
}

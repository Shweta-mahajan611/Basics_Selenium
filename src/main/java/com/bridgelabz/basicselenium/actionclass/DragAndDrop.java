package com.bridgelabz.basicselenium.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class DragAndDrop extends Base
{
	Base base;
	@Test
	public void test()
	{
		base = new Base();
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement block1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		
		Actions actions = new Actions(driver);
		
		// drag block 1 element and drop it on block 2 element
		actions.dragAndDrop(block1, block3).perform();
	}
}

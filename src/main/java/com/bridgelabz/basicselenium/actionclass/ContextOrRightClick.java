package com.bridgelabz.basicselenium.actionclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class ContextOrRightClick extends Base
{
	static Base base;
	
	@Test
	public void test() throws AWTException
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//find the ActiTIME Inc. link
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		
		//right click (context click) on actitime link
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//press 'w' from the keyboard for opening in a new window
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		//quit() method closes all the browsers opened by Selenium
		driver.quit();
	}
}

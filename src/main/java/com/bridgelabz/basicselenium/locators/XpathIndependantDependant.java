package com.bridgelabz.basicselenium.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;
/**
 * 
 * @author Shweta Mahajan
 * Xpath using independant dependant concept to click on setByDefault
 *
 */
public class XpathIndependantDependant extends Base
{
	@Test
	public void clickOnSetByDefault() throws InterruptedException
	{
		driver.get("https://demo.actitime.com/login.do");
		String xp = "//input[@class='textField'][ @id = 'username']";
		Thread.sleep(2000);

		// Enter data(admin) in username textbox
		driver.findElement(By.xpath(xp)).sendKeys("admin");
		Thread.sleep(2000);

		// find password element using xpath by attribute and enter password(manager) into password textbox.
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);

		//Click on settings tab on home page
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[1]")).click();
		Thread.sleep(2000);

		//Click on Types of Work link
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		Thread.sleep(4000);
		
		//Click on testing link present under Type of work column
		driver.findElement(By.xpath("//a[.='testing']/../..//a[.='set by default']")).click();
	
	}
}

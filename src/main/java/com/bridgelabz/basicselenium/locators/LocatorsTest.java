package com.bridgelabz.basicselenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridgelabz.basicselenium.base.Base;
/**
 * 
 * @author Shweta Mahajan
 * Find web element by id, name and class name
 *
 */
public class LocatorsTest extends Base
{
	static Base base;
	
	public static void main(String []args) throws InterruptedException
	{
		base = new Base();
		driver.get("https://www.gmail.com");
		WebElement email = driver.findElement(By.id("identifierId"));
		email.clear();
		//Enter value into username textbox
		email.sendKeys("mahajanshweta611@gmail.com");
		Thread.sleep(2000);
		
		WebElement next1 = driver.findElement(By.className("CwaK9"));
		next1.click();
		Thread.sleep(2000);
		
		//Used “name” locator to find Password text box
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("7028390954");
		Thread.sleep(2000);
		
		WebElement next2 = driver.findElement(By.id("passwordNext"));
		next2.click();
		Thread.sleep(2000);
	}
}

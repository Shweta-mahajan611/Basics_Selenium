package com.bridgelabz.basicselenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;
/**
 * 
 * @author Shweta Mahajan
 * Css selector using class name, id and type
 *
 */
public class CssSelector extends Base 
{
	Base base;
	@Test
	public void testCssSelector() throws InterruptedException 
	{
		//base = new Base();
		driver.get("https://www.gmail.com");
		// Css selector using id
		WebElement email = driver.findElement(By.cssSelector("input[id='identifierId']"));
		email.sendKeys("mahajanshweta611@gmail.com");
		Thread.sleep(2000);

		// Css selector using class
//		WebElement email1 = driver.findElement(By.cssSelector("input[class='whsOnd zHQkBf']"));
//		email1.sendKeys("mahajanshweta611@gmail.com");
//		Thread.sleep(2000);
//				
		// Css selector using class name(.)
		WebElement idnext = driver.findElement(By.cssSelector(".CwaK9"));
		idnext.click();
		Thread.sleep(2000);

		// Css selector using type
		WebElement pwd = driver.findElement(By.cssSelector("input[type='password']"));
		pwd.sendKeys("7028390954");
		Thread.sleep(2000);

		// Css selector using id(#)
		WebElement pwdnext = driver.findElement(By.cssSelector("#passwordNext"));
		pwdnext.click();
		Thread.sleep(2000);
	}
}

package com.bridgelabz.seleniumbasics.webelementinfmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class RemoveValuefromTextByClearMethod extends Base 
{
	Base base;
	@Test
	public void clearText() throws InterruptedException 
	{
		base = new Base();
		driver.get("https://www.gmail.com");
		
		//find email textbox
		driver.findElement(By.id("identifierId")).sendKeys("mahajanshweta611@gmail.com");
		
		//get value from email textbox
		String value = driver.findElement(By.id("identifierId")).getAttribute("value");
		System.out.println("Value present in username textbox is : "+value);
		
		//Remove value from email textbox
		driver.findElement(By.id("identifierId")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifierId")).sendKeys("mahajanshweta611@gmail.com");
		Thread.sleep(2000);
		
		//this line will actually delete the value if there is no space in the text entered
		driver.findElement(By.id("identifierId")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
		//if there is a space between two words in the username field, we have to use the below lines of code
		driver.findElement(By.id("identifierId")).sendKeys(Keys.CONTROL+"a") ;
		driver.findElement(By.id("identifierId")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);
	}

}

package com.bridgelabz.basicselenium.pagevalidate;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class VerifyHomePageByTitle extends Base
{
	Base base;
	@Test
	public void test() throws InterruptedException
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(1000);
		
		String expectedTitle = "actiTIME";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//If actual title contains "Enter Time" text then home page is displayed.
		if (actualTitle.contains(expectedTitle)) 
		{
		    System.out.println("Home page is displayed");
		}
		else
		{
		    System.out.println("Home page is NOT displayed");
	    }
	}
}

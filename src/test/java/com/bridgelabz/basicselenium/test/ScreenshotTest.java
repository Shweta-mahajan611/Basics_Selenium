package com.bridgelabz.basicselenium.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.screenshots_fail_tcs.Base;
import com.bridgelabz.basicselenium.screenshots_fail_tcs.CustomListener;


@Listeners(CustomListener.class)
public class ScreenshotTest extends Base
{
	@BeforeMethod
	public void setUp()
	{
		initialization();	
	}
	
	@Test
	public void takeScreenshotTest() throws InterruptedException
	{
		String title = driver.getTitle();
		Assert.assertEquals("Facebook log in or sign up", "title");
		driver.findElement(By.id("email")).sendKeys("shweta@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("shweta1234");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

package com.bridgelabz.seleniumbasics.webelementinfmethods;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class ViewLicensLink extends Base
{
	Base base;
	@Test
	public void getLicensLink()
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		
		String tagName = driver.findElement(By.id("licenseLink")).getTagName();
		if (tagName.equals("a")) 
		{
			System.out.println("View LIcence is a link");
		} 
		else
		{
			System.out.println("View LIcence is NOT a link");
		}
	}

}

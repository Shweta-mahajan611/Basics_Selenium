package com.bridgelabz.seleniumbasics.webelementinfmethods;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class VerifyCheckKeepMeLoggedIn extends Base
{
	Base base;
	@Test
	public void verifyCheckbox()
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		String elementType = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("type");
		System.out.println(elementType);
		if(elementType.equalsIgnoreCase("checkbox")) 
		{
			System.out.println("it is a checkbox");
		}
		else
		{
			System.out.println("it is NOT a checkbox");
		}
	}

}

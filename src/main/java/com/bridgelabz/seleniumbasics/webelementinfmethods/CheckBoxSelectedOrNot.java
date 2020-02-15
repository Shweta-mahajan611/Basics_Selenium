package com.bridgelabz.seleniumbasics.webelementinfmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class CheckBoxSelectedOrNot extends Base
{
	Base base;
	@Test
	public void verifyCheckboxSelction()
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//find the Keep me Logged in Checkbox
		WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		//select the checkbox
		Checkbox.click();
		if (Checkbox.isSelected()) 
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is NOT selected");
		}
	}

}

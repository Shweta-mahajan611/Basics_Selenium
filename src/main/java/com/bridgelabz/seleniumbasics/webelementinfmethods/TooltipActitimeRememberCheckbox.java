package com.bridgelabz.seleniumbasics.webelementinfmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class TooltipActitimeRememberCheckbox extends Base {
	Base base;
	@Test
	public void checkboxVerify()
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		
		//find the Keep me Logged in Checkbox
		WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		//get the tooltip text using getAttribute() method and store in a variable
		String tooltipText = Checkbox.getAttribute("id");
		System.out.println(tooltipText);
	}

}

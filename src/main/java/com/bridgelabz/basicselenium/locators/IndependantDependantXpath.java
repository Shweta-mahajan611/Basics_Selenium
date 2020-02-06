package com.bridgelabz.basicselenium.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;
/**
 * 
 * @author Shweta Mahajan
 * Xpath using independant dependant concept
 */
public class IndependantDependantXpath extends Base
{
	Base base;
	@Test
	public void test()
	{
		base =  new Base();
		driver.get("http://www.seleniumhq.org/download/");
		
		// xpath using independent and dependent concept
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		System.out.println(" Downloaded the link of Selenium-Java from selenium website ");
	}
}

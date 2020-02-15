package com.bridgelabz.seleniumbasics.webelementinfmethods;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class CheckVersionofActiTimeLoginPage extends Base
{
	Base base;
	@Test
	public void checkVersion()
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		
		String xpathforVersion = "//nobr[contains(text(),'actiTIME')]";
		String version = driver.findElement(By.xpath(xpathforVersion)).getText();
		System.out.println("Version of actitime on login page is : " + version);
	}

}

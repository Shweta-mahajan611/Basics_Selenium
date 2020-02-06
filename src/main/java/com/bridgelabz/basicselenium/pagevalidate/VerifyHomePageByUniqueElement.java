package com.bridgelabz.basicselenium.pagevalidate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class VerifyHomePageByUniqueElement extends Base
{
	Base base;
	@Test
	public void test() throws InterruptedException
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		
		//entering text into the focussed (active)element
		driver.switchTo().activeElement().sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(1000);
		
		WebElement logoutBtn = driver.findElement(By.xpath("//a[.='Logout']"));
		if (logoutBtn.isDisplayed()) {
		System.out.println("Home page is displayed");
		} else{
		System.out.println("Home page is NOT displayed");
		}
	}
	
}

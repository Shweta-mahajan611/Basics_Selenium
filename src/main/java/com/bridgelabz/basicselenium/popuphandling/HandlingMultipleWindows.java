package com.bridgelabz.basicselenium.popuphandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindows
{
	@Test
	public void handlingMultipleWindow() throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//get the window handle id of the parent browser window
		String parentwindowHandle = driver.getWindowHandle();
		System.out.println("parent window handle "+parentwindowHandle);
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		//enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		
		//click on actiTIME INC link
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		
		//get the number of windows currently opened on the system
		Set<String> allwindows = driver.getWindowHandles();
		
		//switch to all the browser windows
		for (String window : allwindows) 
		{
		     driver.switchTo().window(window);
		}
		//get the title of the tab
		String childtitle = driver.getTitle();
		System.out.println("Title of the child tab is :"+ childtitle);
		Thread.sleep(2000);
		
		//close the child tab
		driver.close();
		
		//switch back to the main browser window
		driver.switchTo().window(parentwindowHandle);
		
		//close the main browser window
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//closing the parent window
		driver.close();
				
	}

}

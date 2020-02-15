package com.bridgeit.basicselenium.verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class VerifyUnamePwdAlignment extends Base
{
	Base base;
	@Test
	public void verifyUnamePwd()
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//Verifying user_name alignments
		WebElement uname = driver.findElement(By.id("username"));
		int uname_x = uname.getLocation().getX();
		int uname_width = uname.getSize().getWidth();
		int uname_height = uname.getSize().getHeight();
		
		//Verifying password alignments
		WebElement pwTB = driver.findElement(By.name("pwd"));
		int pwd = pwTB.getLocation().getX();
		int pwd_width = pwTB.getSize().getWidth();
		int pwd_height = pwTB.getSize().getHeight();
		
		//To check whether user_name and password textbox are align or not
		if (uname_x == pwd && uname_width==pwd_width && uname_height==pwd_height) 
		{
			System.out.println("Username and password text box are aligned");
		} 
		else 
		{
			System.out.println("Username and password text box are NOT aligned");
		}
	}

}

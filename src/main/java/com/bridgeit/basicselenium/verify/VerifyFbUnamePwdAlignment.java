package com.bridgeit.basicselenium.verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

/**
 * Verify Facebook username and password alignment for same row
 * @author shweta Mahajan
 *
 */
public class VerifyFbUnamePwdAlignment extends Base
{
	Base base;
	@Test
	public void verifyUnmaePwd()
	{
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.id("email"));
		
		// get the y-coordinate of username field
		int uname_Ycordinate = uname.getLocation().getY();
		System.out.println(uname_Ycordinate);
		
		WebElement pwd = driver.findElement(By.name("pass"));
		
		// get the y-coordinate of password field
		int pwd_Ycordinate = pwd.getLocation().getY();
		System.out.println(pwd_Ycordinate);
		
		//check whether the Y-coordinate of username and password field are same
		if (uname_Ycordinate==pwd_Ycordinate) 
		{
			System.out.println("Both username and password fields are displayed in the same row");
		}
		else
		{
			System.out.println("username and password fields are NOT aligned in the same row");
		}
	}

}

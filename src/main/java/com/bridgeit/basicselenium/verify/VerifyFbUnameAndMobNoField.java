package com.bridgeit.basicselenium.verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class VerifyFbUnameAndMobNoField extends Base
{
	Base base;
	@Test
	public void verifyUnameMobno()
	{
		base = new Base();
		System.setProperty("webdriver.chrome.driver", "/home/bridgeit/Desktop/selenium jars/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//find username field
		WebElement uname = driver.findElement(By.id("email"));
		
		//alignments of username textbox
		int uname_height = uname.getSize().getHeight();
		System.out.println("Height of username textbox = "+uname_height);
		int uname_width = uname.getSize().getWidth();
		System.out.println("Width of username textbox = "+uname_width);
		
		//find mobile_no field
		WebElement mobNo = driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]"));
		
		//alignment of mobile_no textbox
		int mobNo_height = mobNo.getSize().getHeight();
		System.out.println("Height of mobile_no textbox = "+mobNo_height);
		int mobNo_width = mobNo.getSize().getWidth();
		System.out.println("Width of mobile_no textbox = "+mobNo_width);

		if (uname_width==mobNo_width) 
		{
			System.out.println("Size of username and password fields are same that is : " 
					+uname_width+" = "+mobNo_width);
		}
		else
		{
			System.out.println("Size of username and password fields are NOT same that is : "
				    +uname_width+" Not equals to " + mobNo_width);
	    }
	}
}

package com.bridgelabz.seleniumbasics.webelementinfmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class XpathForErrorMsg extends Base
{
	Base base;
	@Test
	public void verifyErrorMsg() throws InterruptedException 
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");

		// xpath using multiple attributes
		String xp = "//input[@class='textField'][ @id = 'username']";
		Thread.sleep(2000);

		// Enter data(shweta) in username textbox
		driver.findElement(By.xpath(xp)).sendKeys("shweta");
		Thread.sleep(2000);

		// find password element using xpath and enter password(12345) into password textbox.
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("12345");
		Thread.sleep(2000);

		// find element on web page using xpath's text()
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);

		// Find element on webpage using xpath's text()
		boolean error = driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]")).isDisplayed();
		if(error)
			System.out.println("Error msg for invalid username and password is diplayed");
		
		
		WebElement errMsg = driver.findElement(By.xpath("//span[contains(.,'invalid')]"));;
		String errtext = errMsg.getText();
		
		//get the value of color 
		String c = errMsg.getCssValue("color");
		
		//convert the color from string type to hexa form
		String ColorasHex = Color.fromString(c).asHex();
		System.out.println("hexadecimal format : "+ColorasHex);
		
		if(ColorasHex.equals("#ce0100"))
		{
			System.out.println("Error msg is in red color");
		}
		else
		{
			System.out.println("Error msg is not in red color");
		}
		
		//get the font size of the error message
		String fontSize = errMsg.getCssValue("font-size");
		
		//get the weight of the font of error message
		String fontWeight = errMsg.getCssValue("font-weight");
		System.out.println("Size of the font is :" + fontSize);
		System.out.println("Weight of the font is :" + fontWeight);
		
		
	}

}

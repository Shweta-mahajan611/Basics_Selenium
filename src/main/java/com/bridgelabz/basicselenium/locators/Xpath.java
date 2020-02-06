package com.bridgelabz.basicselenium.locators;

import org.openqa.selenium.By;

import com.bridgelabz.basicselenium.base.Base;
/**
 * 
 * @author Shweta Mahajan
 * Xpath locator
 */
public class Xpath extends Base
{
	static Base base;
	
	public static void main(String[] args) throws InterruptedException 
	{
		base = new Base();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		// xpath using multiple attributes
		String xp = "//input[@class='textField'][ @id = 'username']";
		Thread.sleep(2000);

		// Enter data(shweta) in username textbox
		driver.findElement(By.xpath(xp)).sendKeys("admin");
		Thread.sleep(2000);

		// find password element using xpath by attribute and enter password(12345) into
		// password textbox.
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);

		// find image on web page using xpath by attribute and check is it display?
		boolean logo = driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		if (logo)
			System.out.println("logo is displayed");

		// find link on web page using xpath
		boolean url = driver.findElement(By.xpath("//a[@href = 'http://www.actitime.com']")).isDisplayed();
		if (url)
			System.out.println("link displayed");

		// find element on web page using xpath's contains() and text()
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		Thread.sleep(2000);

	}

}

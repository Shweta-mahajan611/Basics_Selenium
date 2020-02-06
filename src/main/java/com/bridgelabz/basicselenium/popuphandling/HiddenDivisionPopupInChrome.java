package com.bridgelabz.basicselenium.popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopupInChrome 
{

	@Test
	public static void main() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--disable-geolocation");
		option.addArguments("--ignore-certificate-errors");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		
		driver1.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		Thread.sleep(3000);
		
		driver1.findElement(By.linkText("24")).click();
		
	}

}

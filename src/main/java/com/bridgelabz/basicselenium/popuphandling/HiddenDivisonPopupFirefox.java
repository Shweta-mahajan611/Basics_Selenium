package com.bridgelabz.basicselenium.popuphandling;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisonPopupFirefox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Date d = new Date();
		String str = d.toString();
		String[] str2 = str.split(" ");
		String today = str2[2];
		 
		WebDriverManager.chromedriver().setup();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("geo.enabled", false);
		
		//Use DesiredCapabilities class to modify the firefox settings 
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(FirefoxDriver.PROFILE, profile);
				
		//Launch the firefox browser with the above modified settings
		WebDriver driver = new FirefoxDriver(cap);
				
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("24")).click();	
		
	}

}

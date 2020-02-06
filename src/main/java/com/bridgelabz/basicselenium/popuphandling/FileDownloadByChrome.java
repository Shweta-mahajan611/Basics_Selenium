package com.bridgelabz.basicselenium.popuphandling;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author Shweta Mahajan
 * File download popup using chrome
 *
 */
public class FileDownloadByChrome
{
	WebDriver driver;
	File folder;
	File file;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		//88899-995581-989899-80808
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		//Create Hashmap object and assign the profile settings
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);       //0 - disable popup
		chromePrefs.put("download.default_directory", folder.getAbsolutePath());
				
		//Assign this chromePrefs object with ChromeOptions object
		options.setExperimentalOption("prefs", chromePrefs);
				
		//Create Capability object and assign to the option object
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(cap);	
		
	}
	
	@Test
	public void downloadFileTest() throws InterruptedException
	{
		driver.get("http://the-internet.herokuapp.com/download");
		Thread.sleep(3000);
		driver.findElement(By.linkText("some-file.txt")).click();
		Thread.sleep(2000);
		File listOfFiles[] = folder.listFiles();
		//to check folder is empty or not
		Assert.assertTrue(listOfFiles.length>0);
		
		for(File file : listOfFiles)
		{
			Assert.assertTrue(file.length()>0);
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
//		for(File file : folder.listFiles())
//		{
//			file.delete();
//		}
//		folder.delete();
	}
}

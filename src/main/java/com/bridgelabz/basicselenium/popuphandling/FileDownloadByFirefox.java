package com.bridgelabz.basicselenium.popuphandling;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author Shweta Mahajan
 * File download popup using firefox
 *
 */
public class FileDownloadByFirefox 
{
	WebDriver driver;
	File folder;
	File file;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		String file = "/home/bridgeit/bootcamp/BasicsSelenium";
		folder = new File(file);
		folder.mkdir();
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxProfile profile = new FirefoxProfile();
		//save the file to the given folder location
		profile.setPreference("browser.download.dir", folder.getAbsolutePath());
		
		// 0 - save to desktop, 1 - save to download folder( default), 2 - save to any other //location
		profile.setPreference("browser.download.folderList", 1);
		
		//Set the Key so that it will not show the file download pop up on the screen
		String key = "browser.helperApps.neverAsk.saveToDisk";
		
		//Set the type of file which you want to downloadString value = "application/zip";
		String value = "image/jpeg, application/pdf";
		profile.setPreference("key",value );
		
		profile.setPreference("pdfjs.disable", true);
		
		//Use DesiredCapabilities class to modify the firefox settings 
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(FirefoxDriver.PROFILE, profile);
		
		driver = new FirefoxDriver(cap);
	}
	
	@Test
	public void downloadFileTest() throws InterruptedException
	{
		driver.get("http://the-internet.herokuapp.com/download");
		Thread.sleep(3000);
		driver.findElement(By.linkText("some-file.txt")).click();	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

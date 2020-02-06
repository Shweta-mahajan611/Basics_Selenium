package com.bridgelabz.basicselenium.popuphandling;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadFromChrome extends Base
{

	@Test
	public void fileDownload() throws InterruptedException 
	{
		//Create Hashmap object and assign the profile settings
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "D:\\");
		
		//Assign this chromePrefs object with ChromeOptions object
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		//Create Capability object and assign to the option object
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		String xp = "//td[.='Java']/following-sibling::td/a[.='Download']";
		driver.findElement(By.xpath(xp)).click();
	}

}

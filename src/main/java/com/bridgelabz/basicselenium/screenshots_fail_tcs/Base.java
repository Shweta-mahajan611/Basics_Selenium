package com.bridgelabz.basicselenium.screenshots_fail_tcs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static public WebDriver driver;

	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	public String failed(String screenshotNm) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		System.out.println("Screenshot"+screenshot);
		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
		String dest = "/home/bridgeit/bootcamp/Screenshots/screenshots/"+screenshotNm+".png";
		File destfile = new File(dest);
		FileUtils.copyFile(srcfile, destfile);
		return dest;
	}
}

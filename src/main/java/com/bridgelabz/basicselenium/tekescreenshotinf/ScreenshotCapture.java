package com.bridgelabz.basicselenium.tekescreenshotinf;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class ScreenshotCapture extends Base
{
	Base base;
	@Test
	public void takeScreenshot()
	{
		base = new Base();
		driver.get("https://www.google.com");
		Date d = new Date();
		String date1 = d.toString();
		System.out.println(date1);

		String date2 = date1.replaceAll(":", "_");
		System.out.println(date2);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);          //get the source file using getScreenshotAs() and storing in a file
		File destFile = new File(
				"/home/bridgeit/bootcamp/BasicsSelenium" + "/screenshots/" + date2 + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);                      //file io operations

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}

package com.bridgelabz.basicselenium.popuphandling;

import java.util.Set;

import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class CloseMainBrowser extends Base
{
	@Test
	public void closeMainBrowser()
	{
		
		driver.get("https://www.naukri.com/");
		
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		
		for (String windowHandle : allWindowHandles) 
		{
			//switch to each browser window
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			
			/* compare the window id with the Parent browser window id, if both are equal, then
			only close the main browser window.*/
			if (windowHandle.equals(parentWindowhandleID))
			{
				driver.close();
				System.out.println("Main Browser window with title -->"+ title +" --> is closed");
			}
		}
	}

}

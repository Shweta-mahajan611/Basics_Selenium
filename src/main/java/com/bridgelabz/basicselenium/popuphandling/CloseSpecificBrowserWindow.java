package com.bridgelabz.basicselenium.popuphandling;

import java.util.Set;

import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class CloseSpecificBrowserWindow extends Base
{
	@Test
	public void closeSpecificBrowser() 
	{	
		driver.get("https://www.naukri.com/");
		
		//Set the expected title of the browser window which you want to close
		String expected_title = "LnT";
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		
		for (String windowHandle : allWindowHandles)
		{
			//switch to each browser window
			driver.switchTo().window(windowHandle);
			String actual_title = driver.getTitle();
			
			//Compare the actual title with the expected title
			if (actual_title.contains(expected_title))
			{
				driver.close();
				System.out.println("Secified Browser window with title -->"+ actual_title +" --> is closed");
			}
		}		
	}

}

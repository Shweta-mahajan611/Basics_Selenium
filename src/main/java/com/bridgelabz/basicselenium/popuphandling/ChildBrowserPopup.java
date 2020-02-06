package com.bridgelabz.basicselenium.popuphandling;

import java.util.Set;

import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class ChildBrowserPopup extends Base
{
	@Test
	public void main() throws InterruptedException
	{
		
		driver.get("https://www.naukri.com/");
		
		//using getWindowHandles(), get a set of window handle IDs
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		//using size(), get the count of total number of browser windows
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		
		for (String windowHandle : allWindowHandles) 
		{
		//switch to each browser window
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		
		//print the window handle id of each browser window
		System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandle);
		
		//close all the browsers one by one
		driver.close();
		}
	}

}

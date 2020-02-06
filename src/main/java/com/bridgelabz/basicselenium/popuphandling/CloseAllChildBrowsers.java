package com.bridgelabz.basicselenium.popuphandling;

import java.util.Set;
import org.testng.annotations.Test;
import com.bridgelabz.basicselenium.base.Base;

public class CloseAllChildBrowsers extends Base
{
	@Test
	public static void main() 
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
			
			/* compare the window id of all the browsers with the Parent browser window id, if it
			is not equal, then only close the browser windows.*/
			if (!windowHandle.equals(parentWindowhandleID)) 
			{
				driver.close();
				System.out.println("Child Browser window with title -->"+ title +" --> is closed");
			}		
		}			
	}

}

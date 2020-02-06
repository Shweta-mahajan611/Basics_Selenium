package com.bridgelabz.basicselenium.popuphandling;

import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class ChildBrowserOrWindowHandle extends Base
{
	@Test
	public void main()
	{
		driver.get("http://www.seleniumhq.org/download/");
		
		//get the window handle id of the browser
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

}

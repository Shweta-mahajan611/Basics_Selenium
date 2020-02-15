package com.bridgelabz.basicselenium.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait extends Base
{
	@Test
	public void main()
	{
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		String expectedTitle = "Demo Guru99 Page";
		
		//get the actual value of the title
		String actualTitle = driver.getTitle(); ;
	
		//compare the actual title with the expected title
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println( "Test Passed") ;
		}
		else
		{
			System.out.println( "Test Failed" );
		}
		//close browser
		driver.close();
	}

}

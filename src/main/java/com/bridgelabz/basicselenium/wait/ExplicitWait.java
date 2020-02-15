package com.bridgelabz.basicselenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait extends Base
{
	@Test
	public void main()
	{	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
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
		WebElement seleniumlink;
		//visibilityOfElementLocated is the expected condition
		seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Selenium')]")));
		seleniumlink.click();
	}

}

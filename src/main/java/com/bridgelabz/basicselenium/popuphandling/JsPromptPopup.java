package com.bridgelabz.basicselenium.popuphandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsPromptPopup
{
		@Test
		public static void main() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
			
			//find this button : "Say my name"
			driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
			Thread.sleep(2000);
			
			//Switch to alert pop up
			Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			
			//print the text present on the alert pop up
			System.out.println(alert.getText());
			Thread.sleep(2000);
			
			//enter your name in the text box present on the alert pop up
			alert.sendKeys("Jay");
			Thread.sleep(2000);
			
			//click on OK button
			alert.accept();
			Thread.sleep(2000);
			
			//print the text present on the second alert pop up
			System.out.println(alert.getText());
			
			//click on Cancel button
			//alert.dismiss();
	    }

}

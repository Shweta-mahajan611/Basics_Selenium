package com.bridgelabz.basicselenium.popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class FileUploadPopup extends Base
{
	@Test
	public static void main() throws InterruptedException 
	{
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		
		WebElement choosefile = driver.findElement(By.id("uploadfile_0"));

        // enter the file path into the file-selection input field
        choosefile.sendKeys("/home/bridgeit/Desktop/fileupload.txt");
        Thread.sleep(2000);
        
        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();
        Thread.sleep(2000);
        
        // click the UploadFile/submitFile button
        driver.findElement(By.id("submitbutton")).click();
        Thread.sleep(2000);
        
        System.out.println("File has been uploaded successfully....");
	}

}

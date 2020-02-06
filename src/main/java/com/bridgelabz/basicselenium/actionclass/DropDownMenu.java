package com.bridgelabz.basicselenium.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.bridgelabz.basicselenium.base.Base;

public class DropDownMenu extends Base
{
	Base base;
	@Test
	public void test() throws InterruptedException
	{
		base = new Base();
		driver.get("http://www.istqb.in/");
		
		WebElement foundation = driver.findElement(By.xpath("//body[contains(@class,'header-default navbar-default layout-full headertype-sticky su-shortcodes-loaded')]/div[contains(@class,'layout-full-wrapper ls-overflow-visible')]/div[contains(@class,'header-top-wrapper')]/div[contains(@class,'tm-header-wrapper')]/div[contains(@class,'uk-sticky-placeholder')]/div[contains(@class,'tm-headerbar uk-clearfix')]/div[@id='tmMainMenu']/nav[contains(@class,'tm-navbar-full')]/div[contains(@class,'uk-navbar')]/div[contains(@class,'uk-visible-large uk-navbar-flip')]/ul[contains(@class,'uk-navbar-nav uk-hidden-small')]/li[3]/a[1]"));
		Actions actions = new Actions(driver);
		
		//mouse hover on Foundation tab
		actions.moveToElement(foundation).perform();
		Thread.sleep(3000);
		WebElement enrollment = driver.findElement(By.xpath("//body[contains(@class,'header-default navbar-default layout-full headertype-sticky su-shortcodes-loaded')]/div[contains(@class,'layout-full-wrapper ls-overflow-visible')]/div[contains(@class,'header-top-wrapper')]/div[contains(@class,'tm-header-wrapper')]/div[contains(@class,'uk-sticky-placeholder')]/div[contains(@class,'tm-headerbar uk-clearfix')]/div[@id='tmMainMenu']/nav[contains(@class,'tm-navbar-full')]/div[contains(@class,'uk-navbar')]/div[contains(@class,'uk-visible-large uk-navbar-flip')]/ul[contains(@class,'uk-navbar-nav uk-hidden-small')]/li[3]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]"));
		
		//mouse hover on Enrollment
		actions.moveToElement(enrollment).perform();
		Thread.sleep(3000);
		WebElement corporateEnrol = driver.findElement(By.xpath("//li[@class='uk-parent']//ul[@class='uk-nav-sub']//li[@class='uk-parent uk-nav-header'][contains(text(),'CORPORATE ENROLLMENT')]"));
		
		//mouse hover on Corporate Enrollment
		actions.moveToElement(corporateEnrol).perform();
		Thread.sleep(3000);
		
		//click on Corporate Enrollment
		driver.findElement(By.xpath("//li[@class='uk-parent']//ul[@class='uk-nav-sub']//ul//li//a[contains(text(),'ONLINE ENROLLMENT')]")).click();
		driver.close();
	}
}

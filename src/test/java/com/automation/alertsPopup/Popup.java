package com.automation.alertsPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import Listners.Listners;


public class Popup {
	
	@Test

	public void popups()
	{
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		driver.manage().window().maximize();
		
		Listners.driver.findElement(By.id("alertBox")).click();
		Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
	
		
		Listners.driver.switchTo().alert().accept();
		System.out.println(Listners.driver.findElement(By.xpath
				("//div[@id='output']")).getText());
	
		Listners.driver.quit();

}
}
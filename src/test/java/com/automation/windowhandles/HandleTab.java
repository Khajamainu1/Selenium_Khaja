package com.automation.windowhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

public class HandleTab {

	
	@Test
	public void singleWindowandle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parentTab = driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String windowHandle : windowHandles)
		{
			driver.switchTo().window(windowHandle);
		}
		
//		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.quit();
		
}
}
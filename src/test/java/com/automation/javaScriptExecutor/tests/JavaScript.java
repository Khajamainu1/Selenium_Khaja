package com.automation.javaScriptExecutor.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript {

	@Test
	public void explicitWait() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("newTabsBtn"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
		js.executeScript("document.getElementById('newTabsBtn').scrollIntoView()");
		js.executeScript("arguments[0].scrollIntoView()", element);
}
}
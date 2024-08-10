package com.automation.windowhandles;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.util.concurrent.Uninterruptibles;


public class WindowHandle {
	
	@Test
	public void singleWindowandle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window : " + parentWindow + driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		Uninterruptibles.sleepUninterruptibly(6, TimeUnit.SECONDS);
		Set<String> childWindoHandles = driver.getWindowHandles();
		
		for (String windowHandle : childWindoHandles) {
			driver.switchTo().window(windowHandle); 
		
			driver.manage().window().maximize();
			System.out.println(windowHandle + driver.getTitle());
		}
//			Uninterruptibles.sleepUninterruptibly(9, TimeUnit.SECONDS);
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9));
			wait.until(ExpectedConditions.visibilityOfElementLocated(null));
	            WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter First Name']")));

//			WebElement name = driver.findElement(By.xpath("//input[@placeholder='Enter First Name']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);", name);
			
			
			 name.sendKeys("Khaja");
			 System.out.println(name.getText());
			
			driver.close();
		
		
		driver.quit();
		
	}

}

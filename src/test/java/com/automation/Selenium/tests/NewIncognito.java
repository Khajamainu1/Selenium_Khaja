package com.automation.Selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewIncognito {
	
	
	public void prac()
	{
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	String title = driver.getTitle();
	
	driver.navigate().

}
}

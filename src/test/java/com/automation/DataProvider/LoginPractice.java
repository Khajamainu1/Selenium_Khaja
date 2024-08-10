package com.automation.DataProvider;

import com.google.common.util.concurrent.Uninterruptibles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPractice {
	
//	@Test(dataProvider = "LoginData",  dataProviderClass =  ExcelDataSuppliers.class)

    @Test(dataProvider = "dataProviderName", dataProviderClass = ExcelDataSupplier.class)
	public void login(String userName, String password) {
//      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      driver.get("https://opensource-demo.orangehrmlive.com/");
      driver.manage().window().maximize();
      Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
      driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);
      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
      Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
  }
	
//	@DataProvider(name="LoginData")
//	public Object[] getData()  {
//		return ExcelDataSuppliers.getData();
//	}

}

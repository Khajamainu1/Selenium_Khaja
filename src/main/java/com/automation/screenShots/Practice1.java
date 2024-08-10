package com.automation.screenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

public class Practice1 {
	
	@Test
	 
    public void getScreenShot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        
        File destDir = new File("./newScreenShot");
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
        
        File destFile = new File(destDir, "sc.png");
        FileUtils.copyFile(source, destFile);
        
        driver.quit();
    }
}
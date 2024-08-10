package com.automation.screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

public class ScreenShot {
	
	@Test
public void takeScreenShot() throws IOException {
		
//		String path = "./SeleniumJavaLearning/src/test/resources/ScreenshotFolder.jpj";
	     
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        
        TakesScreenshot screen = (TakesScreenshot)driver;
        
       File source =  screen.getScreenshotAs(OutputType.FILE);
       File destDir = new File("./ScreenshotFolder");
       destDir.mkdirs(); // Create the directory if it doesn't exist
       
       // Specify the file name with the correct extension (.png)
       File destFile = new File(destDir, "/screenshot1.png");
        FileUtils.copyFile(source, destFile);
        System.out.println("Screenshot saved");
     
        driver.quit();
	}
}
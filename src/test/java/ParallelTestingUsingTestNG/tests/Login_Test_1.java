package ParallelTestingUsingTestNG.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

public class Login_Test_1 {
	
	@Test
	public void login() {
//      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      driver.get("https://opensource-demo.orangehrmlive.com/");
      driver.manage().window().maximize();
      Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
      driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
      Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
  }

}

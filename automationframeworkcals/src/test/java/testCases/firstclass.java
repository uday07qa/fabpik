package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import setup.Driverlaunch;

public class firstclass extends Driverlaunch {


  @Test
  public static void loginTest() throws InterruptedException 
  {
		      driver.findElement(By.xpath(loc.getProperty("askermelater"))).click();//askermelater
		  //  Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("loginbuttom_account"))).click();//loginbutton
			
		
			Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("emailormobileenter_field"))).sendKeys("9951949669");
			Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("loginbutton_field"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("loginwithpassword_field"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("enterthepassword_field"))).sendKeys("9951949669");
			Thread.sleep(2000);
			driver.findElement(By.xpath(loc.getProperty("loginbuttom_field"))).click();
			
			
			
		}
  
@Test
public void editprofile() throws InterruptedException
{
	
	
	
	
	
	
	
	
	
	
}
}



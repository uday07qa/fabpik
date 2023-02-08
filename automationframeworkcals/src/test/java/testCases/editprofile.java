package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import setup.Driverlaunch;

public class editprofile extends Driverlaunch {
	@Test
	public static void  edprofile() throws InterruptedException 
	{
		firstclass demo= new firstclass();
		demo.loginTest();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("profile_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("editprofile_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("name_field"))).sendKeys("konakanchi");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys("uday143@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("female_radiobutton"))).click();
			
		driver.findElement(By.xpath(loc.getProperty("calendar_field"))).click();
	
	}

}

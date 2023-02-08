package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import setup.Driverlaunch;

public class profileorders extends Driverlaunch {
	
	@Test
	public static void  orders() throws InterruptedException {
		
		firstclass demo= new firstclass();
		demo.loginTest();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("profile_button"))).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(loc.getProperty("payments_field"))).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath(loc.getProperty("orderss_field"))).click();
		driver.findElement(By.xpath(loc.getProperty("oders_cancelled_field"))).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(loc.getProperty("order_delivered_field"))).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(loc.getProperty("order_orderinprocess_field"))).click();
		driver.findElement(By.xpath(loc.getProperty("order_returned_field"))).click();
		driver.findElement(By.xpath(loc.getProperty("order_all_field"))).click();
	
	}

	
	
	
	
	
}

package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import setup.Driverlaunch;

public class addtocartflow extends Driverlaunch {
	
	@Test
	public static void addtocartflow() throws InterruptedException {
		
		firstclass demo = new firstclass();
		demo.loginTest();
		driver.findElement(By.xpath(loc.getProperty("clothingmenu_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("T-shirts_field"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("foziproduct_field"))).click();
		driver.findElement(By.xpath(loc.getProperty("foziproduct_field"))).click();
		
	}

}

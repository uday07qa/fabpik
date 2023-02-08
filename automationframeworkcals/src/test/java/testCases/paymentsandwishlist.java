package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import setup.Driverlaunch;

public class paymentsandwishlist extends Driverlaunch {
	
	@Test
	public static void wishlistandpaymnets() throws InterruptedException {
		
		firstclass demo=new firstclass();
		demo.loginTest();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("profile_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("payments_field"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("orderlistinpayment_field"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("(i)symbol_filed"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("wishlistbelow_editprofile"))).click();
	
	}
@Test

public static void wishlist() {
	
	driver.findElement(By.xpath(loc.getProperty("babypink_movetocart"))).click();
	driver.findElement(By.xpath(loc.getProperty("spinky_deletebutton"))).click();
	driver.findElement(By.xpath(loc.getProperty("desinerneck_button"))).click();
	driver.findElement(By.xpath(loc.getProperty("yearselecter_field"))).click();
}
}

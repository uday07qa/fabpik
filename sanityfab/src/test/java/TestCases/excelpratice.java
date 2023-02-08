package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import SetUp.Driverlaunch1;

public class excelpratice extends Driverlaunch1 {
	
	 private static ChromeDriver wd;

	@Test
	 public static void creatingxl() throws InterruptedException {
		 
		 Thread.sleep(4000);
	driver.manage().deleteAllCookies();
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifiactions");
		 wd= new ChromeDriver(options);
	
		 
	 }

}

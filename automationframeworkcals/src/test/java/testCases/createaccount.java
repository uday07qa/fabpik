package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.addtocartflowObjects;
import setup.Driverlaunch;
import utilities.actions;
import utilities.actions;

public class createaccount extends Driverlaunch {
	@Test
	
	public static void create_account() throws InterruptedException {
		actions.click(loc.getProperty("loginbuttom_account"));
		actions.click(loc.getProperty("askermelater"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(loc.getProperty("emailormobileenter_field"))).sendKeys("9999999999");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("loginbutton_field"))).click();
		driver.findElement(By.xpath(loc.getProperty("fullname_field"))).sendKeys("varma");
		driver.findElement(By.xpath(loc.getProperty("phonenumber_field"))).clear();
		driver.findElement(By.xpath(loc.getProperty("phonenumber_field"))).sendKeys("9898989898");
		driver.findElement(By.xpath(loc.getProperty("phonenumber_field"))).click();
		driver.findElement(By.xpath(loc.getProperty("emailaddress_field"))).sendKeys("uday12yopmail.com");
		driver.findElement(By.xpath(loc.getProperty("creataccountpassword_field"))).sendKeys("0000000000000");
		driver.findElement(By.xpath(loc.getProperty("continuebutton_field"))).click();
		actions.mouseover(addtocartflowObjects.clothingmenu_button, addtocartflowObjects.T_shirts_field);
		
	}

}

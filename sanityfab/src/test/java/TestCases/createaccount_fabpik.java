package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;

import pageObjects.createaccount_objects;

public class createaccount_fabpik extends Driverlaunch1 {

	@Test
	public static void createaccount() throws Exception {
		
		         
	
		actions.sleep(3);
		actions.click(createaccount_objects.askemelater1);
		actions.sleep(3);
		actions.click(createaccount_objects.login_bgutton1);
		
		actions.sleep(3);
		actions.sendkeys(createaccount_objects.emailormobileenter_field1  ,"9666666666");
		actions.sleep(3);
		actions.click(createaccount_objects.loginbutton_field1);
		actions.sendkeys(createaccount_objects.full_name1, "varma");
		actions.sleep(3);
		actions.sendkeys(createaccount_objects.email_address_field1,"varmak90@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actions.scrollbyElement(createaccount_objects.password_field);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		actions.sendkeys(createaccount_objects.password_field, "123456789");
		actions.sleep(2);
		actions.click(createaccount_objects.continue_field);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		actions.sendkeys(createaccount_objects.otp_1_box_field, "1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		actions.sendkeys(createaccount_objects.otp_2_box_field, "2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		actions.sendkeys(createaccount_objects.otp_3_box_field, "3");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		actions.sendkeys(createaccount_objects.otp_four_box_field, "4");
		actions.sleep(2);
	    actions.click(createaccount_objects.resend_otp_field);
	
}


}





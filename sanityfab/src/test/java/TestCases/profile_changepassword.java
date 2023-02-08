package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.profile_changepassword_object;


public class profile_changepassword extends Driverlaunch1 {
	
	@Test
	public static void changepass() throws Exception {
		Thread.sleep(5000);
		loginpage demo = new loginpage();
		demo.loginpage1();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/app-root/app-desktop-header/header/div[1]/div/div/div[3]/ul/li[5]/a/label")).click();
		
		actions.click(profile_changepassword_object.button_profile);
		Thread.sleep(5000);
		actions.click(profile_changepassword_object.changepass_belowprofil_field);
		actions.sleep(3);
		actions.click(profile_changepassword_object.oldpassword_field);
		actions.sleep(3);
		actions.sendkeys(profile_changepassword_object.oldpassword_field,"jcikcjjg");
		actions.sleep(3);
		actions.click(profile_changepassword_object.newpassword_field);
		actions.sleep(3);
		actions.sendkeys(profile_changepassword_object.newpassword_field,"9951949669");
		actions.sleep(3);
		actions.click(profile_changepassword_object.confirmpassword_field);
		actions.sendkeys(profile_changepassword_object.confirmpassword_field,"9951949669");
		actions.sleep(3);
		actions.click(profile_changepassword_object.changepass_submit_button);
		
		
	}
	
	
	

}

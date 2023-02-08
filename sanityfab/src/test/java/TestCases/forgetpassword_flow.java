package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.loginpageObject;

public class forgetpassword_flow extends Driverlaunch1 {

	@Test
	public static void forgetpass() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actions.click(loginpageObject.askemelater);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actions.click(loginpageObject.loginbuttom_account);

		actions.sendkeys(loginpageObject.emailormobileenter_field, "9951949669");
		actions.sleep(3);
		actions.click(loginpageObject.loginbutton_field);
		actions.click(loginpageObject.loginwithpassword_button);

		actions.click(loginpageObject.enterthepassword_field);
		Thread.sleep(2000);
		actions.sendkeys(loginpageObject.enterthepassword_field, "9951949669");
		actions.click(loginpageObject.passeye_icon);
		actions.click(loginpageObject.forgetpassword_button);
		actions.sleep(3);
		actions.sendkeys(loginpageObject.enteremailforgetpass_button, "uday212@yopmail.com");
		actions.click(loginpageObject.sendforgetpass_button);
		driver.navigate().back();
		actions.click(loginpageObject.loginbuttom_account);
		actions.sendkeys(loginpageObject.emailormobileenter_field, "9951949669");
		actions.sleep(3);
		actions.click(loginpageObject.loginbutton_field);
		actions.click(loginpageObject.loginwithpassword_button);
		actions.click(loginpageObject.enterthepassword_field);
		Thread.sleep(2000);
		actions.sendkeys(loginpageObject.enterthepassword_field, "9951949669");

	}

}

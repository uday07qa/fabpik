package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.paymentspageObjects;

public class paymentsinprofile extends Driverlaunch1{
	
	@Test
    public static void payments() throws Exception {
		loginpage demo = new loginpage();
		demo.loginpage1();
		actions.sleep(3);
		actions.click(paymentspageObjects.profile_button);
		actions.sleep(3);
		actions.click(paymentspageObjects.payments);
		actions.sleep(3);
		actions.click(paymentspageObjects.tr1744_id);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     	actions.mouseover(paymentspageObjects.i_button,null);
	
		
	}
}

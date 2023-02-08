package TestCases;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.profile_ordersobject;

public class profile_orders extends Driverlaunch1 {

	
	@Test
	
	public static void orders() throws Exception {
		loginpage demo = new loginpage();
		demo.loginpage1();
				
		actions.sleep(3);
		actions.click(profile_ordersobject.profile_button);
		actions.sleep(3);
		actions.click(profile_ordersobject.orders_button);
		actions.sleep(3);
		actions.click(profile_ordersobject.canceller_field);
		actions.sleep(3);
		actions.click(profile_ordersobject.delivered_field);
		actions.sleep(3);
		actions.click(profile_ordersobject.orderinprocess_files);
		actions.sleep(3);
		
		actions.click(profile_ordersobject.returned_field);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actions.click(profile_ordersobject.all_filed);
		actions.sleep(3);
		
		//actions.scrollbyElement(profile_ordersobject.order_id_field);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actions.click(profile_ordersobject.order_id_field);
		actions.sleep(2);

		actions.click(profile_ordersobject.help_button);
		//driver.navigate().back();  
		actions.click(profile_ordersobject.askemequesetions);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actions.sendkeys(profile_ordersobject.askemequesetions,"delivery");
		actions.sleep(2);
		actions.click(profile_ordersobject.askemesearch_button);
		actions.sleep(2);
		actions.scrollbyElement(profile_ordersobject.paymentshelp_button);
		actions.sleep(2);
		actions.click(profile_ordersobject.paymentshelp_button);
		driver.navigate().back();  
		actions.click(profile_ordersobject.cancelorder_button);
		
		actions.click(profile_ordersobject.cancel_button);
		
		
		
		
	}
	
	
}

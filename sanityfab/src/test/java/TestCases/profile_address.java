package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.profile_addressObjects;

public class profile_address extends Driverlaunch1{
	
	@Test
	public static void address() throws Exception {
	
		loginpage demo = new loginpage();
		demo.loginpage1();
		actions.sleep(3);
		actions.click(profile_addressObjects.button_profile);	
		actions.sleep(3);
	    actions.click(profile_addressObjects.address_button);
	    actions.sleep(3);
	   	actions.click(profile_addressObjects.add_address_button);
	   	actions.sleep(3);
		actions.sendkeys(profile_addressObjects.address_namefield,"udayvr");
		actions.sleep(3);
		actions.sendkeys(profile_addressObjects.address_mobilenum_field,"9951949669" );
		actions.sleep(3);
		actions.sendkeys(profile_addressObjects.address_pincode_field,"508207");
		actions.sleep(3);
		actions.scrollbyElement(profile_addressObjects.address_address_field);
		actions.sleep(3);
		actions.sendkeys(profile_addressObjects.address_address_field,"kodada");
		actions.sleep(3);
		actions.sendkeys(profile_addressObjects.citydistric_field,"kodad");
		actions.sleep(3);
		actions.click(profile_addressObjects.state_field);
		actions.sleep(3);
		actions.click(profile_addressObjects.bihar_field);
		actions.sleep(3);
		actions.click(profile_addressObjects.home_radiobutton);
		actions.sleep(3);
		actions.click(profile_addressObjects.defaultaddress_field);
		actions.sleep(3);
		actions.click(profile_addressObjects.address_save_button);
		
		
		
	}
	
	

	

}

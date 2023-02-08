package TestCases;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.profile_editprofileObject;

public class edit_profile extends Driverlaunch1{
	
	@Test
	public static void editpf() throws Exception {
		loginpage demo = new loginpage();
		demo.loginpage1();
		actions.sleep(3);
		actions.click(profile_editprofileObject.profile_button);
		actions.click(profile_editprofileObject.edit_profile_button);
		actions.clear(profile_editprofileObject.name_field);
		actions.sendkeys(profile_editprofileObject.name_field,"konakanchi");
		actions.sleep(3);
		actions.clear(profile_editprofileObject.emailaddress_field);
		actions.sendkeys(profile_editprofileObject.emailaddress_field, "uday212@yopmail.commm");
		actions.sleep(3);
		actions.click(profile_editprofileObject.gender_radiobuttom);
		actions.sleep(3);
		actions.click(profile_editprofileObject.noGST_radiobutton);
		actions.sleep(3);
		actions.clear(profile_editprofileObject.atlernate_mobilenumber);
		actions.sleep(3);
		actions.click(profile_editprofileObject.atlernate_mobilenumber);
		actions.sleep(3);
		actions.click(profile_editprofileObject.UPI_ID);
		actions.clear(profile_editprofileObject.UPI_ID);
		actions.sendkeys(profile_editprofileObject.UPI_ID, "uday111@gmail.com");
		actions.click(profile_editprofileObject.save_details);
		
		
	}

}

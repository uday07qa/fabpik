package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.profile_wishlist_object;

public class profile_wishlist extends Driverlaunch1{
	
	@Test
	public static void profilwishlist() throws Exception {
		actions.click(profile_wishlist_object.profile_button);
		actions.sleep(3);
		actions.click(profile_wishlist_object.wishlist_button);
		actions.sleep(3);
		actions.scrollbyElement(profile_wishlist_object.moveto_cart);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actions.scrollbyElement(profile_wishlist_object.deletebutton_forproduct);
		
		
		
		
	}

}

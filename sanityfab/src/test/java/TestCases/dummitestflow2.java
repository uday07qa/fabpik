package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.addtocart_object;
import pageObjects.profile_editprofileObject;





public class dummitestflow2  extends  dummibaseclas{

	
	
	@Test
	public static void addtocart() throws Exception {

	loginpage demo = new loginpage();
	demo.loginpage1();
	actions.sendkeys(addtocart_object.serachbar1,"freehugs");
   actions.click(addtocart_object.freehugs);
   actions.scrollbyElement(addtocart_object.plumfork_1238);
   actions.click(addtocart_object.plumfork_1238);
	actions.click(addtocart_object.years_3);
	actions.click(addtocart_object.price_guranty);
	actions.sleep(3);
	actions.click(addtocart_object.price_guranty);
	actions.sleep(3);
	actions.click(addtocart_object.quantity_increase);
	actions.sleep(3);
	actions.click(addtocart_object.add_to_cart);
	actions.sleep(3);
	actions.click(addtocart_object.go_to_cart);
	actions.sleep(3);
	actions.click(addtocart_object.gift_code);
	actions.sleep(3);
	actions.click(addtocart_object.apply_codebutton);
	actions.sleep(3);
	actions.sendkeys(addtocart_object.coupon_code,"12345");
	actions.sleep(3);
	actions.click(addtocart_object.couponapplu_button);
	actions.sleep(3);
	actions.click(addtocart_object.applycoupon_button);
	actions.sleep(2);
	actions.screenshot(null);
	//actions.click(addtocart_object.placeorder);
	
	}
	@Test
	
	public void screenshot2() {
		
	
	
	
}
}
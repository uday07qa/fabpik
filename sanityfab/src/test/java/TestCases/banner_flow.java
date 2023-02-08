package TestCases;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.bammer_flow_object;

public class banner_flow extends Driverlaunch1 {
	
	
	@Test
	public static void banner_flow() throws Exception{
	
		//actions.doubleclick(bammer_flow_object.banner_right_arrow);
		actions.click(bammer_flow_object.banner_right_arrow);
		
		actions.click(bammer_flow_object.for_smmoth);
		actions.sleep(1);
		actions.click(bammer_flow_object.spiderman);
		actions.double_click_plus(bammer_flow_object.quantity_plus);
		actions.click(bammer_flow_object.age);
		actions.sleep(2);
	    actions.double_click_minus(bammer_flow_object.addtocart);
		
		
		
		
	}


}

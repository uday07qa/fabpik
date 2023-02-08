package testCases;

import org.testng.annotations.Test;

import pageObjects.addtocartflowObjects;
import setup.Driverlaunch;
import utilities.actions;

public class menuclothing extends Driverlaunch{
         
	@Test

	public static void mainmenu() throws Exception {
		
		System.out.println(actions.gettext(addtocartflowObjects.clothingmenu_button));
		actions.mouseover(addtocartflowObjects.clothingmenu_button, addtocartflowObjects.T_shirts_field);
		System.out.println(actions.getCurrentTimeStamp());
		actions.sleep(10);
		System.out.println(actions.getCurrentTimeStamp());
		actions.scrollbyElement(addtocartflowObjects.top);
		
		
	}
}

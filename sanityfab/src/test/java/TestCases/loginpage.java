package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.loginpageObject;


public class loginpage extends Driverlaunch1 {

	
	@Test
	public static void  loginpage1() throws Exception {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		actions.click(loginpageObject.askemelater);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        actions .click(loginpageObject.loginbuttom_account);
     
          actions .sendkeys(loginpageObject.emailormobileenter_field,"9951949669");
          actions.sleep(3);
       actions .click(loginpageObject.loginbutton_field);
        actions.click(loginpageObject.loginwithpassword_button);
     
        actions.click(loginpageObject.enterthepassword_field);
        Thread.sleep(2000);
        actions.sendkeys(loginpageObject.enterthepassword_field, "9951949669");//jcikcjjg
       actions.click(loginpageObject.passeye_icon);
  
     
      actions.click(loginpageObject.loginbuttom_fieldpass);
   
	}
	
	
}

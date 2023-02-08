package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.createaccount_objects;

public class dummibaseclas  {

    @Test
    public static void gg() throws Exception {

		actions.sleep(3);
		actions.click(createaccount_objects.askemelater1);
		actions.sleep(3);
		actions.click(createaccount_objects.login_bgutton1);
    	actions.scrollbyElement(createaccount_objects.contuctus);
    	actions.click(createaccount_objects.contuctus);
    
    }
	
}


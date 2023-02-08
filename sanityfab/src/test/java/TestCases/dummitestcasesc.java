package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;
import pageObjects.dummy_objects;

public class dummitestcasesc extends Driverlaunch1 {
	
	@Test
	
public void onTestFailure() throws Exception 
{
		actions.sleep(3);
        actions.click(dummy_objects.notifyme);
         actions.sleep(3);
         actions.scrollbyElement(dummy_objects.contunt);
         actions.sleep(1);
        actions.click(dummy_objects.ear);
         
}}
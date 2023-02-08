package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.healthandsafetyObjects;
import pageObjects.homepage;
import setup.Driverlaunch;
import utilities.actions;

public class helthandsafety  extends Driverlaunch{
	@Test
	public static void pp1() throws Exception {
		firstclass demo = new firstclass();
		demo.loginTest();
		actions.sleep(3);
		actions.click(healthandsafetyObjects.healthsafe);
	   actions.click(healthandsafetyObjects.runz);
		
		
		
		
		
}}

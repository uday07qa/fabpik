package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.addtocartflowObjects;
import pageObjects.homepage;
import setup.Driverlaunch;
import utilities.actions;

public class homepage1 extends Driverlaunch{

	@Test
	public static void homepages() throws Exception {
		firstclass demo = new firstclass();
		demo.loginTest();
		actions.sleep(5);
		actions.mouseover(homepage.footwearmenu, homepage.footwearcombomenu);
		actions.sleep(5);
	actions.click(homepage.flipflpsmenscheckbox);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//	actions.scrollbyElement(homepage.tipy);
		actions.scrollbyElement(homepage.colorgray);
		Thread.sleep(2000);
		actions.scrollbyElement(homepage.toothless475);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		actions.click(homepage.toothless475);
		actions.click(homepage.size4to5);
		actions.click(homepage.sizechart);
		actions.click(homepage.sizechartclose);
		actions.click(homepage.pricegaranty);
		Thread.sleep(2000);
		actions.click(homepage.pricegaranty);
		actions.multipleclickincrease(homepage.qualityincrease);
		actions.multipleclickdecrease(homepage.qualitydecrease);
	    actions.click(homepage.viewmoreoffers);

	}
}
	

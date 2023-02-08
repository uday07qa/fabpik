package TestCases;





import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import SetUp.Driverlaunch1;
import Utilities.actions;

import pageObjects.keepintouchfb_twit_objects;

public class keepintouchfb_twit  extends Driverlaunch1{

	@Test
	public void fblinks() throws Exception {
		
		actions.scrollbyElement(keepintouchfb_twit_objects.instagram_link_field);
		actions.click(keepintouchfb_twit_objects.contatus);
		actions.windlowhandler_for_parentidto_chidlid(null);
		actions.scrollbyElement(keepintouchfb_twit_objects.contatus1);
		actions.click(keepintouchfb_twit_objects.contatus1);
		Thread.sleep(3000);
		actions.windowhandler_for_childid_backto_parentid(null);
	/*	String parentHandle = driver.getWindowHandle();
		System.out.println("parent window instagram"+parentHandle);
		actions.click(keepintouchfb_twit_objects.contatus);
	
		Set<String> ids = driver.getWindowHandles();
        Iterator <String>itr=ids.iterator();
        String parentId= itr.next();
        String childId = itr.next();
        Thread.sleep(3000);
        driver.switchTo().window(childId);
        System.out.println("title name print avtundhi"+driver.getTitle());
   
	actions.click(keepintouchfb_twit_objects.contatus1);
	   Thread.sleep(3000);*/
	  
	//	driver.switchTo().window(parentId);
	//	actions.scrollbyElement(keepintouchfb_twit_objects.contatus);
}}

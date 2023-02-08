package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

import SetUp.Driverlaunch1;

public class actions extends Driverlaunch1 {
	public static void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public static void sendkeys(String locator, String value) {
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}

	public static void mouseover(String parentlocator, String childlocator) {
		WebElement ele = driver.findElement(By.xpath(parentlocator));
		WebElement ele2 = driver.findElement(By.xpath(childlocator));
		Actions action = new Actions(driver);
		action.moveToElement(ele).moveToElement(ele2).click().perform();
	}

	public static void sleep(int seconds) throws Exception {
		int milliseconds = seconds * 1000;
		Thread.sleep(milliseconds);
	}

	public static String getCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

	public static void scrollbyElement(String locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement webElement = driver.findElement(By.xpath(locator));
		js.executeScript("arguments[0].scrollIntoView();", webElement);

	}

	public static String gettext(String locator) {
		WebElement ele = driver.findElement(By.xpath(locator));
		String textvalue = ele.getText();
		return textvalue;
	}

	public static String multipleclickincrease(String locator) {
		WebElement buttonElement = driver.findElement(By.xpath(locator));
		int i;
		for (i = 0; i <= 4; i++) {
			buttonElement.click();
		}
		return locator;
	}

	public static String multipleclickdecrease(String locator) {
		WebElement buttonElement = driver.findElement(By.xpath(locator));
		int i;
		for (i = 0; i <= 2; i--) {
			buttonElement.click();
		}
		return locator;
	}

	public static void clear(String locator) {
		driver.findElement(By.xpath(locator)).clear();
	}

	public static void windowback(String locator) {
		driver.navigate().back();

	}

	public static void  windlowhandler_for_parentidto_chidlid (String locator) throws InterruptedException {
		String parentHandle = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		Iterator <String>itr=ids.iterator();
		 // String parentId= itr.next();
	        String childId = itr.next();
	        Thread.sleep(3000);
	        driver.switchTo().window(childId);
		
	}

	public static void windowhandler_for_childid_backto_parentid(String locator) throws InterruptedException {
		String parentHandle = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		Iterator <String>itr=ids.iterator();
		  String parentId= itr.next();
	        String childId = itr.next();
	        Thread.sleep(3000);
	    		driver.switchTo().window(parentId);
		
	}
      public static void screenshot(String locator) {
    	 
    			
    			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    			Date d = new Date();
    			String TimeStamp = d.toString().replace(":","_").replace(" ","_");
    		try {
    			FileUtils.copyFile(srcFile,new File("./screenshot"+locator+"_"+TimeStamp+".png"));
    			
    		}
    		catch(IOException e) {
    			e.printStackTrace();
    		}
    		}
	
}




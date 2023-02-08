package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import setup.Driverlaunch;

public class actions extends Driverlaunch {
	public static void click(String locator){
		driver.findElement(By.xpath(locator)).click();
	}
	public static void sendkeys(String locator,String value){
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	public static void mouseover(String parentlocator,String childlocator) {
		WebElement ele = driver.findElement(By.xpath(parentlocator));
		WebElement ele2 = driver.findElement(By.xpath(childlocator));
		Actions action = new Actions(driver);
		action.moveToElement(ele).moveToElement(ele2).click().perform();
	}
	public static void sleep(int seconds) throws Exception {
		int milliseconds= seconds*1000;
		Thread.sleep(milliseconds);
	}
	public static String getCurrentTimeStamp() {
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
	}
	public static void  scrollbyElement(String locator) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement webElement = driver.findElement(By.xpath(locator));
		js.executeScript("arguments[0].scrollIntoView();", webElement);
		
		
	}
	public static String  gettext(String locator) {
		WebElement ele=driver.findElement(By.xpath(locator));
		String textvalue=ele.getText();
		return textvalue;
	}
	public static String multipleclickincrease(String locator) {
		WebElement buttonElement = driver.findElement(By.xpath(locator));
		int i;
		for(i=0;i<=4;i++) {
		buttonElement.click();
		}
		return locator;
	}
	public static String multipleclickdecrease(String locator) {
		WebElement buttonElement = driver.findElement(By.xpath(locator));
		int i;
		for(i=0;i<=2;i--) {
		buttonElement.click();
		}
		return locator;
	}
public static void clear(String locator) {
	driver.findElement(By.xpath(locator)).clear();
}
}

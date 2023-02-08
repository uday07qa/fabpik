  package SetUp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.actions;



public class Driverlaunch1 {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	public static FileReader fr;
	//public static FileReader fr1;
	
	
	
	
	
	
	@BeforeTest
	public void setup() throws Exception {

		if (driver == null) {
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.peoperties");
		//FileReader 	 fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			prop.load(fr);
		
		}
		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get(prop.getProperty("mivete"));
			actions.sleep(4);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			actions.sleep(4);
		} 
		
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("fabpikurl"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 driver.manage().window().maximize();
				actions.sleep(4);
		}}

		
	
@AfterTest
	public void tearDown() {
//driver.close();
//System.out.println("teardown closing site");
	}}


  package setup;
  import java.io.FileNotFoundException;
  import java.io.FileReader;
  import java.io.IOException;
  import java.util.Properties;

  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.firefox.FirefoxDriver;
  import org.testng.annotations.AfterTest;
  import org.testng.annotations.BeforeTest;
  import org.testng.annotations.Test;


import utilities.actions;

public class Driverlaunch {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
@BeforeTest
	public void setup() throws IOException {

		if (driver == null) {
		FileReader   fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.propertires");
		FileReader 	 fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			prop.load(fr);
			loc.load(fr);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize();
		} 
		
	else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
			 driver.manage().window().maximize();
		}
		
		
	}
@AfterTest
	public void tearDown() {
//driver.close();
//System.out.println("teardown closing site");
	}
}

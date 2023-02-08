package appiumday;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobilePlatform;

public class NewTest {
	// WebDriver driver;

	/*
	 * public void f() throws MalformedURLException {
	 * 
	 * // UiAutomator2Options options = new UiAutomator2Options(); //
	 * options.setPlatformName("Andriod"); // options.setDeviceName("pixel4"); //
	 * options.setApp(
	 * "//U://eclipse//Appium_demo1//src//main//java//resources//ApiDemos-debug.apk"
	 * ); // driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),
	 * options);
	 */

	String appiumurl = "http://127.0.0.1:4723/wd/hub";
	AndroidDriver driver;
	WebDriverWait wait;
	String settingsAppPackageName = "com.android.settings";
	String settingsAppActivityName = "com.android.settings.Settings";

	@Test
	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("appium:platformName", MobilePlatform.ANDROID);
		capabilities.setCapability("deviceName", "pixel4");
		capabilities.setCapability("app", "C:\\Users\\gg\\ApiDemos-debug.apk");
		capabilities.setCapability("noReset", true);
		URL url = new URL(appiumurl);
		driver = new AndroidDriver(url, capabilities);
	//	wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}
}

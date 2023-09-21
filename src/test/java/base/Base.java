package base;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;

public class Base {
	
	@Test
	public <UIAutomator2Options> void appiumTest() throws MalformedURLException {
		
//		UIAutomator2Options options = new UIAutomator2Options();
//     	options.setDeviceName("Pixel 7");
//     	options.setApp("C:\\Users\\prova\\eclipse-workspace\\AppiumDemo\\src\\test\\java\\resources\\ApiDemos-debug.apk");
//     	 AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), options);
//   	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 //  capabilities.setCapability("browserName", "Android");
		   capabilities.setCapability("version", "13");
		   capabilities.setCapability("deviceName", "Pixel 7");
		   capabilities.setCapability("platformName", "Android");
		   capabilities.setCapability("app", "C:\\Users\\prova\\eclipse-workspace\\AppiumDemo\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		   AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
		 
		
	}
	

}

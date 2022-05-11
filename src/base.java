import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver;
		
		File appDir = new File("src");
		File app = new File(appDir,"General-Store.apk");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"3200bc6fbc1e96b1");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 40);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());	
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		 driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
	}

} 

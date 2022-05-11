import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomatorviewtest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

}}

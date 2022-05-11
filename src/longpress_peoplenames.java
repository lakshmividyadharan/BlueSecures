import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;

public class longpress_peoplenames extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub		
   AndroidDriver<AndroidElement> driver = capabilities();
   
   TouchAction t= new TouchAction(driver);
   
   driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
   WebElement el=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
   t.tap(tapOptions().withElement(element(el))).perform();
   
   driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
   WebElement lp =driver.findElementByAndroidUIAutomator("text(\"People Names\")");
   t.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(2))).release().perform();
   System.out.println(driver.findElementById("android:id/title").isDisplayed());
   	
   
   
	
	}

}

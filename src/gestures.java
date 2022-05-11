import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		 TouchAction t= new TouchAction(driver);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		WebElement expandableLists = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandableLists))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
//		 driver.findElementByXPath("//android.widget.TextView[@Text='People Names']").click();
	WebElement lp=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
			
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
	
		
	}
	
}

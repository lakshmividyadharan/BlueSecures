import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
public class swipe extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
			driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
			driver.findElementByXPath("//*[@content-desc='9']").click();
			WebElement first =driver.findElementByXPath("//*[@content-desc='15']");
			WebElement second =driver.findElementByXPath("//*[@content-desc='45']");
			TouchAction t= new TouchAction(driver);
			t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release();
			
			
			
	}

}

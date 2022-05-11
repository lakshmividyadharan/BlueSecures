import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class swipe2 extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
AndroidDriver<AndroidElement> driver = capabilities();

driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();

TouchAction t= new TouchAction(driver);

WebElement  inline=driver.findElementByAndroidUIAutomator("text(\"2. Inline\")");
t.tap(tapOptions().withElement(element(inline))).perform();

WebElement nine = driver.findElementByXPath("//*[@content-desc='9']");
t.tap(tapOptions().withElement(element(nine))).perform();

WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();

	}

}

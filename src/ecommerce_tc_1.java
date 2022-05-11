import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc_1 extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("TRY");
		
		//WebElement name= driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']");
	//name.sendKeys("HELLO");
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
			driver.findElementByXPath("//*[@text='Afghanistan']").click();
			
			
driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"));").click();
driver.findElementByAndroidUIAutomator("text(\"Let's  Shop\")").click();

String message = driver.findElementByXPath("//android.widget.Toast").getAttribute("name");
System.out.println(message);

Assert.assertEquals("Please enter your name", message);
	}

	
}

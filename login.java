package BlueSecures.FrameworkLogin;


import java.util.Map;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Base.basenew;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class login extends basenew
{
	public void check1
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}
}
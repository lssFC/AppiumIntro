package com.apptest;
import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DesiredCap {

	@Test
	public void test() throws MalformedURLException {
		//Keep Appto be tested  in src location
		File appDir = new File ("src");
		
		File app = new File (appDir, "BookMyShow.apk");
		// set desired capabilities  for Appium android 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator"); //Setup Emulator/Phone
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
 		 
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 
		 driver.findElementById("com.bt.bms:id/btnLogin").click();
	}

}

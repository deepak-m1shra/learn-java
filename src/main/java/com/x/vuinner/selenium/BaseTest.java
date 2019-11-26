package com.x.vuinner.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setUp(String browser) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", browser);

		try {
			driver.set(new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), caps));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public WebDriver getDriver() {
		return driver.get();
	}

	@AfterMethod
	public void cleanUp() {
		getDriver().quit();
	}

	@AfterClass
	void terminate() {
		driver.remove();
	}
}

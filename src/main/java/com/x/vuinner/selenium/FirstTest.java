package com.x.vuinner.selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

	@Test
	public void googleTest() {
		Reporter.log("Google test started " + Thread.currentThread().getId(), true);
		getDriver().navigate().to("https://www.google.com");
		Reporter.log("Google test finished " + Thread.currentThread().getId(), true);
	}

	@Test
	public void yahooTest() {
		Reporter.log("Yahoo test started " + Thread.currentThread().getId(), true);
		getDriver().navigate().to("https://www.yahoo.com");
		Reporter.log("Yahoo test finished " + Thread.currentThread().getId(), true);
	}

	@Test
	public void githubTest() {
		Reporter.log("Github test started " + Thread.currentThread().getId(), true);
		getDriver().navigate().to("https://www.github.com");
		Reporter.log("Github test finished " + Thread.currentThread().getId(), true);
	}

}

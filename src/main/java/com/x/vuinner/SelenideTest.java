package com.x.vuinner;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {
	
	@Test
	public void simple_get_test() {
		System.setProperty("", "");
		System.setProperty("selenide.browser", "firefox");
		open("https://google.com");
		
	}

}

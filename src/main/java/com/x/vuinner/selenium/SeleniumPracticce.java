package com.x.vuinner.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPracticce {

	static int count = 0;

	WebDriver driver;

//	@BeforeClass
	public void setup() {
//		WebDriverManager.chromedriver().version("76").setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(options);
	}

//	@Test
	public void basic_get() {
		driver.get("https://www.google.com");

		String documentTitle;

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		documentTitle = (String) jse.executeScript("return document.title;");
		System.out.println("Document title is: " + documentTitle);

		WebElement search = driver.findElement(By.name("q"));

		jse.executeScript("arguments[0].value='asdf'", search);

	}

	@Test
	public void var_agrs_demo() {
		display("hello");
		display("hello", "_2_params");
		display("hello", "3", "params");
		display("hello", "4", "params", "list");
		display("hello");
		display("hello");
	}

	private static void display(String... args) {

		for (String str : args) {
//			int count=0;
			System.out.println("These are the parameters: " + str + " count = " + ++count);
		}

	}
	
	public static void main(String... args) {
		System.out.println("calling main, number of parameters = " + args.length);
	}
}

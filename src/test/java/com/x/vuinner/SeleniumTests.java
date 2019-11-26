/*package com.x.vuinner;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTests {

	WebDriver driver;
	String url = "http://cookbook.seleniumacademy.com/AjaxDemo.html";
	String alertUrl = "http://cookbook.seleniumacademy.com/Alerts.html";

	@BeforeClass
	public void setup() {
//		WebDriverManager.chromedriver().version("76").setup();
		driver = new ChromeDriver();
	}

//	@Test(priority = 1)
	public void implicit_wait() {
		String url = "http://cookbook.seleniumacademy.com/AjaxDemo.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Page 4")).click();

		Assert.assertTrue(driver.findElement(By.id("page4")).getText().contains("Nunc nibh"));

	}

//	@Test(priority = 2)
	public void explicit_wait() {
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.linkText("Page 4")).click();
		wait.until(ExpectedConditions.titleIs("page4"));
	}

//	@Test(priority = 2)
	public void explicit_wait_custom_condition() {
		driver.get(url);
		driver.findElement(By.linkText("Page 4")).click();
		
		 * WebElement page4Element = new WebDriverWait(driver, Duration.ofSeconds(5))
		 * .until(new ExpectedCondition<WebElement>() { public WebElement
		 * apply(WebDriver input) { return input.findElement(By.id("page4")); } });
		 
		WebElement page4Element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(new ExpectedCondition<WebElement>() {
					public WebElement apply(WebDriver driver) {
						return driver.findElement(By.id("page4"));
					}
				});
		assertTrue(page4Element.getText().contains("Nunc"));
	}

//	@Test
	public void fluent_wait_with_wait() {
		driver.get(url);
		driver.findElement(By.linkText("Page 4")).click();
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement page4Element = fluentWait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver d) {
				return d.findElement(By.id("page4"));
			}
		});

		Assert.assertTrue(page4Element.getText().contains("Nunc nibh"));

	}

//	@Test
	public void work_with_alert() {
		driver.get(alertUrl);
		driver.findElement(By.id("simple")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert content: " + alert.getText());
		alert.accept();

	}
	
	@Test
	public void iframes_example() {
		driver.get("http://cookbook.seleniumacademy.com/Frames.html");
		driver.switchTo().frame("left");
		String frameContent = driver.findElement(By.tagName("p")).getText();
		System.out.println("Left frame content is --> " + frameContent);
		
		// Switch back to default content
		driver.switchTo().defaultContent();
		driver.switchTo().frame("right");
		
		frameContent = driver.findElement(By.tagName("p")).getText();
		System.out.println("Right frame content is --> " + frameContent);
		
		// Switch to default content
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		frameContent = driver.findElement(By.tagName("p")).getText();
		System.out.println("Right frame content is --> " + frameContent);
		
		
	}

	@AfterClass
	public void cleanup() {
		if (driver != null) {
			driver.close();
		}
	}

}*/
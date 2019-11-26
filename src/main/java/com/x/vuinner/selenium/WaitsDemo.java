package com.x.vuinner.selenium;

import static org.testng.Assert.assertTrue;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codeborne.selenide.ex.ElementIsNotClickableException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo extends LoadableComponent<WaitsDemo> {

	WebDriver driver;

	@FindBy(xpath = "//html/node")
	@CacheLookup
	WebElement name;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().version("76").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void explicit_wait() throws InterruptedException {
		driver.get("http://cookbook.seleniumacademy.com/AjaxDemo.html");
		WebElement buton4 = driver.findElement(By.linkText("Page 4"));
		buton4.click();

		/*
		 * new WebDriverWait(driver, Duration.ofSeconds(10)).until(new
		 * ExpectedCondition<Boolean>() {
		 * 
		 * public Boolean apply(WebDriver input) { // TODO return
		 * driver.findElement(By.id("page4")).isDisplayed(); } });
		 */

		WebDriverWait wait = new WebDriverWait(driver, 20);

//		Method:1
		wait.until(ExpectedConditions.attributeContains(By.id("page4"), "innerText", "Nunc nibh"));

//		Method: 2
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page4")));
		Pattern pattern = Pattern.compile("a-zA-z0-9");

//		wait.until(ExpectedConditions.textMatches(By.id("page4"), pattern));

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.ignoring(ElementIsNotClickableException.class);

		WebElement element = fluentWait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				return driver.findElement(By.id("someid"));
			}

		});

//		fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.id("page4");
//		fluentWait.wait(10).;
//		fluentWait.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class)
//				.pollingEvery(Duration.ofSeconds(2)).withTimeout(Duration.ofNanos(10)).withMessage("Time expired")
//				.until(ExpectedConditions.presenceOfElementLocated(By.id("page4")));

		driver.close();

//		Wait fwait = new FluentWait(driver);
//		fwait.

	}

	@Test
	public void test() {
		// another way of usig fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).ignoring(Exception.class)
				.pollingEvery(Duration.ofSeconds(100));

		WebElement page4Element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return t.findElement(By.id("page4"));
			}

		});

		assertTrue(page4Element.getText().contains("uic"));
	}

	public void initStuff() {
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}

	@Test
	public void exp_conditions() {

		WebElement located = driver.findElement(By.id("login"));
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
//		waitLocal.until(ExpectedConditions.visibilityOf(located));
		explicitWait.until(ExpectedConditions.titleContains("something"));
		explicitWait.until(ExpectedConditions.visibilityOf(located));

	}

	public void jswrapper(WebElement element, String attribute, String value) {
		WrapsDriver wrappedElement = (WrapsDriver) element;
		JavascriptExecutor jsExecutor = (JavascriptExecutor) wrappedElement.getWrappedDriver();
		jsExecutor.executeAsyncScript("arguments[0].setAttribute(arguments[1], arguments[2]", element, attribute,
				value);
	}

	public void getElementScreenshot(WebElement element) throws IOException {
		WrapsElement elementWrapper = (WrapsElement) element;
		File screenShot = ((TakesScreenshot) elementWrapper.getWrappedElement()).getScreenshotAs(OutputType.FILE);
		BufferedImage img = ImageIO.read(screenShot);
		int width = element.getSize().width;
		int height = element.getSize().height;

		Rectangle rect = new Rectangle(width, height);

		Point p = element.getLocation();

		BufferedImage buffImg = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);

	}
}

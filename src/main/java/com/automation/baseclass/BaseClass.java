package com.automation.baseclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else {
				System.out.println("Invalid BrowserName");
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void waitForElementVisibilty(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fluetnWait() {
		Wait wait = new FluentWait(driver).withTimeout(6, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(Exception.class);
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValuestoElement(WebElement element, String value) {
		waitForElementVisibilty(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickonElement(WebElement element) {
		waitForElementVisibilty(element);
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectDropDown(WebElement element, String value, String option) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}

	}

	public static void moveToElement(WebElement element) {
		waitForElementVisibilty(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void switchToFrameUsingId(String option, int index) {
		try {
			if (option.equalsIgnoreCase("id")) {
				driver.switchTo().frame(index);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrameUsingName(String option, String name) {
		try {
			if (option.equalsIgnoreCase("Framename")) {
				driver.switchTo().frame(name);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

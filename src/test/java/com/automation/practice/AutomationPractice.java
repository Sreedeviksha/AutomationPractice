package com.automation.practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.automation.baseclass.BaseClass;
import com.automation.pom.AddToCart;
import com.automation.pom.HomePage;
import com.automation.pom.SignInPage;

public class AutomationPractice extends BaseClass {

	public static WebDriver driver;
	
	@Test
	public void test() {

	//public static void main(String[] args) throws InterruptedException {

		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");

		HomePage hp = new HomePage(driver);
		clickonElement(hp.getSignIn());

		SignInPage sp = new SignInPage(driver);
		inputValuestoElement(sp.getEmail(), "viky@gmail.com");
		inputValuestoElement(sp.getPasswd(), "14789");
		clickonElement(sp.getSubmit());

		AddToCart ac = new AddToCart(driver);
		moveToElement(ac.getWomen());
		moveToElement(ac.getTshirts());
		clickonElement(ac.getTshirts());
		moveToElement(ac.getQview1());
		moveToElement(ac.getQview());
		clickonElement(ac.getQview());
		switchToFrameUsingId("id", 0);
		clickonElement(ac.getQuantity());
		clickonElement(ac.getAddtocart());
		clickonElement(ac.getChkout());
		clickonElement(ac.getChkout2());
		clickonElement(ac.getChkout3());
		clickonElement(ac.getAgreebtn());
		clickonElement(ac.getChkout4());
		clickonElement(ac.getBankwire());
		clickonElement(ac.getConfirm());

	}

}

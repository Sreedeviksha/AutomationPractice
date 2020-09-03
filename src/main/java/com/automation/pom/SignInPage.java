package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public static WebDriver driver;
	
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement passwd;
	
	@FindBy(id="SubmitLogin")
	private WebElement submit;

	public SignInPage(WebDriver ldriver) {
		this.driver=ldriver;
	PageFactory.initElements(driver, this);	
	
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}

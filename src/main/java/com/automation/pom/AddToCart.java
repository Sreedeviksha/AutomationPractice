package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	public static WebDriver driver; 
	
	@FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
	private WebElement women;
	
	@FindBy(xpath="//a[@title='T-shirts']")
	private WebElement tshirts;
	
	@FindBy(xpath="//li[contains(@class,'ajax_block_product ')]")
	private WebElement qview1;
	
	@FindBy(xpath="//a[@class='quick-view']")
	private WebElement qview;
	
	@FindBy(xpath="(//a[@data-field-qty='qty'])[2]")
	private WebElement quantity;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement chkout;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement chkout2;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement chkout3;
	
	@FindBy(id="uniform-cgv")
	private WebElement agreebtn;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement chkout4;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankwire;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;

	public AddToCart(WebDriver ldriver) {
		this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getQview1() {
		return qview1;
	}

	public WebElement getQview() {
		return qview;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getChkout() {
		return chkout;
	}

	public WebElement getChkout2() {
		return chkout2;
	}

	public WebElement getChkout3() {
		return chkout3;
	}

	public WebElement getAgreebtn() {
		return agreebtn;
	}

	public WebElement getChkout4() {
		return chkout4;
	}

	public WebElement getBankwire() {
		return bankwire;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
}

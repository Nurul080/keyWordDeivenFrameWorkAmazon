package com.amazon.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "nav-link-accountList-nav-line-1")
	public WebElement singinLocator;

	public void singinButtonOneMethod() {
		singinLocator.click();
	}
	@FindBy(how = How.ID, using = "ap_email")
	public WebElement emailorphoneNumberLocator;
	
	public WebElement emailMethod(String enteremail) {
		emailorphoneNumberLocator.sendKeys(enteremail);
		return emailorphoneNumberLocator;
	}
	@FindBy(how = How.ID, using = "continue")
	public WebElement continuebuttoLocator;
	
	public void continueButtonMethod() {
		continuebuttoLocator.click();
	}
	@FindBy(how = How.ID, using = "ap_password")
	public WebElement passwordLocator;
	
	public WebElement passwordMethpd(String enterpassword) {
		passwordLocator.sendKeys(enterpassword);
		return passwordLocator;
	}
	@FindBy(how = How.ID, using = "signInSubmit")
	public WebElement signInSubmitLocator;
	
	public void signInSubmitMethod() {
		signInSubmitLocator.click();
	}

}

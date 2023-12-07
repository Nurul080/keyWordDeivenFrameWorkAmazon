package com.amazon.loginTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseTest;
import com.amazon.loginPage.LoginPage;
import com.amazon.utilities.PropertiesReader;

public class LoginTest extends BaseTest {
	LoginPage LP;
	PropertiesReader Reader;
	
	
	@BeforeMethod
	public void oprnApplication() {
		openAmazon();
		
	}
	
	@Test
	public void loginTest() {
		Reader  = new PropertiesReader();
		LP = new LoginPage(driver);
		LP.singinButtonOneMethod();
		LP.emailMethod(Reader.getEmail());
		LP.continueButtonMethod();
		//LP.passwordMethpd(Reader.getPssword());
		LP.signInSubmitMethod();
	}
	
	@AfterMethod
	public void closeApplication() {
		closeAmazon();
	}

}

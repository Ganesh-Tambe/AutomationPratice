package com.PageAction;

import org.openqa.selenium.support.PageFactory;

import com.PageLocators.LoginPageLocators;
import com.utilities.HelperClass;

public class LoginPageAction {
	LoginPageLocators objLogin;
	
	public LoginPageAction() {
		this.objLogin=new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objLogin);
	}
	
	public void setUsername(String username) {
		objLogin.username.sendKeys(username);
	}
	
	public void setPassword(String password) {
		objLogin.Lpassword.sendKeys(password);
	}
	
	public void clickLogin() {
		objLogin.login.click();
	}

}

package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement Lpassword;
	
	@FindBy(name="login")
	public WebElement login;

}

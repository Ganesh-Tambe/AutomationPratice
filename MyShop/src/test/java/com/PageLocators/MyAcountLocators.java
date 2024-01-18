package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAcountLocators {
	@FindBy(name="email")
	public WebElement regiEmail;
	
	@FindBy(id="reg_password")
	public WebElement regPassword;
	
	@FindBy(name="register")
	public WebElement Register;

}

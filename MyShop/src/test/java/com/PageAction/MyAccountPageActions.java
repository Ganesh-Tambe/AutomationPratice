package com.PageAction;

import org.openqa.selenium.support.PageFactory;

import com.PageLocators.MyAcountLocators;
import com.utilities.HelperClass;

public class MyAccountPageActions {
	MyAcountLocators objMyAccount;
	
	public MyAccountPageActions()
	{
		this.objMyAccount = new MyAcountLocators();
		PageFactory.initElements(HelperClass.getDriver(), objMyAccount);
	}
	
	
	
	public void setEmail(String email)
	{
		objMyAccount.regiEmail.sendKeys(email);
		
	}
	public void setPassword(String password)
	{
		objMyAccount.regPassword.sendKeys(password);
	}
	
	public void clickRegister()
	{
		objMyAccount.Register.click();
	}

}

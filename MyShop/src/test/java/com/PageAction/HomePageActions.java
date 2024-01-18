package com.PageAction;

import org.openqa.selenium.support.PageFactory;

import com.PageLocators.HomePageLocators;
import com.utilities.HelperClass;

public class HomePageActions {
	HomePageLocators objhomepage;
	
	public HomePageActions()
	{
		this.objhomepage = new HomePageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objhomepage);
	}
	
	public void clickMyAccountTab()
	{
		objhomepage.MyAccount.click();
	}

}

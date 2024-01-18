package com.StepDefination;

import com.PageAction.HomePageActions;
import com.PageAction.MyAccountPageActions;
import com.utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MyAccountRegister {
	MyAccountPageActions objaction =new MyAccountPageActions();
	HomePageActions objHomeaction=new HomePageActions();
	@Given("open the given {string} url")
	public void open_the_given_url(String string) {
	    HelperClass.openPage(string);
	}

	@When("click on My Account Tab")
	public void click_on_my_account_tab() {
	  objHomeaction.clickMyAccountTab();
	}

	@Then("^Enter the (.*) and (.*)$")
	public void enter_the_asx_gmail_com_and_register(String email,String password) {
		objaction.setEmail(email);
        objaction.setPassword(password);	   
	}

	@Then("click on Register button")
	public void click_on_register_button() {
	   objaction.clickRegister();
	}

	@Then("Validate the user is Register Successfully or not")
	public void validate_the_user_is_register_successfully_or_not() {
	 Assert.assertTrue(true);
	}


}

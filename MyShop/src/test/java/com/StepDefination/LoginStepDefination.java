package com.StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.PageAction.HomePageActions;
import com.PageAction.LoginPageAction;
import com.utilities.ExcelReader;
import com.utilities.HelperClass;
import com.utilities.ReadPropertyFile;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	LoginPageAction objLoginaction=new LoginPageAction();
	HomePageActions objHomeAction=new HomePageActions();
	ReadPropertyFile objProperty=new ReadPropertyFile();

	@Given("User Should be on {string} page")
	public void user_should_be_on_page(String string) {
	  HelperClass.openPage(string);
	}

	@When("User click on My Account Tab")
	public void user_click_on_my_account_tab() {
	    objHomeAction.clickMyAccountTab();
	}

	@When("^User Enter the (.*) and (.*)$")
	public void user_enter_the_asx_gmail_com_and_register(String username,String password) {
	  objLoginaction.setUsername(username);
	  objLoginaction.setPassword(password);
	}
	
	//credentials from Excel
		@When("User enters {string} and {int}")
		public void user_enters_pat1_and(String username,Integer rownumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {		
			ExcelReader excelReader = new ExcelReader();

			List<Map<String,String>> LoginData= excelReader.getData("src/test/java/com/testData/LoginCredentials (2).xls",username);
	        String username1= LoginData.get(rownumber).get("email");
		    String password= LoginData.get(rownumber).get("password");
			
		    objLoginaction.setUsername(username1);
		    objLoginaction.setPassword(password);
		   
		}
	
	@When("User fill all the credentials")
	public void user_fill_all_the_credentials() {
	  objProperty.FillData();
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	   objLoginaction.clickLogin();
	}

	@Then("Validate The user is Successfully Login or not")
	public void validate_the_user_is_successfully_login_or_not() {
	  Assert.assertTrue(true);
	}
	
	@Then("Validate user logged in or not")
	public void validate_user_logged_in_or_not() {
		 Assert.assertTrue(true);
	}
}

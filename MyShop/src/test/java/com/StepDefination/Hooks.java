package com.StepDefination;

import com.utilities.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void before() {
	
		HelperClass.setDriver();;

	}


	@After()
	public void after() {
		HelperClass.tearDown();
	}

}


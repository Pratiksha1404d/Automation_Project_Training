package com.RegressionTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("TC03_Before Method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("TC03_After Method");
	}

	@Test 
	public void TC_03_SignUp(){
		System.out.println("Sign Up to facebook");
	}
	
	
	
	
}

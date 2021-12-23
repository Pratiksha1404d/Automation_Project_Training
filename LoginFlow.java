package com.flows;

import java.util.Hashtable;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.pageFactory.LoginPage;

public class LoginFlow {

	private BaseTest objBaseTest;
    private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
    private LoginPage objLoginPage;
    Hashtable<String, String> objHashtable = new Hashtable<String, String>();
    String testData="";
    
    public void validCredentials(){
    	objHashtable.put("Username", "pratiksha1404d@gmail.com");
    	objHashtable.put("Password", "abcd1234");
    }
    
	public LoginFlow(BaseTest basetest){
		this.objBaseTest=basetest;
		objLoginPage =new LoginPage(objBaseTest);
		this.validCredentials();
	}
	
	public void doLogin() {
		testData= objHashtable.get("Username");
		objLoginPage.setUserName(testData);
		
		testData= objHashtable.get("Password");
		objLoginPage.setPassword(testData);
		objLoginPage.clickOnSignInButton();
	}
	      
	
}

package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class LoginPage {

	private BaseTest objBaseTest;
    private SeleniumWrapperFunctions objSeleniumWrapperFunctions;

	public LoginPage(BaseTest basetest){
		this.objBaseTest=basetest;
	
	}		
		
	//Locators
	By loc_hdrLoginPage=By.xpath("//h3[text()='Already registered?']");	
	By loc_linkSignIn = By.xpath("//a[@class='login']");
	By loc_inpUserName = By.id("email");
	By loc_inpPassword = By.id("passwd");
	By loc_btnLogIn = By.xpath("//button[@name='SubmitLogin']");
	By loc_logoutLink =By.xpath("//a[@class='logout']");
	
	
	public void clickOnSignInLink(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkSignIn));
	}
		
	public void verifyLoginPageHeaderIsDisplayed(){
		
		Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isPresent(loc_hdrLoginPage),true);
	}
	public void setUserName(String strUserName){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpUserName,strUserName));
	}
	public void setPassword(String strPassword){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpPassword, strPassword));
	}
	public void clickOnSignInButton(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnLogIn));
	}
	
	
	
	
	
	
}


	

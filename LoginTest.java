package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.LoginFlow;
import com.generic.BaseTest;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;
import com.pageFactory.AddToCartPage;



public class LoginTest extends BaseTest {

	private LoginPage objLoginPage;
	private HomePage objHomePage;
	private LoginFlow objLoginLogoutFlow ;
	private AddToCartPage objMyAccountPage;
	public void initializeWebPage()
	{
		objLoginPage = new LoginPage(this);
		objHomePage =new HomePage(this);
		objLoginLogoutFlow = new LoginFlow(this);
		objMyAccountPage = new AddToCartPage(this);
	}
	
	@BeforeClass
	public void beforeMethod() 
	{
	 this.initializeWebEnvironment();
	 this.initializeWebPage();

	}
	
	@AfterClass
	public void afterMethod()
	{
		this.tearDown();
	}

	
    @Test
    public void TC01_VerfiyLoginFunctionality() throws InterruptedException
    {
    objHomePage.verifySignLinkIsdisplayed();
	objLoginPage.clickOnSignInLink();
	Thread.sleep(3000);
	objLoginPage.verifyLoginPageHeaderIsDisplayed();
	objLoginLogoutFlow.doLogin();
   }
	
    @Test
    public void TC03_VerfiyMyAccount() throws InterruptedException
    {
    	objMyAccountPage.validateMyAccountTitle();
    	
    }
   } 

	


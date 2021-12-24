package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.AddToCartFlow;
import com.flows.LoginFlow;
import com.generic.BaseTest;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;
import com.pageFactory.AddToCartPage;

public class AddToCartTest extends BaseTest{
	
	private LoginPage objLoginPage;
	private HomePage objHomePage;
	private LoginFlow objLoginLogoutFlow ;
	private AddToCartPage objMyAccountPage;
	private AddToCartFlow objAddToCartFlow;
	
	public void initializeWebPage()
	{
		objLoginPage = new LoginPage(this);
		objHomePage =new HomePage(this);
		objLoginLogoutFlow = new LoginFlow(this);
		objMyAccountPage = new AddToCartPage(this);
		objAddToCartFlow =new AddToCartFlow(this);
	}
	
	@BeforeClass
	public void initilizePreRequisiteEnv() 
	{
	 this.initializeWebEnvironment();
	 this.initializeWebPage();

	}
	
	@Test
	public void TC01_LoginToApplication() 
    {
    objHomePage.verifySignLinkIsdisplayed();
	objLoginPage.clickOnSignInLink();
	objLoginPage.verifyLoginPageHeaderIsDisplayed();
	objLoginLogoutFlow.doLogin();
	objMyAccountPage.validateMyAccountTitle();
	objLoginPage.getAllLinksOnLoginPage();
    }
	
	@Test
	 public void TC02_AddTshirtToCart()
	  {
		objAddToCartFlow.AddToCart();
	  }
	
	@AfterClass
	public void tearDownWebEnv()
	{
		this.tearDown();
	}

}

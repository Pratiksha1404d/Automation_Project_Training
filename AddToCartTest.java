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
	public void beforeMethod() 
	{
	 this.initializeWebEnvironment();
	 this.initializeWebPage();

	}
	
	@Test
	public void TC01_LoginToApplication() throws InterruptedException
    {
    objHomePage.verifySignLinkIsdisplayed();
	objLoginPage.clickOnSignInLink();
	Thread.sleep(3000);
	objLoginPage.verifyLoginPageHeaderIsDisplayed();
	objLoginLogoutFlow.doLogin();
	objMyAccountPage.validateMyAccountTitle();
    }
	
	@Test
	 public void TC02_AddTshirtToCart() throws InterruptedException
	  {
		objAddToCartFlow.AddToCart();
	  }
	
	@AfterClass
	public void afterMethod()
	{
		this.tearDown();
	}

}

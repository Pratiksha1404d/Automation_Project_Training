package com.pageFactory;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

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
		objBaseTest.getObjSeleniumWrapperFunctions().explicitWait(loc_hdrLoginPage);
		Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isPresent(loc_hdrLoginPage),true);
		Reporter.log("Verify Login Page Header Is Displayed", true);
	}
	public void setUserName(String strUserName){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpUserName,strUserName));
		Reporter.log("Set User Name", true);
	}
	public void setPassword(String strPassword){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpPassword, strPassword));
		Reporter.log("Set Password", true);
	}
	public void clickOnSignInButton(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnLogIn));
		Reporter.log("Click On Sign In Button", true);
	}
	
	public void getAllLinksOnLoginPage(){
		List<WebElement> allLinks = objBaseTest.getDriver().findElements(By.tagName("a"));
		System.out.println("Link List Size - "+allLinks.size());
	}
	
	
	
	
}


	

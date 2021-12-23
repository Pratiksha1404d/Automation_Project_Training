package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class HomePage {

		private BaseTest objBaseTest;
	    private SeleniumWrapperFunctions objSeleniumWrapperFunctions;


		public HomePage(BaseTest basetest){
			this.objBaseTest=basetest;
		}

//Locators
 By loc_btnSignIn = By.xpath("//a[@class='login']");
		

 public void verifySignLinkIsdisplayed()
 {
	 Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isPresent(loc_btnSignIn), true);
	 System.out.println("-----SignInLink is Present on Home Page--------");
 }
	
 
		
	}		

		
	

package com.flows;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.pageFactory.AddToCartPage;
import com.pageFactory.LoginPage;

public class AddToCartFlow {

	private BaseTest objBaseTest;
    private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
    private AddToCartPage objAddToCartPage;

    
    public AddToCartFlow(BaseTest basetest){
		this.objBaseTest=basetest;
		objAddToCartPage =new AddToCartPage(objBaseTest);
	}
    
    public void AddToCart() throws InterruptedException{
    	objAddToCartPage.moveToWomenTab();
    	objAddToCartPage.clickOnTshirt();
    	objAddToCartPage.moveToTshirtImage();
    	objAddToCartPage.clickOnAddCartButton();
    	objAddToCartPage.clickOnProceedToCheckOut();
    	objAddToCartPage.moveToLinkToCart();
    }
    
    
    
}

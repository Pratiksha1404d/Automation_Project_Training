package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class AddToCartPage {
	
	private BaseTest objBaseTest;
    private SeleniumWrapperFunctions objSeleniumWrapperFunctions;


	public AddToCartPage(BaseTest basetest){
		this.objBaseTest=basetest;
}
	
//Locators
	By loc_tabWomen = By.xpath("//a[@title='Women'][@class='sf-with-ul']");
	By loc_linkTshirts_Women = By.xpath("(//a[@title='T-shirts'])[1]");
	By loc_tshirt = By.xpath("(//span[@class='price product-price'])[1]");
	By loc_imgTshirt= By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	By loc_btn_addToCart= By.xpath("//span[text()='Add to cart']");
	By loc_btnProceedToCheckOut= By.xpath("//a[@title='Proceed to checkout']/span");
	By loc_linkCart = By.xpath("//b[text()='Cart']/..");
	
	
	public void validateMyAccountTitle()
	{
		String ExpectedTitle="My account - My Store";
		Assert.assertEquals(objBaseTest.getDriver().getTitle(), ExpectedTitle);
		System.out.println("-----Navigated to my account Page--------");
	}
	
	public void moveToWomenTab(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().moveToElement(loc_tabWomen));
	}
	public void clickOnTshirt(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkTshirts_Women));
		
	}
	public void moveToTshirtImage() {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().moveToElement(loc_imgTshirt));
	}
	public void clickOnAddCartButton(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btn_addToCart));
	}
	public void clickOnProceedToCheckOut(){
		objBaseTest.getObjSeleniumWrapperFunctions().fluentWait(loc_btnProceedToCheckOut);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnProceedToCheckOut));
	}
	public void moveToLinkToCart() {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().moveToElement(loc_linkCart));
	}
	
	
	
	
	
}
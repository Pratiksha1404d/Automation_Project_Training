package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunctions {
	
	private BaseTest objBaseTest;
	
	public SeleniumWrapperFunctions(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}

	public boolean setText(By locator, String strInputValue)
	{
		try{
		objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
		return true;
		}catch(Exception e){
			System.out.println("Expection is :"+e.getMessage());
		return false;
		}
	}
	
	public boolean click(By locator)
	{
		try{
	   objBaseTest.getDriver().findElement(locator).click();
	return true;
		}catch(Exception e){
			System.out.println("Expection is:  "+e.getMessage());
		return false;
		}
	}
	
	public boolean SelectFromDropDown(By locator, String Value )
	{
		try{
		Select s = new Select(objBaseTest.getDriver().findElement(locator));
		s.selectByVisibleText(Value);
		return true;
		} catch(Exception e){
			System.out.println("Expection is :"+e.getMessage());
		return false;
		}
	}
	public boolean selectRadioButton(By locator)
	{
		try{
	   objBaseTest.getDriver().findElement(locator).click();
	   return true;
		}catch(Exception e){
			System.out.println("Expection is :"+e.getMessage());
		return false;
		}
	}

	public boolean getText(By locator)
	{   try{
		objBaseTest.getDriver().findElement(locator).getText();
		 return true;
	}catch(Exception e){
		System.out.println("Expection is :"+e.getMessage());
	}
	return false;
}
}

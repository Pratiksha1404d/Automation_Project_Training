package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunctions {

private BaseTest objBaseTest;
	
	public SeleniumWrapperFunctions(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}

	public void setText(By locator, String strInputValue)
	{
		objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
		
	}
	public void click(By locator)
	{
	   objBaseTest.getDriver().findElement(locator).click();
	}
	
	public void DropDown(By locator, int value)
	{
	  Select s=new Select(objBaseTest.getDriver().findElement(locator));
	  s.selectByVisibleText(Integer.toString(value));
	}
	
}

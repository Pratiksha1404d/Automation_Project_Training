package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
			e.printStackTrace();
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
			e.printStackTrace();
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
			e.printStackTrace();
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
			e.printStackTrace();
		return false;
		}
	}

	public boolean getText(By locator)
	{   try{
		objBaseTest.getDriver().findElement(locator).getText();
		 return true;
	}catch(Exception e){
		System.out.println("Expection is :"+e.getMessage());
		e.printStackTrace();
		return false;
	}
	
	}
	
	public boolean isSelected(By locator)
	{   try{
		objBaseTest.getDriver().findElement(locator).isSelected();
		 return true;
	}catch(Exception e){
		System.out.println("Expection is :"+e.getMessage());
		e.printStackTrace();
		return false;
	}
	}
	
	public boolean isPresent(By locator)  
	{   try{
		objBaseTest.getDriver().findElement(locator).isDisplayed();
		 return true;
	}catch(Exception e){
		System.out.println("Expection is :"+e.getMessage());
		e.printStackTrace();
		return false;
	}
	}
	
	public boolean dragAndDropTo(By fromlocator , By tolocator)
	{
		try{
			Actions a = new Actions(objBaseTest.getDriver());
			WebElement Drag= objBaseTest.getDriver().findElement(fromlocator);
			WebElement Drop= objBaseTest.getDriver().findElement(tolocator);
			a.dragAndDrop(Drag,Drop).build().perform();
			return true;
			
		} catch(Exception e){
			System.out.println("Expection is :"+e.getMessage());
			e.printStackTrace();
			return false;
	     }
	}
	public boolean rightClick(By locator) //contextclick
	{
		try {
			Actions a = new Actions(objBaseTest.getDriver());
			WebElement rightclick=objBaseTest.getDriver().findElement(locator);
			a.contextClick(rightclick).build().perform();
			return true;
			
		} catch (Exception e) {
			System.out.println("Expection is :"+e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean moveToElement(By locator)         //mousehover
	{
		try {
			Actions a = new Actions(objBaseTest.getDriver());
			WebElement movetoelement=objBaseTest.getDriver().findElement(locator);
			a.moveToElement(movetoelement).build().perform();
			return true;
			
		} catch (Exception e) {
			System.out.println("Expection is :"+e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	public boolean doubleClick(By locator)   
	{
		try {
			Actions a = new Actions(objBaseTest.getDriver());
			WebElement doubleClick=objBaseTest.getDriver().findElement(locator);
			a.doubleClick(doubleClick).build().perform();
			return true;
			
		}  catch (Exception e) {
			System.out.println("Expection is :"+e.getMessage());
			e.printStackTrace();
			return false;
	}

	}

	
	

}

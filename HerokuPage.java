package com.heroku.pagefactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class HerokuPage {
	
	private BaseTest objBaseTest;
    private SeleniumWrapperFunctions objSeleniumWrapperFunctions;


	public HerokuPage(BaseTest basetest){
		this.objBaseTest=basetest;
	}

	//Locators
	
	By loc_linkDragAndDrop = By.xpath("//a[text()='Drag and Drop']");
	By loc_linkContextClick =By.xpath("//a[text()='Context Menu']");
	By loc_linkDropDown=By.xpath("//a[text()='Dropdown']");
	By loc_linkHovers=By.xpath("//a[text()='Hovers']");
	
	By loc_draggable = By.xpath("//div[@id='column-a']");
	By loc_dropable = By.xpath("//div[@id='column-b']");
	By loc_rightClick= By.xpath("//div[@id='hot-spot']");
	By loc_drpSelect=By.xpath("//select[@id='dropdown']");
	By loc_moveToElement=By.xpath("//h5[text()='name: user3']/../../img");
	
	
	public void clickDragAndDropLink()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkDragAndDrop));
	}
	public void dragAndDrop(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().dragAndDropTo(loc_draggable, loc_dropable));

	}
    public void clickRightClickLink(){
		
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkContextClick));
	}
    public void rightClick()
    {
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().rightClick(loc_rightClick));
    }
    public void clickDropDownLink()
    {
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkDropDown));
    }
    
    public void selectFromdropDown(String value)
    {
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().SelectFromDropDown(loc_drpSelect, value));
    }

    public void clickMoveToElementlink()
    {
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_linkHovers));
    }
    public void moveToElement()
    {
    	Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().moveToElement(loc_moveToElement));
    }
    }

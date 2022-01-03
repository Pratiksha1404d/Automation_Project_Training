package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.generic.Pojo;

public class DashboardPageByPratiksha {
	// Global Variables
		private Pojo objPojo;
		private String strUniqueKey = "";
		private String testData = "", testData_2 = "";
		private Integer intTestData = null;
		private String strReturnVal = "";
		private int intReturnVal = 0;
		private boolean blnReturnStatus = false;
		private double dblReturnVal = 0.0;
		private List<WebElement> listReturnElement;
		private WebElement weReturnElement;
		private int intRow = 0;
		private int intColumn = 0;

		public DashboardPageByPratiksha(Pojo pojo) {
			this.objPojo = pojo;
		}
		//locators
		By loc_iconMenuItem=By.xpath("//ul[@id='menu']/li[@class='sidebar-toggle']/div[@type='button' and @class='navbar-toggle']");
	
		public void verifyAllMenuItemsIsDisplayedOnDashboardPage(String strMenuItemName){
			By locator = By.xpath("//span[contains(text(),'"+strMenuItemName+"')]");
			objPojo.getObjWrapperFunctions().checkElementDisplayed(locator);
			objPojo.getObjUtilities().logReporter("Verify menu item : '"+strMenuItemName+"' is displayed on dashboard page .",objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
		}
	public void clickOnMenuItemFromLeftSideBarMenu(String strMenuItemName) {
		By locator = By.xpath("//span[contains(text(),'"+strMenuItemName+"')]");
		objPojo.getObjWrapperFunctions().checkElementDisplayed(locator);
		objPojo.getObjUtilities().logReporter("Verify user can click on menu item list",
				"User should be able to click on menu item '"+strMenuItemName+"'",
				"User is able to click on menu item '"+strMenuItemName+"'", 
				objPojo.getObjWrapperFunctions().click(locator));
	}

	public boolean isMenuItemIconIsDisplayed(){
		return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_iconMenuItem);
	}

	public void clickMenuItemIconOnDashboardPage(){
		objPojo.getObjUtilities().logReporter("click menu item icon on dashboard page", objPojo.getObjWrapperFunctions().click(loc_iconMenuItem));
	}

	public void ClickOnLeftSideMenuItem(String strMenuItem){
		By loc_clickOnMenuItem = By.xpath("//span[contains(text(),'"+strMenuItem+"')]");
		objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_clickOnMenuItem);
		objPojo.getObjUtilities().logReporter("Verify user can click on menu item list", objPojo.getObjWrapperFunctions().click(loc_clickOnMenuItem));
		
	}

}

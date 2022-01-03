package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.Pojo;

public class LoginPageByPratiksha {
	
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

		public LoginPageByPratiksha(Pojo pojo) {
			this.objPojo = pojo;
		}
		
		//Locators
		
		By loc_hdreMedicareSync = By.xpath("//div[@class='text-center client-logo']/a/img");
		By loc_inpUserName = By.xpath("//input[@id='UserName']");
		By loc_inpPassword = By.xpath("//input[@id='Password']");
		By loc_drpDashBoard = By.xpath("//select[@id='StartIN']");
		By loc_btnGetStarted = By.xpath("//button[text()='Get Started']");
		By loc_errorMessageInvalidPassword = By.xpath("//ul//li[text()='Invalid password...Try Again!!!']");
		
		public void verifyUserIsOneMedicareSyncLoginPage(){
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_hdreMedicareSync);
			objPojo.getObjUtilities().logReporter("Verfiy User Is On Medicare Sync LoginPage", objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_hdreMedicareSync));
			
		}
		
		public void setUserID(String userID){
			objPojo.getObjUtilities().logReporter("Enter User ID", userID,
					objPojo.getObjWrapperFunctions().setText(loc_inpUserName, userID));
		}
		
		public void setPassword(String password){
			objPojo.getObjUtilities().logReporter("Enter Password", password,
					objPojo.getObjWrapperFunctions().setText(loc_inpPassword, password));
		}
		
		public void selectDashBoardOptions(String strLoginWithOption){
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_drpDashBoard);
			objPojo.getObjUtilities().logReporter("user select the login option with '"+strLoginWithOption+"' .", objPojo.getObjWrapperFunctions().selectDropDownOption(loc_drpDashBoard, strLoginWithOption, "Text"));

		}
		
		public void clickGetStarted() {
			objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_btnGetStarted);
			objPojo.getObjUtilities().logReporter("Click 'Get Started' button",
					objPojo.getObjWrapperFunctions().click(loc_btnGetStarted));
		}

		public void verifyUserLoggedIn(String strTitle) {
			objPojo.getObjUtilities().logReporter("Verify user login is successfull by using page title",
					objPojo.getDriver().getTitle(), strTitle,
					objPojo.getDriver().getTitle().toLowerCase().contains(strTitle.toLowerCase()));
		}
		public boolean isInvalidPasswordErrorMessageDisplayed()
				{
			
			return objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageInvalidPassword);
		}
		
		public void verifyInvalidPasswordErrorMessageDisplayed()
		{
			objPojo.getObjUtilities().logReporter("Verify Invalid Password Error Message Displayed Successfully", objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_errorMessageInvalidPassword));
		}

		public void clickLogout() {
			objPojo.getObjUtilities().logReporter("Click 'Logout' button",
					objPojo.getObjWrapperFunctions().click(By.xpath("")));
		}
		
		

}

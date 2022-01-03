package com.flows;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.flows.commonFlows.CommonFlow;
import com.generic.Pojo;
import com.pageFactory.DashboardPage;
import com.pageFactory.LoginPage;
import com.pageFactory.LoginPageByPratiksha;
import com.popupFactory.ConfirmLogOffPopUpPage;
import com.popupFactory.SelectRolePopUpPage;

import ru.yandex.qatools.allure.annotations.Step;

public class LoginLogoutFlowByPratiksha {

	// Global Variable
		private Pojo objPojo;
		private String strUniqueKey = "";
		private String testData = "", testData_2 = "";
		private Integer intTestData = null;
		private Integer intTestData_1 = null;
		private String strReturnVal = "";
		private String strReturnVal_1 = "";
		private int intReturnVal = 0;
		
		private boolean blnReturnStatus = false;
		private double dblReturnVal = 0.0;
		private List<WebElement> listReturnElement;
		private WebElement weReturnElement;
		private int intRow = 0;
		private int intColumn = 0;

		// Reference object of Pages
		private LoginPage objLoginPage;
		private CommonFlow objCommonFlow;
		private SelectRolePopUpPage objSelectRolePopUpPage;
		private DashboardPage objDashboardPage;
		private ConfirmLogOffPopUpPage objConfirmLogOffPopUpPage;
		private LoginPageByPratiksha objLoginPageByPratiksha;

		// Constructor of class
		public LoginLogoutFlowByPratiksha(Pojo pojo) {
			this.objPojo = pojo;
			objLoginPage = new LoginPage(objPojo);
			objCommonFlow = new CommonFlow(objPojo);
			objSelectRolePopUpPage = new SelectRolePopUpPage(objPojo);
			objDashboardPage = new DashboardPage(objPojo);
			objConfirmLogOffPopUpPage = new ConfirmLogOffPopUpPage(objPojo);
			objLoginPageByPratiksha = new LoginPageByPratiksha(objPojo);
		}
		
		
		@Step("Login into the Application.")
		public void doLoginWithExcelParamter(){
			testData=objPojo.getObjUtilities().dpString("userid");
			if(!testData.equals(""))
				objLoginPageByPratiksha.setUserID(testData);
			testData=objPojo.getObjUtilities().dpString("userpasswd");
			if(!testData.equals(""))
				objLoginPageByPratiksha.setPassword(testData);
			testData=objPojo.getObjUtilities().dpString("LoginWithOption");
			if(!testData.equals(""))
				objLoginPageByPratiksha.selectDashBoardOptions(testData);
			    objLoginPageByPratiksha.clickGetStarted();
			    if(objLoginPageByPratiksha.isInvalidPasswordErrorMessageDisplayed())
			    {
			    	objPojo.getObjUtilities().logReporter("Getting Invalid Password Error Meassage ", true);
			    }
			    else {
			    objSelectRolePopUpPage.verifySelectRolePopupPageIsDisplayed();
			testData=objPojo.getObjUtilities().dpString("SelectUserRole");
			if(!testData.equals(""))
				objSelectRolePopUpPage.selectUserRole(testData);
			objSelectRolePopUpPage.clickProceedOnSelectRolePopupPage();
			objPojo.getObjWrapperFunctions().waitForLoaderToDisappear();
			testData=objPojo.getObjUtilities().dpString("loginTitle");
			if(!testData.equals(""))
				objLoginPage.verifyUserLoggedIn(testData);
			    }
		}
		
			@Step("Logout to the Application")
		public void doLogoutToTheApplication(){
				
				if(objDashboardPage.isCloseCrossButtonIsDisplayed())
				   objDashboardPage.clickCrossCloseButton();
				
				   objDashboardPage.clickUserIcon();
				if(objDashboardPage.isLogOffPopUpIsDisplayed()){
					objDashboardPage.clickLogOff();
				objDashboardPage.verifyPageHeaderIsDisplayed("Confirm Log Off");
				objConfirmLogOffPopUpPage.clickYesOrNoOnConfirmLogOffPopupPage("Yes");
				}
				else{
					objDashboardPage.clickUserIcon();
					objDashboardPage.clickLogOff();
					objDashboardPage.verifyPageHeaderIsDisplayed("Confirm Log Off");
					objConfirmLogOffPopUpPage.clickYesOrNoOnConfirmLogOffPopupPage("Yes");
				
			    }
		}
		
		
		
		
		
}

package com.scripts.dashboard;

import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.flows.DashboardFlow;
import com.flows.DashboardFlowbyPratiksha;
import com.flows.LoginLogoutFlow;
import com.flows.LoginLogoutFlowByPratiksha;
import com.flows.commonFlows.CommonFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;
import com.pageFactory.LoginPageByPratiksha;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

public class DashBoardTestByPratiksha extends BaseTest {
	
	// Global variables
		private CommonFlow objCommonFlow;
		private LoginPageByPratiksha objLoginPageByPratiksha;
		private DashboardFlowbyPratiksha objDashboardFlowByPratiksha;
		private LoginLogoutFlowByPratiksha objLoginLogoutFlowByPratiksha;
		
		private String testCaseID="";

		// Initialize Flows
		public void initializeFlowsAndPages() {
			objCommonFlow = new CommonFlow(this);
			objLoginPageByPratiksha = new LoginPageByPratiksha(this);
			objDashboardFlowByPratiksha = new DashboardFlowbyPratiksha(this);
			objLoginLogoutFlowByPratiksha = new LoginLogoutFlowByPratiksha(this);
		}

		@BeforeClass(groups = { "P1", "P2", "P3" })
		public void initializeEnvironment() {
			this.initializeWebEnvironment("excel/PRD");
			this.initializeFlowsAndPages();
			/* Resource Name has to be before login */
			objCommonFlow.setResourceName("Pratiksha Deore");
			//objLoginLogoutFlow.doLogin();
		}

		@AfterClass(groups = { "P1", "P2", "P3" })
		public void tearDownEnvironment() {
			this.tearDownWebEnvironment();
			objCommonFlow = null;
			objLoginPageByPratiksha=null;

		}
		
		@BeforeMethod(groups = { "P1", "P2", "P3" })
		public void redirect_Me_To_HomePage_On_SH_Application(Method method) {
			testCaseID = method.getName();
			this.startTestExecutionVideoRecording(testCaseID);
			this.getObjWrapperFunctions().waitFor(5);
			System.out.println("Video Recording Started ....!!");
		}
		
		@AfterMethod
		public void stopVideoRecording(){
			this.stopTestExecutionVideoRecording();
			this.getObjWrapperFunctions().waitFor(5);
			//objLoginLogoutFlowByPratiksha.doLogout();
			System.out.println("Video Recording Stopped ....!!");
		}
		
		@Title("TCID_126_verifyAllMenuItemsListOnDashboard")
		@Description("To Verify All Menu Items List On DashBoard")
	//	@Test(priority = 1, groups = { "P1" })
		public void TCID_126_verifyAllMenuItemsListOnDashboard() {
			this.loadTestData("TCID_126_verifyAllMenuItemsListOnDashboard");
			if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
				throw new SkipException("Run Mode 'No'");
			}
			objCommonFlow.openAUT_URL();
			objLoginLogoutFlowByPratiksha.doLoginWithExcelParamter();
			objDashboardFlowByPratiksha.verifyAllMenuItemsListOnDashboard();
		}
		
		
		@Title("TCID_125_ClickOnLeftSideMenuItem")
		@Description("To Click On Left Side Menu Item")
	    @Test(priority = 1, groups = { "P1" })
		public void TCID_125_ClickOnLeftSideMenuItem() {
			this.loadTestData("TCID_125_ClickOnLeftSideMenuItem");
			if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
				throw new SkipException("Run Mode 'No'");
			}
			objCommonFlow.openAUT_URL();
			objLoginLogoutFlowByPratiksha.doLoginWithExcelParamter();
			objDashboardFlowByPratiksha.clickOnLeftSideMenuItem();
		
}
}

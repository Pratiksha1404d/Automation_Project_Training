package com.scripts.login;

import java.lang.reflect.Method;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flows.LoginLogoutFlow;
import com.flows.LoginLogoutFlowByPratiksha;
import com.flows.commonFlows.CommonFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;
import com.pageFactory.LoginPageByPratiksha;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

public class LoginLogoutTestByPratiksha extends BaseTest {
	
	
	
	// Global variables
		private CommonFlow objCommonFlow;
        private LoginPageByPratiksha objLoginPageByPratiksha;
        private LoginLogoutFlowByPratiksha objLoginLogoutFlowByPratiksha;
        private String testCaseID="";
        
     // Initialize Flows
    	public void initializeFlowsAndPages() {
    		objCommonFlow = new CommonFlow(this);
    		objLoginPageByPratiksha=new LoginPageByPratiksha(this);
    		objLoginLogoutFlowByPratiksha = new LoginLogoutFlowByPratiksha(this);
    	}
    	@BeforeClass
    	public void initializeEnvironment() {
    		this.initializeWebEnvironment("excel/KST");
    		this.initializeFlowsAndPages();
    		
    	}
    	@AfterClass
    	public void tearDownEnvironment() {
    		this.tearDownWebEnvironment();
    		objCommonFlow = null;
    		objLoginPageByPratiksha=null;

    	}
    	@BeforeMethod
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
    		System.out.println("Video Recording Stopped ....!!");
    	}

    	@Title("TCID_101_VerifyLoginFunctionality")
    	@Description("Verify user should login into the system")
    	@Test(priority = 1, groups = { "P1" })
    	public void TCID_101_VerifyLoginFunctionality() {
    		this.loadTestData("TCID_101_VerifyLoginFunctionality");
    		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
    			throw new SkipException("Run Mode 'No'");
    		}
    		objCommonFlow.openAUT_URL();
    		objLoginLogoutFlowByPratiksha.doLoginWithExcelParamter();
    	}
    	
    	@Title("TCID_102_VerifyLogoutFunctionality")
    	@Description("Verify user should logout system")
    	@Test(priority = 2, groups = { "P1" })
    	public void TCID_102_VerifyLogoutFunctionality() {
    		this.loadTestData("TCID_102_VerifyLogoutFunctionality");
    		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
    			throw new SkipException("Run Mode 'No'");
    		}
    		objLoginLogoutFlowByPratiksha.doLogoutToTheApplication();
    	}
}

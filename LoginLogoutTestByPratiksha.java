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
    	@BeforeClass(groups = { "P1", "P2", "P3" })
    	public void initializeEnvironment() {
    		this.initializeWebEnvironment("excel/PRD");
    		this.initializeFlowsAndPages();
    		
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
    		System.out.println("Video Recording Stopped ....!!");
    	}

    	@Title("TCID_123_VerifyLoginFunctionality")
    	@Description("Verify user should login into the system")
    	//@Test(priority = 1, groups = { "P1" })
    	public void TCID_123_VerifyLoginFunctionality1() {
    		this.loadTestData("TCID_123_VerifyLoginFunctionality");
    		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
    			throw new SkipException("Run Mode 'No'");
    		}
    		objCommonFlow.openAUT_URL();
    		objLoginLogoutFlowByPratiksha.doLoginWithExcelParamter();
    	}
    	
    	@Title("TCID_124_VerifyInValidPasswordErrorMeassage")
    	@Description("Verify user should login into the system")
    	@Test(priority = 1, groups = { "P1" })
    	public void TCID_124_VerifyInValidPasswordErrorMeassage() {
    		this.loadTestData("TCID_124_VerifyInValidPasswordErrorMeassage");
    		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
    			throw new SkipException("Run Mode 'No'");
    		}
    		objCommonFlow.openAUT_URL();
    		objLoginLogoutFlowByPratiksha.doLoginWithExcelParamter();
    		
    	}
}


    	


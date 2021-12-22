package com.Orangehrm.pagefactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class OrangeHRMpage {
	private BaseTest objBaseTest;
    private SeleniumWrapperFunctions objSeleniumWrapperFunctions;


	public OrangeHRMpage(BaseTest basetest){
		this.objBaseTest=basetest;
	}
//Locators
	
	By loc_txtUserName = By.xpath("//input[@name='txtUsername']");
	By loc_txtPassword = By.xpath("//input[@name='txtPassword']");
	By loc_btnLogin = By.id("btnLogin");

	By loc_titileAdmin= By.xpath("//b[text()='Admin']");
	By loc_titilePIM= By.xpath("//b[text()='PIM']");
	By loc_titileLeave= By.xpath("//b[text()='Leave']");
	By loc_titileTime= By.xpath("//b[text()='Time']");
	By loc_titileRecruitment= By.xpath("//b[text()='Recruitment']");
	By loc_titileMyInfo= By.xpath("//b[text()='My Info']");
	By loc_titilePerformance= By.xpath("//b[text()='Performance']");
	By loc_titileDashboard= By.xpath("//b[text()='Dashboard']");
	By loc_titileDirectory= By.xpath("//b[text()='Directory']");
	By loc_titileMaintenance= By.xpath("//b[text()='Maintenance']");
	By loc_titileBuzz= By.xpath("//b[text()='Buzz']");
	
	By loc_clickPIMtab= By.xpath("//b[text()='PIM']");
	By loc_clickAddEmployee=By.xpath("//a[text()='Add Employee']"); ///
	By loc_txtEmpFirstName=By.id("firstName");
	By loc_txtEmpLastName=By.id("lastName");
	By loc_btnSave =By.xpath("//input[@id='btnSave']");
	By loc_btnEmployeeList=By.xpath("//a[text()='Employee List']");   //
	
	By loc_txtSearchFirstName=By.xpath("//input[@id='empsearch_employee_name_empName']");
	By loc_btnSearch=By.xpath("//input[@id='searchBtn']");
	
	//PIM Subtitle Tags
	
	By loc_tabConfiguration=By.xpath("//a[@id='menu_pim_Configuration']");
	By loc_tabReports=By.xpath("//a[@id='menu_core_viewDefinedPredefinedReports']");
	
	
	public void HRMlogin()
	{
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_txtUserName, "Admin"));
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_txtPassword, "admin123"));
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnLogin));
	}
	
	public void verifyAllTabsDisplayed()
	{
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titileAdmin), true);
       System.out.println(" Admin Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titilePIM), true);
       System.out.println(" PIM Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titileLeave), true);
       System.out.println("Leave Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titileTime), true);
       System.out.println("Time Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titileRecruitment), true);
       System.out.println("Recruitment Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titileMyInfo), true);
       System.out.println("MyInfo Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titilePerformance), true);
       System.out.println("Performance Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titileDashboard), true);
       System.out.println("Dashboard Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titileDirectory), true);
       System.out.println("Directory Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titileMaintenance), true);
       System.out.println("Maintenance Tab Is Displayed");
       
       Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_titileBuzz), true);
       System.out.println("Buzz Tab Is Displayed");
       
	}
	
	public void navigateToAddEmp(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickPIMtab));
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickAddEmployee));
		
	}
	public void AddEmployeeFirstName(String strFirstName){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_txtEmpFirstName, strFirstName));
	}
	public void AddEmployeeLastName(String strLastName){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_txtEmpLastName, strLastName));
	}
	public void clickSaveButton(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnSave));
	}
	
	public void SearchEmployee(String StrName) throws InterruptedException {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnEmployeeList));
		Thread.sleep(3000);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_txtSearchFirstName, StrName));
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnSearch));
	}
	public void verifyPIMsubtitleTags(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().moveToElement(loc_titilePIM));
		
		Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_tabConfiguration), true);
	    System.out.println("Configuration Tab Is Displayed Under PIM");
	       
	    Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_btnEmployeeList), true);
	    System.out.println("Employee List Tab Is Displayed Under PIM");
	       
	    Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_clickAddEmployee), true);
	   System.out.println("Add Employee Tab Is Displayed Under PIM");
	       
	   Assert.assertEquals(objBaseTest.getObjSeleniumWrapperFunctions().isDisplayed(loc_tabReports), true);
	   System.out.println("Reports Tab Is Displayed Under PIM");
		
		
	}
}

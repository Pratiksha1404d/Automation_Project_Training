package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	private WebDriver driver= null;
	private String strURL="https://www.cleartrip.com/";
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	
public void InitializeWeb(){
	
	System.setProperty("webdriver.chrome.driver","C:/Automation-Workspace/ClearTrip/ExternalResources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	objSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this);
	this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
	driver.get(strURL);
	driver.manage().window().maximize();
	System.out.println("Open URL: "+strURL);
	System.out.println("title is:" +driver.getTitle());
	System.out.println("CurrenURL is : " + driver.getCurrentUrl());
}
public WebDriver getDriver()
{
	return driver;
}
public SeleniumWrapperFunctions getObjSeleniumWrapperFunctions() {
	return objSeleniumWrapperFunctions;
}
public void setObjSeleniumWrapperFunctions(SeleniumWrapperFunctions objSeleniumWrapperFunctions) {
	this.objSeleniumWrapperFunctions = objSeleniumWrapperFunctions;
}

public void teardown(){

	System.out.println("Closing Browser");
	// driver.close();
}
}



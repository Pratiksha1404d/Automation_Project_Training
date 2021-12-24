package com.generic;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

private WebDriver driver = null;
private Properties objconfig;
private String strURL="";

private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	
	public void initializeWebEnvironment(){
		this.loadConfigProperties();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		objSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this); 
		this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
		strURL=objconfig.getProperty("AUT_URL");
		driver.get(strURL);
		driver.manage().window().maximize();
		objSeleniumWrapperFunctions.implicitWait(20);
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
	
	 public void loadConfigProperties()
	   {
		   
		   try {
			objconfig = new Properties();
			objconfig.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Configuration/config.properties"));
	        } catch (IOException e) {
	        	System.out.println("Exception is :"+e.getMessage());
			
			e.printStackTrace();
		}
	   }

	public void tearDown()
	{
		System.out.println("Closing Browser");
	       driver.close();	
		
	}

}

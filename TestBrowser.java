package com.parallelTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser extends BaseTest {
	
	
	@Parameters({"BrowserName"})
	@Test
	public void doLogin(String browser){
		System.out.println("Browser is :"+browser);
		driver=getDriver(browser);
		driver.get("https://www.facebook.com/");
		driver.quit();
	}
	
	
	
	

}

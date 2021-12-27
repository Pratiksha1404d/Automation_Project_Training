package com.parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	
	public WebDriver getDriver (String browser){
		
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
	//		WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if (browser.equals("Ie"))
		{
			
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}
		else if (browser.equals("FireFox"))
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}

}

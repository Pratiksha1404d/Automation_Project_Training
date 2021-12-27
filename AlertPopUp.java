package com.JavaScriptExcecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/ExternaleResources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text= alert.getText();
		
		if (text.equals("Please enter a valid user name")){
			System.out.println("correct alert msg");
			
		} else {
             System.out.println("In-correct alert msg");
		}
		alert.accept();
		
		
		//alert.dismiss();
		
		//alert.wait();
	
}
}
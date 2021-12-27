package com.RegressionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	String expectedTitle ="Facebook";
	String actualTitle ="Facebook";
	
	@Test 
	public void TC_02_TitleValidation(){
	
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("TC02_Test case is passed");
	}
	

}

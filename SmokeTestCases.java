package com.SmokeTest;

import org.testng.annotations.Test;

public class SmokeTestCases {
	
	@Test(groups ={"smoke"}) 
	public void TC_01(){
		System.out.println("Test Case 1");
	}
	
	@Test 
	public void TC_02(){
		System.out.println("Test Case 2");
	}
	
	@Test(groups ={"smoke"}) 
	public void TC_03(){
		System.out.println("Test Case 3");
	}
	
	@Test 
	public void TC_04(){
		System.out.println("Test Case 4");
	}
	
	@Test 
	public void TC_05(){
		System.out.println("Test Case 5");
	}
	
	@Test(groups ={"smoke"})
	public void TC_06(){
		System.out.println("Test Case 6");
	}
	
	@Test 
	public void TC_07(){
		System.out.println("Test Case 7");
	}

}

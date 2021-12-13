package com.abstraction;

public class TestBaseTest {

	public static void main(String[] args) {
		
		BaseTest objBaseTest_1 = new ChromeDriver();
		BaseTest objBaseTest_2 = new IEDriver();
		
		objBaseTest_1.initializewebEnv();
	objBaseTest_1.teardown();
		
		objBaseTest_2.initializewebEnv();
		objBaseTest_2.teardown();

	}

}


 
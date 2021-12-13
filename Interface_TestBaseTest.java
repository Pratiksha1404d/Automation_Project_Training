package com.Interface;

public class Interface_TestBaseTest {

	public static void main(String[] args) {
		
	  Interface_BaseTest objBaseTest1 = new Interface_ChromeDriver();
	  Interface_BaseTest objBaseTest2 = new Interface_IEDriver();
	  
	  objBaseTest1.IntalizeWedEnv();
	  objBaseTest1.teardown();
	  
	  objBaseTest2.IntalizeWedEnv();
	  objBaseTest2.teardown();
	  
	}
	
	}


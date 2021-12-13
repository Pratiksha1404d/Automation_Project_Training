package com.abstraction;

public abstract class BaseTest {

	public abstract void initializewebEnv();   // Abstract Method
	
	public void teardown(){
		System.out.println("Close Browser");    //Non-Abstract Method
	}
		
	
	}
	
	


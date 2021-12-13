package com.abstraction;

public class IEDriver extends BaseTest {
	
	public IEDriver(){
		System.out.println("Chrome Driver Initialized- constructor");
	}

	@Override
	public void initializewebEnv() {
		System.out.println("IE Driver Opening");
		
	}
}


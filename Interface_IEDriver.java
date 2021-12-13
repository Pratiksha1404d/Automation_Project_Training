package com.Interface;

public class Interface_IEDriver implements Interface_BaseTest{

	@Override
	public void IntalizeWedEnv() {
		System.out.println("IE driver ");
		
	}

	@Override
	public void teardown() {
		System.out.println("closing browser");
	}

}

package com.Interface;

public class Interface_ChromeDriver implements Interface_BaseTest {

	@Override
	public void IntalizeWedEnv() {
		System.out.println("in Chromedriver");
		
	}
	@Override
	public void teardown() {
		System.out.println("closing browser");
	}

	
}

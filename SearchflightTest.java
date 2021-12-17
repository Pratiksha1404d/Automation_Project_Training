package com.cleartrip.testScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cleartrip.pagefactory.Searchflightpage;

import com.generic.BaseTest;

public class SearchflightTest extends BaseTest {
	
	private Searchflightpage objSearchflightpage;

@BeforeClass
public void BeforeMethod(){
	this.InitializeWeb();
	objSearchflightpage = new Searchflightpage(this);
}

@AfterClass
public void AfterMethod(){
	this.teardown();
}

@Test
public void TC_001(){
	System.out.println("Test Case 1: Click on round trip");
	objSearchflightpage.checkRoundTrip();
}

@Test
public void TC_002(){
	System.out.println("Test Case 2: Enter from location");
	objSearchflightpage.From_Location("BOM - Mumbai, IN");
}
@Test
public void TC_003(){
	System.out.println("Test Case 3: Enter To location");
	objSearchflightpage.To_Location("BLR - Bangalore, IN");
}
@Test
public void TC_004(){
	System.out.println("Test Case 4: Enter depart on date");
//	objSearchflightpage.departOnDate();
}

@Test
public void TC_005(){
	System.out.println("Test Case 5: Enter return on date");
//	objSearchflightpage.returnOnDate();
}
@Test
public void TC_006(){
	System.out.println("Test Case 6: Select adult");
	objSearchflightpage.selectAdults(2);
}

@Test
public void TC_007(){
	System.out.println("Test Case 7: Click search flight button");
	objSearchflightpage.clickSearchFlightButton();
}
}

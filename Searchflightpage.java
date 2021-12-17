package com.cleartrip.pagefactory;

import org.openqa.selenium.By;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class Searchflightpage {
	private BaseTest objBaseTest;
    private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	
	public Searchflightpage(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}
	
	
//locator
	
By loc_clickroundtripbutton = By.xpath("//p[text()='Round trip']");
By loc_fromLocation = By.xpath("//h4[text()='From']/../div/div/div/input");
By loc_toLocation = By.xpath("//h4[text()='To']/../div/div/div/input");
By loc_departOnDate = By.xpath("//h4[text()='Depart on']/../../following-sibling::div/div/div/div/div/button");
By loc_returnOnDate = By.xpath("//h4[text()='Return on']/../../following-sibling::div/div/div/div/div/button");
By loc_selectAdults = By.xpath("//h4[text()='Adults']");
By loc_selectChildren= By.xpath("//h4[text()='Children']");
By loc_searchFlightButton = By.xpath("//button[text()='Search flights']");


public void checkRoundTrip()
{
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickroundtripbutton);
}

public void From_Location(String strFromLocation)
{
	objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_fromLocation, strFromLocation);
}

public void To_Location(String strToLocation)
{
	objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_toLocation, strToLocation);
}

public void departOnDate(int departureDate)
{
//	objBaseTest.getObjSeleniumWrapperFunctions().click();
//	objBaseTest.getObjSeleniumWrapperFunctions()
}
public void returnOnDate(int returnDate)
{
//	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_returnOnDate);
//	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_selectReturnDate19);
}

public void selectAdults(int intAdults)
{
	objBaseTest.getObjSeleniumWrapperFunctions().DropDown(loc_selectAdults, intAdults);
}

public void clickSearchFlightButton()
{
	objBaseTest.getObjSeleniumWrapperFunctions().click(loc_searchFlightButton);
}

}

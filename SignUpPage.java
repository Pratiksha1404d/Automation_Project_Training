package com.pagefactory;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class SignUpPage{ 
	
	private BaseTest objBaseTest;
    private SeleniumWrapperFunctions objSeleniumWrapperFunctions;

	public SignUpPage(BaseTest baseTest)
	{
		this.objBaseTest=baseTest;
	}

//Locators
By loc_clickCreateAccountButton = By.xpath("//a[text()='Create New Account']");
 By loc_inpFirstName = By.xpath("//input[@name='firstname']");
 By loc_inpLastName = By.name("lastname");
 By loc_inpMobileNumber = By.name("reg_email__");
 By loc_inpPassword = By.id("password_step_input");
 By loc_inpBirthDate= By.name("birthday_day");
 By loc_inpBirthMonth= By.name("birthday_month");
 By loc_inpBirthYear= By.name("birthday_year");
 By loc_inpGenderFemale= By.xpath("//label[text()='Female']");
 By loc_inpGenderMale= By.xpath("//label[text()='Male']");
 By loc_clickSignUpButton =By.xpath("//button[@name='websubmit']");
 
    public void clickCreateAcount()
   {
	    Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickCreateAccountButton));
   }
    
	public void setFirstNameInFBSignUpPage(String strFirstName) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstName, strFirstName));
	}
	public void setSurnameInFBSignUpPage(String strSurname) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpLastName, strSurname));
	}

	public void setMobileNumInFbSignUpPage(String strMobileNum) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpMobileNumber, strMobileNum));       
	}

	public void setPasswordInFBSignUpPage(char charPasssword[]) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpPassword, String.valueOf(charPasssword)));
	}
	
	public void selectDate(int intDate) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().SelectFromDropDown(loc_inpBirthDate, Integer.toString(intDate)));
	}

	public void selectMonth(String strMonth) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().SelectFromDropDown(loc_inpBirthMonth, strMonth));
	}

	public void selectYear(int intYear) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().SelectFromDropDown(loc_inpBirthYear, Integer.toString(intYear)));
	}

	public void selectGender(String strGender) {
		if(strGender.equals("Female"))
		{
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().selectRadioButton(loc_inpGenderFemale));
		}
		else
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().selectRadioButton(loc_inpGenderMale));
	}
	
	public void clickOnSignUpButton() {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickSignUpButton));
	}

}

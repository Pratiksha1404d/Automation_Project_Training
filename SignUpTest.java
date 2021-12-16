package com.fb.signup.testScripts;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.signup.pagefactory.SignUpPage;
import com.generic.BaseTest;
import com.generic.Utilities;

public class SignUpTest extends BaseTest
{
	private SignUpPage objSignUpPage;
	private Utilities objUtilities;
	
	@BeforeClass
    public void beforeMethod() 
	{
	 this.initializeWebEnvironment();
	  objSignUpPage = new SignUpPage(this);
	  objUtilities = new Utilities();
	}
	
	@AfterClass
    public void afterMethod()
	{
		this.tearDown();
	}

     @Test
	 public void TC_001() throws InterruptedException 
	{
    	 objSignUpPage.clickCreateAcount();
    	 Thread.sleep(3000);
	}
     @Test
	 public void TC_002()
	 {
    	 String strFirstName = objUtilities.generateRandomFirstName();
    	 System.out.println("First Name:"+strFirstName);
    	 objSignUpPage.setFirstNameInFBSignUpPage(strFirstName);
	}

     @Test
   	 public void TC_003()  //Surname
   	{
    	 String strSurname = objUtilities.generateRandomSurname();
    	 System.out.println("First Surname: "+strSurname);
    	 objSignUpPage.setSurnameInFBSignUpPage(strSurname);
   	}	
		
     @Test
   	 public void TC_004() //Mobile
   	{
    	 String strMobileNum = objUtilities.generateMobileNum();
    	 System.out.println("Mobile Number: "+strMobileNum);
    	 objSignUpPage.setMobileNumInFbSignUpPage(strMobileNum);
   	}
     
     @Test
   	 public void TC_005() //Password
   	{
    	 char charPassword[]= objUtilities.generatePassword();
    	 System.out.println("password : "+charPassword);
         objSignUpPage.setPasswordInFBSignUpPage(charPassword); 
   	}	
     
     @Test
   	 public void TC_006()   //Date
   	{
    	 int intDate=objUtilities.generateDate();
    	 System.out.println("Date : "+intDate);
    	 objSignUpPage.selectDate(intDate);
   	}
   
     @Test
   	 public void TC_007()   //Month
   	{
    	   String strMonth=objUtilities.generateMonth();
    	   System.out.println("month : "+strMonth);
    		objSignUpPage.selectMonth(strMonth);
   	}
     
     @Test
  	 public void TC_008() //Year
   	{
    	   int intYear=objUtilities.generateYear();
    	   System.out.println("year : "+intYear);
    	   objSignUpPage.selectYear(intYear);
   	}	
	   

	
}

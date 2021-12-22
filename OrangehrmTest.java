package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Orangehrm.pagefactory.OrangeHRMpage;
import com.generic.BaseTest;


public class OrangehrmTest extends BaseTest{
	
private	OrangeHRMpage objOrangeHRMpage ;

@BeforeClass
public void beforeMethod() 
{
 this.initializeWebEnvironment();
 objOrangeHRMpage = new OrangeHRMpage(this);
}

@Test(priority=1)
public void Login_TC01()
{
	objOrangeHRMpage.HRMlogin();	
}

@Test(priority=2)
public void verifyTitleTabsDisplays_TC02()
{
	objOrangeHRMpage.verifyAllTabsDisplayed();
}

@Test(priority=4)
public void addEmployeeDetails_TC03()
{
	objOrangeHRMpage.navigateToAddEmp();
	objOrangeHRMpage.AddEmployeeFirstName("Pratiksha");
	objOrangeHRMpage.AddEmployeeLastName("Deore");
	objOrangeHRMpage.clickSaveButton();
}

@Test(priority=5)
public void searchEmployee_TC04() throws InterruptedException 
{
	objOrangeHRMpage.SearchEmployee("Pratiksha Deore");
}

@Test(priority=3)
public void verifyPIMSubTitleTags_TC05()
{
	System.out.println("---------Sub tabs under PIM--------------");
	objOrangeHRMpage.verifyPIMsubtitleTags();
	
}

@AfterClass
public void afterMethod()
{
	this.tearDown();
}

}




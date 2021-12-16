package com.testNG_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

 @Test(priority=2)          //priority is 2
 public void TestCase1() {
 System.out.println("Test Case One-1");
     }

 @Test (priority=1)       // priority is 1
 public void TestCase2(){
  System.out.println("Test Case One-2");
  }
 
@Test(enabled =false)          //Ignore test case
 public void TestCase3(){
  System.out.println("Test Case One-2");
  }

@Test(alwaysRun = true)          //it always runs
public void TestCase4(){
 System.out.println("Test Case One-2");
 }

@BeforeMethod
    public void Before_Method1(){
	System.out.println("In Before Method");
	}

@AfterMethod
    public void After_Method(){
	System.out.println("In After Method");
    }

@BeforeClass
    public void Before_Class(){
	System.out.println("In Before Class");
}
@AfterClass
   public void After_Class(){
	System.out.println("In After Class");
}

@BeforeTest
   public void Before_Test(){
	System.out.println("In Before Test");
}

@AfterTest
  public void After_Test(){
	System.out.println("In After Test");
}

@BeforeSuite
  public void Before_Suite(){
	System.out.println("In Before Suite");
}

@AfterSuite
  public void After_Suite(){
	System.out.println("In After Suite");
}

}



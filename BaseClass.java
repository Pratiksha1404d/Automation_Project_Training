package com.FinalKeyword;

public final class BaseClass {        //Final Class cannot extends 

	public BaseClass() {
	    System.out.println("This is in final class");
	}
	
	final int age = 32;      //Final Variable cannot change 
     
	public final void Final_Method1() {      //Final Method cannot override
	      System.out.println("Final_Method1");
	    } 
	
}

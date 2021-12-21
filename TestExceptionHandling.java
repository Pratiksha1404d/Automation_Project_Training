package com.ExceptionHandling;

public class TestExceptionHandling {

	public static void main(String[] args) {
	
		ExceptionHandling objExceptionHandling=new ExceptionHandling();
		int result=objExceptionHandling.Division(200, 0);
		System.out.println("Result is :"+ result );

		objExceptionHandling.Array();
	
		objExceptionHandling.nullPointerException();
		
	}

}

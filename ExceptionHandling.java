package com.ExceptionHandling;

public class ExceptionHandling {

	public int Division(int num1,int num2){
		  int result=0;
		try {
			 result=num1/num2;
			 return result;
			
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception is: "+e.getMessage());
			
			return result; }
			
	      catch(ArithmeticException e){
	    	  System.out.println("Arithmetic Exception is: "+e.getMessage());
	    	  return result;
	      }  
	}
	
	public void Array(){
		try {
			int arr[]={1,2,3,4};
			System.out.println(arr[7]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception is: " +e.getMessage());
			
		}
	}
	
	public void nullPointerException(){
		try{
		String str = null;
		System.out.println(str.length());
		}
		catch(NullPointerException e){
		System.out.println("Null pointer exception is: " +e.getMessage());
		}
		
		
	}
	 
}
	
	
	
	
	
	
	
	



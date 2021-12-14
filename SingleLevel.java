package com.Inheritance;

 class parent  {
	void m1(){
		System.out.println("m1");
	}
}
 class child extends parent{
	
	void m2()
	{
		System.out.println("m2");
	}
}
 
 
public class SingleLevel
{
public static void main(String args[]){
	
	child obj= new child();
	obj.m2();

}
}
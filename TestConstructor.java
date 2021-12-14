package com.JavaBasics;

 public class TestConstructor {
	
	public TestConstructor(){
		System.out.println("constructor");
	}
	
 public void method1(){
	System.out.println("method1 runn");
}
	

	public static void main(String[] args) {
		
		TestConstructor obj=new TestConstructor();
		obj.method1();

	}

}

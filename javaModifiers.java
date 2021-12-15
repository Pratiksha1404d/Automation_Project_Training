package com.Modifiers;

class test{
	private  int a =20;
	protected int b=30;
	 String str="abhi";
	 
	protected void m1()
	{
		System.out.println("heloo");
	}
}
class javaModifiers {

	public static void main(String[] args) {
		test obj = new test();
		obj.m1();

	}

}

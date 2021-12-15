package com.Polymorphism;

class test{

public void method1()
{
	System.out.println("OverLoadingTest");
}
public void method1(int A,int B)
{
	System.out.println(A+ " " + B);
}
}

public class OverLoadingTest {

public static void main(String[] args) {
   
	test obj1=new test();
	obj1.method1(12,33);
}
}
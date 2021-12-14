package com.Inheritance;

      class Company{
    	  void method1(){
    		  System.out.println("company one 1");
    	  }
      }
    	  class employee extends Company {
    		  void method2(){
    			  System.out.println("employee in the company");
    		  }
    	  }  
    	  class students extends employee{
    		  void method3(){
    			  System.out.println("subemployee");
    		  }
    	  }
    	  
public class MultipleLevel {

	public static void main(String[] args) {
		students obj1=new students();
		obj1.method2();
		obj1.method1();
		obj1.method3();

	}

}

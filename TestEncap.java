package com.Encapsulation;

public class TestEncap {

	public static void main(String[] args) {

		CompanyEncap obj= new CompanyEncap();
		obj.setEmployeeid(23);
		obj.setEmployeename("Pratiksha");
		
		System.out.println(obj.getEmployeeid());
		System.out.println(obj.getEmployeename());
	}

}

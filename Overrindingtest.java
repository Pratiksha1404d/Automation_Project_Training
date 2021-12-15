package com.Polymorphism;

class OnlinePay {
	public void Rupees(){
		System.out.println("OnlinePay");
	}
}

class GooglePay extends OnlinePay {
	public void Rupees(){
		System.out.println("GooglePay");
	}
}


public class Overrindingtest {
	
	public static void main(String[] args) {
 
		GooglePay obj3=new GooglePay();
		obj3.Rupees();
		

}
		
}

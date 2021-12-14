package com.JavaBasics;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Abhishek" ;
		String s2 = "Jadhav";
		
		System.out.println(s.length());

		System.out.println(s.indexOf('h'));
		
		System.out.println(s.charAt(4));
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.replace('b', 'y'));
		
		System.out.println(s.equals("Abhishek"));
		
		System.out.println(s + " hhhhh " + s2);
		
		System.out.println(s.concat(s2));
		
		System.out.println(s.endsWith("eky"));
		
		System.out.println(s.compareToIgnoreCase(s2));
		
	}

}

package com.Collections;

import java.util.Hashtable;

public class HashTableCollections {
	
public void HashTable(){
	
	 Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
	
	 hashtable.put("EmpAge", 30);
	 hashtable.put("EmpSallary",845);
	 hashtable.put("EmpContactNo.", 1234567);
	 hashtable.put("EmpId", 33);

	 System.out.println("Employee Details :"+ hashtable);
	 
	 System.out.println("Employee Age is :"+ hashtable.get("EmpAge"));
	 
	 System.out.println("Contains the value :"+ hashtable.contains(845));
	 
	
	 
	 
	 
}

	
	
}

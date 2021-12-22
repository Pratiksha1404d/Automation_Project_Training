package com.Collections;
import java.util.HashSet;

public class HashSetCollections {

public void HashSet() {
	
HashSet<String> set=new HashSet();

set.add("Pratiksha");
set.add("Deore");
set.add("Selenium");
set.add("Java");
set.add("Automation");
set.add("Deore");

System.out.println("set is :"+ set);   
System.out.println("Size is :"+set.size());
System.out.println("Value is Equals to :"+set.contains("Java"));

set.remove("Java");     // it will remove "Java"
System.out.println("set is :"+ set); 
	

System.out.println("List is Empty :" +set.isEmpty());  //it will check list is empty or not
}

	
}

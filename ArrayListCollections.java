package com.Collections;

import java.util.ArrayList;

public class ArrayListCollections {
	
public void ArrayList(){
	
	ArrayList<Integer> list=new ArrayList<Integer>();

	list.add(10);
	list.add(77);
	list.add(50);
	list.add(60);
	list.add(46);
	list.add(88);
	list.add(94);
	
	System.out.println("list is :"+ list);
	list.remove(1);
	System.out.println("After Remove list is :"+ list);    //Remove
	System.out.println("List contains this value : "+list.contains(100));   //Contains
	
	System.out.println("Get as per index :"+list.get(1));  //get as per index number
	
	System.out.println("Size of list is :"+list.size());   //length
	
    list.add(1,55);             //Add value at index
    System.out.println(list);
	
	System.out.println("Index Of :"+ list.indexOf(60));  //Index OF 
	
	list.clear();
	System.out.println("List is cleared :"+list);   //clear the list
}

}

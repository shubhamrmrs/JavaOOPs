package com.hello.oops;

import java.util.*;
import java.util.Map.Entry;

public class Collections {
public static void main(String[] args) {
	/*
	 * List and ArrayList
	 */
	
	List<String> list = new ArrayList<>();
	list.add("India");
	list.add("Pakistan");
	
	for(String str : list) {
		System.out.println("New : "+str);
	}
	
	list.set(0, "USA");
	
	System.out.println("0th data Search : "+list.get(0));
	
	for(String str : list) {
		System.out.println("Updated : "+str);
	}
	System.out.println("**********************************************");
	/*
	 * Sorting
	 */
	
	java.util.Collections.sort(list);
	
	for(String str : list) {
		System.out.println("Sorted : "+str);
	}
	
	
	list.remove(0);
	
	for(String str : list) {
		System.out.println("After deleting : "+str);
	}
	Student s = new Student(1, "Amit");
	ArrayList<Student> stdList1 =  new ArrayList<Student>();
	stdList1.add(s);
	
	ArrayList<Student> stdList2 =  new ArrayList<Student>();
	stdList2.add(new Student(2, "Shubham"));
	
	stdList2.addAll(stdList1);
	
	System.out.println("stdList2 : "+stdList2.size());
	
	for(Student std : stdList2) {
		System.out.println(std);
	}
	System.out.println("**********************************************");

	
	
	/*
	 * Set and HashSet
	 */
	
	Set<String> countryList = new HashSet<>();
	countryList.add("India");
	countryList.add("India");
	countryList.add("USA");
	countryList.add("Pakistan");
	countryList.add("Pakistan");
	
	for(String str : countryList) {
		System.out.println("Set new : "+str);
	}
	
	if(countryList.contains("India")) {//LIST as well
		System.out.println("This is India");
	}
	
	if(!countryList.isEmpty()) {//LIST as well
		System.out.println("Set not is Empty");
	}
	
	countryList.remove("India");
	
	
	for(String str : countryList) {
		System.out.println("Set remove : "+str);
	}
	
	System.out.println("**********************************************");

	/*
	 * Map and HashMap
	 */
	Student s1= new Student(11, "Amit");
	Map<Integer, Student> map = new HashMap<>();
	map.put(101, s1);
	map.put(101, new Student(12, "Vicky"));
	map.put(102, new Student(13, "Shubham"));
	map.put(103, new Student(14, "Monty"));
	
	for(Entry<Integer, Student> entry : map.entrySet()) {
		System.out.println("Key : "+entry.getKey());
		System.out.println("Value : "+entry.getValue());
	}
	
	System.out.println("Keys : "+map.keySet());
	
	for(Integer key : map.keySet()) {
		System.out.println("Values : "+map.get(key));
	}
	
	map.put(101, new Student(15, "Jyotasna"));
	
	System.out.println("Updated Value : "+map.get(101));
	System.out.println("Size before removing : "+map.size());
	map.remove(101);
	
	System.out.println("After deleted Value : "+map.get(101));
	System.out.println("Size after removing: "+map.size());
	
	
	
	
}
}

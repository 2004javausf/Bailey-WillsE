package com.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MyMap {
	
	//consists of key, value pairs
	//Each key has to be unique and can be only mapped to one value
	//A key can be mapped to a duplicate value
	
	//Methods 
	//Basic Operations
	// put, get, remove, containsKey, containsValue, size, and empty
	
	//BulkOperations
	//	putAll, clear
	
	//Collection Views:
	//keySet, entrySet, and values
	
	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new HashMap<>(); 
		/*
		 * Allows Duplicate values, not duplicate keys
		 * Allows a single null key, and it allows multiple null values
		 * Does not guarantee
		 */
		Map<String, Integer> treeMap = new TreeMap<>();
		/*
		 * Does Not allow null keys, but does allow null values
		 * sorted according to the natural ordering of the keys
		 */
		Map<Integer, String> otherMap = new LinkedHashMap<>();
		/*
		 * It maintains insertion order
		 */
		
		myMap.put(1, "First Value");
		myMap.put(10, "True");
		myMap.put(13, "Dope");
		myMap.put(18, "Cool");
		System.out.println(myMap);
		System.out.println(myMap.get(1));
		System.out.println(myMap.remove(1));
		
		System.out.println(myMap);
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		
		System.out.println(myMap.size());
		System.out.println(myMap.isEmpty());
		
		otherMap.putAll(myMap);
		System.out.println(otherMap);
		otherMap.clear();
		System.out.println(otherMap);
		
		Set<Integer> myKeySet = myMap.keySet();
		for(Integer i:myKeySet) {
			System.out.println(myMap.get(i));
		}
		
		Set <Entry<Integer, String>>myPairs = myMap.entrySet();
		
		for(Entry<Integer, String> i: myPairs) {
			System.out.println(i);
		}
 
	}

}

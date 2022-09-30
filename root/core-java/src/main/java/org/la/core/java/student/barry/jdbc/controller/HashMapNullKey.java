package org.la.core.java.student.barry.jdbc.controller;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap allows one key null and multiple null values
 * null is exceptional case as a key in hashmap
 * when key is null then it will not call hash function
 * 
 */
public class HashMapNullKey {

	public static void main(String ar[]) {
		Map<String, Integer> map = new HashMap<>();
		map.put(null, 1);
		System.out.println(map.get(null));
		
		map.put(null, 2);
		System.out.println(map.get(null));
	}
}

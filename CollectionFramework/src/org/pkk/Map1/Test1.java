package org.pkk.Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test1 {

	public static void main(String[] args) {
		
		Map<String,String> m = new HashMap<String, String>();
		System.out.println(m.put("hello", "world"));
		System.out.println(m.put("raj", "raj"));
		System.out.println(m.put("hello", "world !!"));
		
		Map<String,String> m1 = new ConcurrentHashMap<String, String>();
		System.out.println(m1.put("hello", "world"));
		System.out.println(m1.put("raj", "raj"));
		System.out.println(m1.put("hello", "world !!"));

	}

} 

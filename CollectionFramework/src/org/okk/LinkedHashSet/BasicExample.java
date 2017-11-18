package org.okk.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BasicExample {

	public static void main(String[] args) {

		LinkedHashMap<String,String> linked = new LinkedHashMap<>();
		linked.put("Raj", "Kanpur");
		linked.put("hello", "Kanpur");
		linked.put("gav", "Kanpur");
		linked.put("Raj", "pune");
		
		System.out.println("Map >>" + linked);
		
		Set<Map.Entry<String, String>> set = linked.entrySet();
		
		Iterator<Entry<String, String>> list = set.iterator();
		
		Iterator<Entry<String, String>> list1=linked.entrySet().iterator();
		
		while(list.hasNext()){
			Entry e = list.next();
			System.out.println("\tlist : " + e.getKey());
		}
		
		while(list1.hasNext()){
			Entry e = list1.next();
			System.out.println("\tlist1 : " + e.getValue());
		}
		
		
		for (Entry<String,String> entry : linked.entrySet()) {
			System.out.println("\nentry : " + entry.getKey() );
		}
		
		
	}

}

package org.pkk.ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListtoArrays {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("India");
		list.add("Switzerland");
		list.add("Italy");
		list.add("France");
		
		String [] countries = list.toArray(new String[list.size()]);
		
		for(String s : countries){
		System.out.println(s);
		}
		
		//convert array back to arraylist
		List list1 = Arrays.asList(countries);
		System.out.println("ArrayList of Countries:" + list1);
	}
	
}

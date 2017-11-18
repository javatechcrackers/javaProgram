package com.pkk.removeDuplicate;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatePin {

	public static void main(String[] args) {
		
		Address a1 = new Address("Pune", "MH", 411013);
		Address a2 = new Address("Pune", "MH", 411013);
		Address a3 = new Address("Mumbai", "MH", 411043);
		Address a4 = new Address("Nashik", "MH", 411044);

		ArrayList list =  new ArrayList<Address>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		
		System.out.println(list.toString());
		
		
	}

}

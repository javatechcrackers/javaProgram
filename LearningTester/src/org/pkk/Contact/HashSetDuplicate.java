package org.pkk.Contact;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contact c1=new Contact(1,"pkk",1234);
		Contact c2=new Contact(2,"pkkk",12345);
		Contact c3=new Contact(3,"ravi",123456);
		Contact c4=c1;
		Contact c5=new Contact(1,"pkk",1234);
		
		List<Contact> list=new ArrayList<Contact>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		for(Contact c : list){
			System.out.println("List :: " + c.contactid);
		}
		
		/**
		 * Here if we are inserting same contact obj with same value, then it will allow duplicate obj
		 * so to prevent this we need to override hashcode and equals methods
		 */
		
		Set<Contact> set = new HashSet<Contact>();
		set.add(c1);
		set.add(c5);
		set.add(c3);
		for(Contact c : set){
			System.out.println("Set :: " + c.contactid);
		}
	}

}

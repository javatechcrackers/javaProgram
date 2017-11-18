package Demo_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateArrayList {
	
	/*ArrayList<String> list=new ArrayList<String>();
	DuplicateArrayList(){
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		list.add("Grapes");
		list.add("Apple");
		list.add("Bananna");
		list.add("Bananna");
		list.add("Bananna");
		list.add("Bananna");
		list.add("Mango");
		list.add("Mango");
	}
	public ArrayList<String> display(){
		for(int i=0;i<list.length;i++){
			
		}
		return list;
		
	}*/
	public static void main(String[] args) {
		 String s ="Prashant";
		DuplicateArrayList d= new DuplicateArrayList();
		ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		list.add("Grapes");
		list.add("Apple");	
		list.add("Bananna");
		list.add("Bananna");
		list.add("Bananna");
		list.add("Bananna");
		list.add("Mango");
		list.add("Mango");
		
		Iterator<String> sa=list.iterator();
	//	for(int i=1;i<sa.)
		
		System.out.println(list);
		
		Set<String> unique = new HashSet<String>(list);
		for (String value : unique) {
		    System.out.println(value + ": " + Collections.frequency(list, value));
		}
		//System.out.println(s.s);
		/*for(int i=0;i<list.size();i++){
			for(int j=0; j<list.size(); j++){
				if(list[i)
			}*/
		}
}



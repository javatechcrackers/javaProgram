package Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ContactImpl {

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
				
		Set<Contact> set=new HashSet<Contact>();
		set.addAll(list);
		
		for(Contact c:set){
			System.out.println("Set id "+ c.getContactid() + " name "+ 
					c.contactname + " number " + c.contactnumber);	
		}
		for(Contact c:list){
			System.out.println("list id "+ c.getContactid() + " name "+ 
					c.contactname + " number " + c.contactnumber);	
		}
		if(c1==c4){
			System.out.println("c1 and c4 are equal"); } 
			else{ System.out.println("c1 and c4 not equal"); }
		if(c1.equals(c4)){
			System.out.println("c1 and c4 are equal"); } 
			else{ System.out.println("c1 and c4 not equal"); }
		if(c1.equals(c5)){
			System.out.println("c1 and c5 are equal"); } 
			else{ System.out.println("c1 and c5 not equal"); }
		
		Map<String,Contact> h= new HashMap<String,Contact>();
		h.put("1",c1);
		h.put("2", c2);
		h.put("3", c3);
		h.put("1", c4);
		
		for(Map.Entry<String,Contact> e: h.entrySet()){
			String s = e.getKey();
			Contact n = e.getValue();
			System.out.println("Map id "+ n.getContactid() + " name "+ 
					n.contactname + " number " + n.contactnumber + " Key " + s);	
			
		}
	
		
		}
		
		
		
	}



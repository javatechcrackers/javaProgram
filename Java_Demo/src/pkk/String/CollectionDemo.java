package pkk.String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(100, "prashant");
	hm.put(101, "sandip");
	
	Set<Integer> set=hm.keySet();
/*	Iterator itr = set.iterator();
	while(itr.hasNext()){
		Map.Entry m=(Map.Entry)itr.next();
		
		System.out.println(m.getKey()+ " " + m.getValue());*/
		for(int i:set){
			System.out.println(i+"---"+hm.get(i));
	}
		for(Map.Entry<Integer, String> h: hm.entrySet()){
			System.out.println("key"+ h.getKey()+"\tvalue"+h.getValue());
		}
	}

}

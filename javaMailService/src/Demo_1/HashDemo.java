package Demo_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String,Object> h=new HashMap<String,Object>();
		h.put("pkk",5);
		h.put("pkk","raju");
		//h.put(null,"pkk");
		//h.put(null,"abc");
		
		Iterator set= h.entrySet().iterator();
		
		while(set.hasNext()){
			Map.Entry m = (Map.Entry)set.next();
			System.out.println("key - " + m.getKey() + "\nvalue - " + m.getValue());
		
		}
		
	}

}

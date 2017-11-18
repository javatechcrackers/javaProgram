package hashcode;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		Map<Employee, Integer> m = new HashMap<>();
		
		m.put(new Employee(101,"prashant"), 100);
		m.put(new Employee(102,"ravi"), 100);
		m.put(new Employee(101,"prashant"), 100);

		
		for(Map.Entry<Employee, Integer> e : m.entrySet()){
			
			System.out.println("Employee : " + e.getKey().getId() + " " + e.getKey().getName());
			System.out.println("Number : " + e.getValue());
			
		}
		
		
	}

}

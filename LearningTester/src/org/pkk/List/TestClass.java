package org.pkk.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestClass {

	/**
	 * Testing class - Prashant Katiyar 
	 */
	public static void main(String[] args) {
		Address add = new Address("Kannauj", 209726, "UP", "India");
		Address add1 = new Address("Pune", 411013, "MH", "India");
		Customer cus = new Customer("Prahant", "inautix", add);
		Customer cus1 = new Customer("Ravi", "igate", add1);
		List<Address> addList = new ArrayList<Address>();
		addList.add(0, add);
		addList.add(1, add1);
		
		List<Customer> customer = new ArrayList<Customer>();
		customer.add(cus);
		customer.add(cus1);
		
		System.out.println("=====Foreach=======");
		
		for(Address address : addList){
			System.out.println("City :: " + address.getCity()  + "\tCountry ::"  +
					address.country +
					"\tPin ::"  +
					address.zipCode +
					
				"\tState :: " + address.state	);
		}
		
		System.out.println("=====Foreach==Customer=====");
		
		for(Customer address : customer){
			System.out.println("Name ::" +
					address.getName() +
					"Company :: " + address.getCompany() + 
					"City :: " + address.add.city +
					"country ::" + address.add.country +
					"state ::" + address.add.state
					);
		}
		
		System.out.println("=====Iterator==Customer=====");
		Iterator<Customer> cust = customer.iterator();
		while(cust.hasNext()){
			System.out.println("City :: " + cust.next().add.city
			+ "State :: " + cust.next().add.state 
			//+ "Name :: " + cust.next().getName()
			);
		}
		
		for (int i = 0; i < customer.size(); i++) {
            System.out.println(customer.get(i).add.city);
        }
		
		System.out.println("Hashcode " + add.hashCode());
		System.out.println("Hashcode " + add1.hashCode());
		
		System.out.println("=====Iterator=======");
		Iterator<Address> address = addList.iterator();
		while(address.hasNext()){
			System.out.println("City :: " + address.next().city);
			/*while(address.hasNext()){
			System.out.println(	"\tPin ::"  + address.next().zipCode );
			System.out.println(	"\tState :: " + address.next().state);*/
		}
		while(address.hasNext()){
			System.out.println(	"\tPin ::"  + address.next().zipCode );
		}
	}

}

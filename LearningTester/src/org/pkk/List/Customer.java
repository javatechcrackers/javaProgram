package org.pkk.List;

public class Customer {

	public Customer(String name, String company, Address add) {
		super();
		this.name = name;
		this.company = company;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	String name;
	String company;
	
	Address add;
	
	
}

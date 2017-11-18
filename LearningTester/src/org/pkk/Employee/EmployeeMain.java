package org.pkk.Employee;

public class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101, "Pkk", 123456);
		Employee e2 = new Employee(101, "Pkk", 123456);
		Employee e3 = new Employee(102, "Pkk", 123456);
		Employee e4 = new Employee(103, "Pkk", 123456);
		
		System.out.println(e1.equals(e2) + " " + e1.hashCode() + " " + e2.hashCode());
		
		System.out.println(e2.equals(e3) + " " + e2.hashCode() + " " + e3.hashCode());
		System.out.println(e3.equals(e4) + " " + e3.hashCode() + " " + e4.hashCode());
	}

}

	package com.javacodegeeks.snippets.core;

public class DeepCopy {

	public static void main(String[] args) {

		// Original Object
		//Class.forName(com.javacodegeeks.snippets.core.Person1);
		Person1 p = new Person1("Person1-A", "Civic");
		System.out.println("Original (orginal values): " + p.getName() + " - "
				+ p.getCar1().getName());
		// Clone as a shallow copy
		Person1 q = (Person1) p.clone();
		System.out.println("Clone (before change): " + q.getName() + " - "
				+ q.getCar1().getName());
		// change the primitive member
		q.setName("Person1-B");
		// change the lower-level object
		q.getCar1().setName("Accord");
		System.out.println("Clone (after change): " + q.getName() + " - "
				+ q.getCar1().getName());
		System.out.println("Original (after clone is modified): " + p.getName()
				+ " - " + p.getCar1().getName());

	}
}

class Person1 implements Cloneable {
	// Lower-level object
	private Car1 Car1;
	private String name;

	public Car1 getCar1() {
		return Car1;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public Person1(String s, String t) {
		name = s;
		Car1 = new Car1(t);
	}

	@Override
	public Object clone() {
		// Deep copy
		Person1 p = new Person1(name, Car1.getName());
		return p;
	}
}

class Car1 {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}

	public Car1(String s) {
		name = s;
	}
}
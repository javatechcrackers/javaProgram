package org.pkk.CreationalPatterns.PROTOTYPEPATTERN;

public class Square extends Shape {
	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
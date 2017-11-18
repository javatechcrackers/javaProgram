package org.pkk.CreationalPatterns.BUILDERPATTERN;

public abstract class ColdDrink implements Item {
	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();
}
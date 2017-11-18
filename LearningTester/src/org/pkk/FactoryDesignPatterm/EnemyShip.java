package org.pkk.FactoryDesignPatterm;

public abstract class EnemyShip {

	private String name;
	private double amtdamage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmtdamage() {
		return amtdamage;
	}
	public void setAmtdamage(double amtdamage) {
		this.amtdamage = amtdamage;
	}
	
	public void fellowHeroShip(){
		System.out.println(getName() + " is following the hero");
	}
	
	public void displayEnemyShip(){
		System.out.println(getName() + " is on the screen");
	}
	public void enemyShipShoot(){
		System.out.println(getName() + " attacks and does " + getAmtdamage());
	}
	
}

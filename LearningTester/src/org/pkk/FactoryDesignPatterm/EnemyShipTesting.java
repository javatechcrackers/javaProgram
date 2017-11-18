package org.pkk.FactoryDesignPatterm;

public class EnemyShipTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnemyShip ship = new UFOEnemyShip();
		
		dostuff(ship);
		
		
	}

	private static void dostuff(EnemyShip ship) {
		// TODO Auto-generated method stub
		ship.displayEnemyShip();
		ship.fellowHeroShip();
		ship.enemyShipShoot();
		
		
		
	}

}

package pkk.ploymorphism;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car=new Car();
		Bike bike = new Bike();
		bike.vehicleDetails(2, "red");
		car.vehicleDetails(4, "white");
		Vehicle vehicle=new Car();
		vehicle.vehicleDetails(4,"white");
		Vehicle v=new Bike();
		
		System.out.println(v.a);
		
	}

}

package pkk.ploymorphism;

public class Car implements Vehicle {
	int tyre=0;
	  String color=null;
	@Override
	public void vehicleDetails(int tyre, String color) {
		this.tyre=tyre;
		this.color= color;
		System.out.println(tyre + " " + color);
		
	}

}

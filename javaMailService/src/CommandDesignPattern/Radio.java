package CommandDesignPattern;

public class Radio implements ElectronicDevice{

	
private int volume=0;
	
	public void on() {
		System.out.println("Radio is on");

	}

	public void off() {
		System.out.println("Radio is off");

	}

	public void volumeup() {
		volume++;
		System.out.println("Radio volume is up" + volume);

	}

	public void volumedown() {
		volume--;
		System.out.println("Radio volume is down" + volume);

	}

}

package CommandDesignPattern;


public class Television implements ElectronicDevice {

	private int volume=0;
	
	public void on() {
		System.out.println("TV is on");

	}

	public void off() {
		System.out.println("TV is off");

	}

	public void volumeup() {
		volume++;
		System.out.println("TV volume is now\t" + volume);

	}

	public void volumedown() {
		volume--;
		System.out.println("TV volume is now\t" + volume);

	}

}

package org.pkk.CommandDesignPattern;


public class TurnTVDown implements Command {

	
	ElectronicDevice device;
	public TurnTVDown(ElectronicDevice device) {
		this.device=device;
		
	}

	public void execute() {
		device.volumedown();

	}

}

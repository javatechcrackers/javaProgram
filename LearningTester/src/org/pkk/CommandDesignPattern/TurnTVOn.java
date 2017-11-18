package org.pkk.CommandDesignPattern;


public class TurnTVOn implements Command {

	ElectronicDevice device;
	
	
	
	public TurnTVOn(ElectronicDevice device) {
		
		this.device = device;
	}



	public void execute() {
		
		device.on();
		
	}

}

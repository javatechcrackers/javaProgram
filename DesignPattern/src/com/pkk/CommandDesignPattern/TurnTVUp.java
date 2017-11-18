package com.pkk.CommandDesignPattern;


public class TurnTVUp implements Command {

	
	ElectronicDevice device;
	
	
	
	public TurnTVUp(ElectronicDevice device) {
		
		this.device = device;
	}
	
	public void execute() {
		device.volumeup();

	}

}

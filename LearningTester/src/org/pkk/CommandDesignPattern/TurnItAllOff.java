package org.pkk.CommandDesignPattern;

import java.util.List;

public class TurnItAllOff implements Command {

	List<ElectronicDevice> theDevice;
	
	
	
	public TurnItAllOff(List<ElectronicDevice> theDevice) {
		super();
		this.theDevice = theDevice;
	}



	public void execute() {
		// TODO Auto-generated method stub
		
		for(ElectronicDevice device: theDevice){
			
			device.off();
		}
	}

}

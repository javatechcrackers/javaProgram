	package com.pkk.CommandDesignPattern;
	
	
	public class TurnTVOff implements Command{
	
		ElectronicDevice device;
		
		
		
		public TurnTVOff(ElectronicDevice device) {
			
			this.device = device;
		}
	
	
	
		public void execute() {
			
			device.off();
			
		}
		
	}

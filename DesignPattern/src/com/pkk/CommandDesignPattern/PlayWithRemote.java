package com.pkk.CommandDesignPattern;

import java.util.ArrayList;
import java.util.List;


public class PlayWithRemote {

	public static void main(String s[]){
		
		ElectronicDevice device = TVRemote.getDevice();		
		
		TurnTVOn oncommand = new TurnTVOn(device);		
		DeviceButton onpress = new DeviceButton(oncommand);		
		onpress.press();
		
		
		TurnTVOff offcommand = new TurnTVOff(device);
		DeviceButton offpress = new DeviceButton(offcommand);
		offpress.press();
		
		
		TurnTVUp upcommand = new TurnTVUp(device);
		DeviceButton uppress = new DeviceButton(upcommand);
		uppress.press();
		uppress.press();
		uppress.press();
		
		
		List<ElectronicDevice> thetotaldevice = new ArrayList<ElectronicDevice>();
		thetotaldevice.add(new Television());
		thetotaldevice.add(new Radio());
		
		
		TurnItAllOff turnoffdevices = new TurnItAllOff(thetotaldevice);
		DeviceButton turnthemoff = new DeviceButton(turnoffdevices);
		turnthemoff.press();
		
		
	}
	
}

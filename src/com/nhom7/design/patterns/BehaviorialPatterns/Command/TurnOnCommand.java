package com.nhom7.design.patterns.BehaviorialPatterns.Command;

public class TurnOnCommand implements Command {

	TV theDevice;
	
	public TurnOnCommand(TV newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.on();
		
	}

	public void undo() {
		
		theDevice.off();
		
	}
	
}

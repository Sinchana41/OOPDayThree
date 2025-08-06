package com.oops.daythree.parkinglotsystem;

public class Bike extends Vehicle {
	
	public Bike(String numberPlate) {
		super(numberPlate, "Bike");
	}

	@Override
	public int getCharge() {
		return 20;
	}

}

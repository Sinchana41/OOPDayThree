package com.oops.daythree.parkinglotsystem;

public class Truck extends Vehicle {

	public Truck(String numberPlate) {
		super(numberPlate, "Truck");
	}

	@Override
	public int getCharge() {
		return 100;
	}
}

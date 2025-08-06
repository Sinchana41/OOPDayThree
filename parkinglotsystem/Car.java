package com.oops.daythree.parkinglotsystem;

public class Car extends Vehicle {

	public Car(String numberPlate) {
		super(numberPlate, "Car");
	}

	@Override
	public int getCharge() {
		return 50;
	}

}

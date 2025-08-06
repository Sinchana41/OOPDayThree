package com.oops.daythree.parkinglotsystem;

public class ParkingSlot {
	private Vehicle vehicle;

	public boolean isOccupied() {
		return vehicle != null;
	}

	public void park(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Vehicle remove() {
		Vehicle temp = vehicle;
		vehicle = null;
		return temp;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
}

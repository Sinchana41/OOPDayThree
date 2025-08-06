package com.oops.daythree.parkinglotsystem;

public class ParkingLot {

	private ParkingSlot[] slots;
	private int totalRevenue;

	public ParkingLot(int size) {
		slots=new ParkingSlot[size];
		for (int i = 0; i < slots.length; i++) {
			slots[i] = new ParkingSlot();
		}
		totalRevenue=0;
	}

	public boolean parkVehicle(Vehicle vehicle) {
		for (int i = 0; i < slots.length; i++) {
			if(!slots[i].isOccupied()) {
				slots[i].park(vehicle);
				totalRevenue=totalRevenue+vehicle.getCharge();
				System.out.println(vehicle.getType()+" parked at a slot "+ i);
				return true;
			}
		}
		System.out.println("No available slot");
		return false;
	}

	public boolean removeVehicle(String numberPlate) {
		for (int i = 0; i < slots.length; i++) {
			Vehicle v = slots[i].getVehicle();
			if (v != null && v.getNumberPlate().equals(numberPlate)) {
				slots[i].remove();
				System.out.println("Vehicle " + numberPlate + " removed from slot " + i);
				return true;
			}
		}
		System.out.println("Vehicle not found");
		return false;
	}

	public void showParkedVehicles() {
		System.out.println("Parked Vehicles:");
		for (int i = 0; i < slots.length; i++) {
			Vehicle v = slots[i].getVehicle();
			if (v != null) {
				System.out.println("Slot " + i + ": " + v.getType() + " - " + v.getNumberPlate());
			}
		}
	}

	public int getTotalRevenue() {
		return totalRevenue;
	}

}

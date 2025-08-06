package com.oops.daythree.parkinglotsystem;

public class Main {

	public static void main(String[] args) {
		ParkingLot lot = new ParkingLot(5); 

		lot.parkVehicle(new Car("KA011234"));
		lot.parkVehicle(new Bike("KA025678"));
		lot.parkVehicle(new Truck("KA039999"));

		lot.showParkedVehicles();

		lot.removeVehicle("KA025678");
		lot.showParkedVehicles();

		System.out.println("Total Revenue: ₹" + lot.getTotalRevenue());
	}

}

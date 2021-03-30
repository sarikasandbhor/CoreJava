package com.practice.parent;

public class Vehicle {
	public String engine1;
	public String wheels1;
	public String fuelTank1;
	public String lights1;
	public String seats1;
	
	private String engine;
	private String wheels;
	private String fuelTank;
	private String lights;
	private String seats;
	
	
	public Vehicle() {									//default constructor
		this.engine = "Petrol";
		this.wheels = "Two";
		this.fuelTank = "Full";
		this.lights = "On";
		this.seats = "Comfy";
	}
	
	public Vehicle(String engine, String wheels, String fuelTank, String lights, String seats) {
		this.engine = engine;
		this.wheels = wheels;
		this.fuelTank = fuelTank;
		this.lights = lights;
		this.seats = seats;
	}

	public String getEngine() {
		return engine;
	}
	public String getWheels() {
		return wheels;
	}
	public String getFuelTank() {
		return fuelTank;
	}
	public String getLights() {
		return lights;
	}
	public String getSeats() {
		return seats;
	}
	
	public void run() {
		System.out.println("Vehicle is Running");
	}
}

package com.practice.vehicles;

import com.practice.parent.Vehicle;

public class Bike extends Vehicle{
	public String handle1;
	
	private String handle;

	
	public Bike() {								//default constructor
		super();
		this.handle = "short";
	}
	
	public Bike(String handle) {				//parameterize constructor
		super();
		this.handle = handle;
	}

	public Bike(String handle,String engine, String wheels, String fuelTank, String lights, String seats) {				//call parameterize constructor of parent class
		super(engine,wheels,fuelTank,lights,seats);
		this.handle = handle;
	}
	
	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + ", getSeats()=" + getSeats()
				+ "]";
	}
	
	public void run() {
		System.out.println("Bike is Running");
		System.out.println(toString());
	}
}

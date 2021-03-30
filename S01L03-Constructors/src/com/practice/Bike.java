package com.practice;

public class Bike {
	public String brand;					//public property can be accessible in different class without getters setters
	private String headLights;				//for private properties getters and setters are must
	private String tier;
	private int speed;
	
	public Bike()							//default constructor where we can initialize default value for properties
	{
		brand = "Royal Enfield";
		headLights = "2";
		tier = "2";
		speed = 70;
	}
	
	public Bike(String brand, String headLights, String tier, int speed) {			//constructor using fields, also its possible to overload a constructor
		this.brand = brand;
		this.headLights = headLights;
		this.tier = tier;
		this.speed = speed;
	}


	public String getHeadLights() {
		return headLights;
	}
	public void setHeadLights(String headLights) {
		this.headLights = headLights;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {				//Added running functionality to Bike class
		if(tier.equals("2") && speed>0)
			return "Bike is running";
		else
			return "Bike is stopped";
	}
	
}

package com.practice;

public class Bike {
	public String brand;					//public property can be accessible in different class without getters setters
	private String headLights;				//for private properties getters and setters are must
	private String tier;
	private int speed;
	
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
		if(speed>0)
			return "Bike is running";
		else
			return "Bike is stopped";
	}
	
}

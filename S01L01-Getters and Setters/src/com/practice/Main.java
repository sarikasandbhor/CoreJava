package com.practice;

public class Main {

	public static void main(String[] args) {
		Bike bike = new Bike();						//Bike is a class and we are creating object of that,thats mean Bike is nothing but Custom Datatype
		bike.brand = "Yamaha";
		System.out.println("Brand of Bike :"+bike.brand);
		
		bike.setSpeed(80);										  //Using setters we can access private properties of other class
		System.out.println("Speed of Bike :"+bike.getSpeed());    //Using getters we can access private properties of other class

		bike.setTier("2");
		System.out.println("Tiers of Bike :"+bike.getTier());
		
		bike.setHeadLights("4");
		System.out.println("Tiers of Bike :"+bike.getHeadLights());
	}

}

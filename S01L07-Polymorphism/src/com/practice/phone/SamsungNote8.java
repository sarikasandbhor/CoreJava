package com.practice.phone;

public class SamsungNote8 extends Phone{
	public String model;

	public SamsungNote8(String model) {
		super(model);
		this.model = model;
	}
	
	public void features() {
		System.out.println("Android Flagship");
	}
	
}

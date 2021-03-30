package com.practice.defaultConst;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();				//java uses default constructor if there is no constructor created in class
		System.out.println(car.getBrand());
	}
}

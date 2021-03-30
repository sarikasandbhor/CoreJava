package com.practice;

import com.practice.vehicles.Bike;
import com.practice.vehicles.Car;
import com.practice.vehicles.Truck;

public class Main {

	public static void main(String[] args) {
		/**Topic1 - To access public properties we can directly use without getters and setters*/
		System.out.println("************To access public properties**************");
		Car car1 = new Car();
		car1.engine1 = "Petrol";
		Bike bike1 = new Bike();
		bike1.fuelTank1 = "Full";
		Truck truck1 = new Truck();
		truck1.seats1 = "Good";
		System.out.println("Car engine: "+car1.engine1+", "+"Bike Fuel Tank: "+bike1.fuelTank1
				+", "+"Truck seats: "+truck1.seats1);
		System.out.println();
		
		
		/**Topic2 - To access private properties we need getters methods and to initialize its values we need constructor */
		System.out.println("************To access private properties**************");
		Bike bike = new Bike();
		System.out.println("Bike Engine :"+bike.getEngine());
		System.out.println("Bike Seats :"+bike.getSeats());
		System.out.println();
		
		/**Topic3 - To call parameterize constructor of parent class*/
		System.out.println("************To call parameterized constructor of parent class**************");
		Bike bike2 = new Bike("long", "diesel", "4", "half", "4", "5");
		System.out.println("Bike Engine :"+bike2.getEngine());
		System.out.println("Bike Wheels :"+bike2.getWheels());
		System.out.println("Bike FuelTank :"+bike2.getFuelTank());
		System.out.println("Bike Lights :"+bike2.getLights());
		System.out.println("Bike Seats :"+bike2.getSeats());
		System.out.println();
		
		/**Topic4 - To call toString() to get rid of above multiple statements to be write for printing stmts*
		 * If no toString() method defined then default method gets called and return some garbage value*/
		System.out.println("************To call toString() method**************");
		System.out.println(bike2.toString());
		System.out.println();
		
		/**Topic5 - To override methods / add functionality in parent & child classes
		 * method ambiguity present in child and parent class and you created object 
		 * for child class then priority of method for child is more than the parent*/
		System.out.println("************To call overrided method**************");
		bike2.run();					//Priority of child's run() method is high
	}

}

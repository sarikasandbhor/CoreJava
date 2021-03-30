package com.practice;

import com.practice.phone.Nokia3310;
import com.practice.phone.Phone;
import com.practice.phone.SamsungNote8;

public class Main {

	public static void main(String[] args) {
		/**Topic1*/
		Phone note8 = new SamsungNote8("Note 8");			//Upcasting
		System.out.println(note8.getModel());
		note8.features();
		
		Phone nokia3310 = new Nokia3310("Nokia 3310");		//Upcasting
		System.out.println(nokia3310.getModel());
		nokia3310.features(); //There is no features method added in nokia3310 class but java will not throw any error it will directly use method from parent class

		/**Topic2*/
		Phone note4 = new Main().phone(1);					// Created object of Main class and accessing method which returning Phone Object
		note4.features();
		Phone nokia3300 = new Main().phone(2);
		nokia3300.features();
	}
	
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1 : return new Nokia3310("Nokia 3300");
		case 2 : return new SamsungNote8("Note 4");
		}
		return null;
	}

}

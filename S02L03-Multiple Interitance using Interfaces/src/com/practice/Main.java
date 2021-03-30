package com.practice;


import com.practice.person.Person;
import com.practice.person.Vegan;

public class Main {

	public static void main(String[] args) {
		/**IsAlive,LiveLife are two interfaces whose properties we are using inside Person class
		 * Which is nothing but multiple inheritance*/
		Person person = new Vegan();
		person.eats();
		person.speak();
		person.breath();
		person.message();
	}
}

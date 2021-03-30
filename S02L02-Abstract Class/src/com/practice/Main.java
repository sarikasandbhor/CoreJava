package com.practice;

import com.practice.person.NonVegan;
import com.practice.person.Person;
import com.practice.person.Vegan;

public class Main {

	public static void main(String[] args) {
		Person person = new Vegan();
		person.eats();
		person.speak();
		Person person1 = new NonVegan();
		person1.eats();
		person1.speak();
	}

}

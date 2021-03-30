package com.practice;

public class Main {

	public static void main(String[] args) {
		Person sara = new Person();
		System.out.println(sara);
		
		Person john = new Person("John",26,"Kolkata");
		System.out.println(john);
		
		john.setAge(-30);							//Setters for age only we have created so only age can be modified and it wont give any compile time error and do not override negative value
		System.out.println(john);
	}

}

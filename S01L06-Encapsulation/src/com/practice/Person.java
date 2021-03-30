package com.practice;

public class Person {
	private String name;
	private int age;
	private String address;
	
	
	public Person() {
		this.name = "Sara";
		this.age = 25;
		this.address = "Mumbai";
	}
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public boolean setAge(int age) {
		if(age>0 && age<100) {
			this.age = age;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
}

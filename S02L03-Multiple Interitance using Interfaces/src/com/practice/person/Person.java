package com.practice.person;

public abstract class Person implements IsAlive,LiveLife {
	public void speak() {
		System.out.println("Person can share his/her thoughts");
	}
	public abstract void eats();
	
	@Override
	public void breath() {
		System.out.println("Breathing");
	}
	
	@Override
	public void message() {
		System.out.println("Live a life");
	}
}

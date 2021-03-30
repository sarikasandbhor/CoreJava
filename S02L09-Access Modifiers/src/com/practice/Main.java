package com.practice;

import com.practice.a.A;


public class Main {

	public static void main(String[] args) {
		
		A a= new A();
		a.showInfo();						//PrivateA variable is not accessible outside class
		System.out.println(a.publicA);		//Public variable accessible everywhere
		C c = new C();
		System.out.println(c.defaultC);		//Default variable accessible inside package only 

	}

}

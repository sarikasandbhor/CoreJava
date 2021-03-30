package com.practice;

public class UserDefinedException extends Throwable {

	public UserDefinedException(int x) {
		super();
		System.out.println("Value of X can not be "+x);
	}
		
}

package com.practice;

import com.practice.staticClass.TestStatic;

public class Main {

	public static void main(String[] args) {
		/**Static Variable -- initialized only once at the start of the execution */
		System.out.println("Current static variable value: "+TestStatic.testStatic);
		TestStatic.setTestStatic(5);
		System.out.println("Current changing static variable value: "+TestStatic.testStatic);
		TestStatic.setTestStatic(10);
		System.out.println("Current changing static variable value: "+TestStatic.testStatic);

	}

}

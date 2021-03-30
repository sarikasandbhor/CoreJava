package com.practice.staticInnerClass;

public class Outer {			//Outer class can not be static
	
	
	public static int outerVar = 20;
	public static void testOuter() {
		System.out.println("Test Outer");
		Inner.testInner2();				//accessing inner class method
	}
	
	public static class Inner			//Static Inner Class
	{				
		public static int innerVar = 0;
		public static void testInner() {
			System.out.println("Test Inner");
			System.out.println("Outer class variable :"+outerVar);
			testOuter();				//accessing outer class method
		}
		
		public static void testInner2() {
			System.out.println("Accessing Inner class method in Inner class");
		}
	}
}

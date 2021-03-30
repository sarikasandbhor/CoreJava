package com.practice.string;

public class Main {

	public static void main(String[] args) {
		String str1 = "Hello";						//Reference is same bcz java smartly check in heap whether it is present or not if present then point to its reference
		String str2 = "World";
		if(str1.equals(str2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		String str3 = str1.concat(str2);
		String str4 = "Hello";						//Reference is same
		System.out.println("String 3 :"+str3);
		
		if(str1 == str4)
			System.out.println("Strings are equal");
	
		String str5 = new String("Hello");
		String str6 = new String("Hello");
		if(str5 == str6)
			System.out.println("Strings are equal(==)");
		else
			System.out.println("Strings are not equal(==)");
		
		//Instead use .equals method which will check its value not reference
		if(str5.equals(str6))
			System.out.println("Strings are equal(.equals)");
		else
			System.out.println("Strings are not equal(.equals)");

	}

}

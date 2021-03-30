package com.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter Name:");
		Scanner sc = new Scanner(System.in);			//User Input
		String name = sc.nextLine();
		sc.close();										//Closing to prevent leak of variable
		System.out.println("Name of User :"+name);

	}

}

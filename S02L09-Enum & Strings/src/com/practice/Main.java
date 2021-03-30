package com.practice;

public class Main {

	public static void main(String[] args) {
		Learning learn = Learning.COLLECTIONS;
		switch (learn) {
		case COREJAVA: System.out.println("Core Java");
					   break;
		case COLLECTIONS: System.out.println("Collections");
		   				break;
		case JSPSERVLETS: System.out.println("JSP & Servletes");
		   				break;
		case HIBERNATE: System.out.println("Hibernate");
						break;
		case MULTITHREADING: System.out.println("Multithreading");
						break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + learn);
		}

	}

}

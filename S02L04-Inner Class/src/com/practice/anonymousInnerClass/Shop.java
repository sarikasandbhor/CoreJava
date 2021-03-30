package com.practice.anonymousInnerClass;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		System.out.println(door.lock.isUnlocked("test"));
		
		door.lock.test();

	}

}

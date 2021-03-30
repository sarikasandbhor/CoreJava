package com.practice.memberInnerClass;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		door.shopStatus();
		
		door.lock.setLock(false);				//Access door's inner class lock's methods
		door.shopStatus();

	}

}

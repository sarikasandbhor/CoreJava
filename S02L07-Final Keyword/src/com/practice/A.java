package com.practice;

public class A {				//if we make class A as final then inheritance is not applicable
	public void india() {
		System.out.println("India");
	}
	
	public final void usa() {				//can not override this method
		System.out.println("USA");
	}
	
}

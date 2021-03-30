package com.practice;

import com.practice.phone.Iphone;
import com.practice.phone.OnePlus8;
import com.practice.phone.Phone;

public class Main {

	public static void main(String[] args) {
		Phone onePlus8 = new OnePlus8();
		System.out.println("OnePlus8 processor"+onePlus8.processor());
		System.out.println("OnePlus8 OS"+onePlus8.os());
		System.out.println("OnePlus8 space in GB"+onePlus8.spaceInGB());
		
		Phone iphone = new Iphone();
		System.out.println("Iphone processor"+iphone.processor());
		System.out.println("Iphone OS"+iphone.os());
		System.out.println("Iphone space in GB"+iphone.spaceInGB());
	}

}

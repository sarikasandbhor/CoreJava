package com.practice;

import com.practice.components.GraphicCard;
import com.practice.components.Processor;
import com.practice.laptop.Laptop;

public class Main {

	public static void main(String[] args) {
		/**Topic1 - Use of composition and printing object of laptop with inside object's properties*/
		System.out.println("************Print object of laptop**************");
		Laptop laptop = new Laptop();
		System.out.println(laptop);
		System.out.println();
		
		/**Topic2 - Access object inside an object*/
		System.out.println("************Access properties of object inside an object**************");
		System.out.println("Processor brand :"+laptop.getProcessor().getBrand());
		System.out.println("Processor cache memory :"+laptop.getProcessor().getCacheMemory());
		System.out.println("Processor generation :"+laptop.getProcessor().getGeneration());
		System.out.println("Processor series :"+laptop.getProcessor().getSeries());
		System.out.println();
		
		/**Topic3 - Adding functionality*/
		System.out.println("************Adding functionality**************");
		Laptop laptop1 = new Laptop("4 GB", "25f", "500 GB", "700", "Intel", new Processor("Intel2", 2000, "7th Generation", "4 GB","20 Ghz","10 Ghz"), new GraphicCard("Nvidia2", 1000, "2 GB"));
		System.out.println(laptop1);
		laptop1.gamingMode();
		System.out.println(laptop1.getProcessor().getFrequency());			//Use functionality

	}

}

package com.practice.laptop;

import com.practice.components.GraphicCard;
import com.practice.components.Processor;

public class Laptop {
	private String ram;
	private String screen;
	private String hardDrive;
	private String opticalDrive;
	private String keyboard;
	private Processor processor;
	private GraphicCard graphicCard;
	
	public Laptop() {
		this.ram = "16 GB";
		this.screen = "720 rpm";
		this.hardDrive = "1 TB";
		this.opticalDrive = "500 GB";
		this.keyboard = "iBall";
		this.processor = new Processor();			//Create an anonymous object
		this.graphicCard = new GraphicCard();		//Create an ananomous object
		
	}

	public Laptop(String ram, String screen, String hardDrive, String opticalDrive, String keyboard,
			Processor processor, GraphicCard graphicCard) {
		this.ram = ram;
		this.screen = screen;
		this.hardDrive = hardDrive;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
		this.processor = processor;
		this.graphicCard = graphicCard;
	}

	public Laptop(String string, String string2, String string3, String string4, String string5, Processor processor2,
			GraphicCard graphicCard2, String string6) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", screen=" + screen + ", hardDrive=" + hardDrive + ", opticalDrive="
				+ opticalDrive + ", keyboard=" + keyboard + ", processor=" + processor + ", graphicCard=" + graphicCard
				+"]";
	}

	public Processor getProcessor() {
		return processor;
	}
	
	public String gamingMode() {
		System.out.println(processor.getMaxFrequency());
		processor.setFrequency(processor.getMaxFrequency());
		return "Success";
	}
}

package com.practice.components;

public class Processor {
	private String brand;
	private int series;
	private String generation;
	private String cacheMemory;
	private String frequency;
	private String maxFrequency;
	
	public Processor() {
		this.brand = "Intel";
		this.series = 860;
		this.generation = "10th Generation";
		this.cacheMemory = "8 GB";
		this.frequency = "10 GHz";
		this.maxFrequency = "90 Ghz";
	}

	public Processor(String brand, int series, String generation, String cacheMemory,String frequency,String maxFrequency) {
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.maxFrequency = maxFrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cacheMemory="
				+ cacheMemory + "frequency=" + frequency + "]";
	}

	public String getBrand() {
		return brand;
	}

	public int getSeries() {
		return series;
	}

	public String getGeneration() {
		return generation;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}
	
	public String getFrequency() {
		return frequency;
	}

	public String getMaxFrequency() {
		return maxFrequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
}


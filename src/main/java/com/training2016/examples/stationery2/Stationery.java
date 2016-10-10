package com.training2016.examples.stationery2;

/**
 * Super class for stationery 
 * @author alex
 *
 */
public abstract class Stationery {
	private String name;
	private double value;
	

	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}

	public Stationery(String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "\n" + this.getClass().getSimpleName() + ": " + name + ", value=" + value;
	}
	
	
}

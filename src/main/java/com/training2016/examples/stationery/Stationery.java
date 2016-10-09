package com.training2016.examples.stationery;

/**
 * Super class for stationery 
 * @author alex
 *
 */
public abstract class Stationery {
	private String name;
	private double value;
	private int count;
	

	public Stationery(String name, int count, double value) {
		this.name = name;
		this.value = value;
		this.count = count;
	}
	
	public double calculate() {
		return count*value;
	}

	@Override
	public String toString() {
		return "\n" + name + ", value=" + value + ", count=" + count;
	}
	
	
}

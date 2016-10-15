package com.training2016.examples.stationery2;

/**
 * Employees class 
 * @author alex
 *
 */
public class Employee {
	private String name;
	private ListOfStationery stationery;
	
	public Employee(String name) {
		this.name = name;
	}

	public ListOfStationery getStationery() {
		return stationery;
	}

	public void setStationery(ListOfStationery stationery) {
		this.stationery = stationery;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", list=" + stationery + "]";
	}
	
}

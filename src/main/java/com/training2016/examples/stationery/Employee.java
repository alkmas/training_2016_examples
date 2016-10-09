package com.training2016.examples.stationery;

import java.util.ArrayList;

/**
 * Employees class 
 * @author alex
 *
 */
public class Employee {
	private String name;
	private ArrayList<Stationery> list;
	
	public Employee(String name) {
		this.name = name;
		this.list = new ArrayList<Stationery>();
	}
	
	public void addStationery(Stationery item) {
		list.add(item);
	}
	
	public double calculate() {
		double summ = 0;
		for(Stationery item: list) {
			summ += item.calculate();
		}
		return summ;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", list=" + list + "]";
	}
	
}

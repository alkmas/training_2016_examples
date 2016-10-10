package com.training2016.examples.stationery2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListOfStationery {
	private ArrayList<Stationery> list;

	public ListOfStationery() {
		this.list = new ArrayList<Stationery>();
	}

	public void add(Stationery item) {
		list.add(item);
	}

	public void sort(Comparator<Stationery> comparator) {
		Collections.sort(list, comparator);
	}
	
	public double calculate() {
		double summ = 0;
		for(Stationery item: list) {
			summ += item.getValue();
		}
		return summ;
	}

	@Override
	public String toString() {
		return "SetOfStationery [list=" + list + "]";
	}

	
}

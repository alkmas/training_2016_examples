package com.training2016.examples.stationery2;

import java.util.Comparator;

public class SortedByName<T extends Stationery> implements Comparator<T> {

	public int compare(T o1, T o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

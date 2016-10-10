package com.training2016.examples.stationery2;

import java.util.Comparator;

public class SortedByValue<T extends Stationery> implements Comparator<T>{

	public int compare(T o1, T o2) {
		if (o1.getValue() > o2.getValue()) {
			return 1;
		} else if (o1.getValue()< o2.getValue()) {
			return -1;
		} else {
			return 0;
		}
	}
}

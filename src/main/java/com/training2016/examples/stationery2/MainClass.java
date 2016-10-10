package com.training2016.examples.stationery2;

import java.util.Comparator;

/**
 * ”чет канцел€рских товаров дл€ сотрудников
 * @author alex
 *
 */
public class MainClass {

	public static void main(String[] args) {
		ListOfStationery listBeginner = new ListOfStationery();
		listBeginner.add(new Clippers("Forpus", 5.00));
		listBeginner.add(new Clippers("Index", 4.90));
		listBeginner.add(new Eraser("Mirkline", 1.00));
		listBeginner.add(new Eraser("Colorful", 1.10));
		listBeginner.add(new Notebook("Notebook 12p", 1.50));
		listBeginner.add(new Notebook("Notebook 24p", 2.50));
		listBeginner.add(new Pen("LinkGliss", 1.50));
		listBeginner.add(new Pencil("Koh-I-Noor 1500", 0.50));
		listBeginner.add(new Pencil("Koh-I-Noor 1703", 0.70));
		listBeginner.add(new Stapler("StaplerX", 4.90));

		Employee beginner = new Employee("Boris");
		beginner.setStationery(listBeginner);
		System.out.println(beginner);
		
		System.out.println("Sorted By Name");
		listBeginner.sort(new SortedByName<Stationery>());
		System.out.println(beginner);

		System.out.println("Sorted By Value");
		listBeginner.sort(new SortedByValue<Stationery>());
		System.out.println(beginner);

		System.out.println("Sorted By Value and Name");
		listBeginner.sort(new Comparator<Stationery>() {
			
			public int compare(Stationery o1, Stationery o2) {
				int sortByValue = new SortedByValue<Stationery>().compare(o1, o2);
				if (sortByValue == 0) {
					return new SortedByName<Stationery>().compare(o1, o2);
				}
				else {
					return sortByValue;
				}
			}
		});
		System.out.println(beginner);

	}

}

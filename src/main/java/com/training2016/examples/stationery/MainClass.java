package com.training2016.examples.stationery;


/**
 * Учет канцелярских товаров для сотрудников
 * @author alex
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee("Peter");
		emp.addStationery(new Clippers(5));
		emp.addStationery(new Eraser(1));
		emp.addStationery(new Notebook(3, 2.50));
		emp.addStationery(new Pen(2, 1.50));
		emp.addStationery(new Pencil(3, 0.50));
		emp.addStationery(new Stapler(5.30));

		System.out.println(emp);
		System.out.println("Полная стоимость канцтоваров: " + emp.calculate());
	}

}

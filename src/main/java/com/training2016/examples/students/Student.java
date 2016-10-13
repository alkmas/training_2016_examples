package com.training2016.examples.students;

import java.util.ArrayList;

/**
 * Класс Студента
 * @author alex
 *
 */
public class Student {
	private String name;
	private ArrayList<Estimate> estimates;

	public Student(String name) {
		this.name = name;
		estimates = new ArrayList<Estimate>();
	}

	public String getName() {
		return name;
	}

	/**
	 * Добавить в список оценку
	 * @param estimate
	 */
	public void addEstimate(Estimate estimate) {
		estimates.add(estimate);
	}
	
	/**
	 * Получить список оценок
	 * @return ArrayList<Estimate>
	 */
	public ArrayList<Estimate> getEstimates() {
		return estimates;
	}
	
	@Override
	public String toString() {
		return "\nStudent: " + name + ", estimates=" + estimates;
	}
}

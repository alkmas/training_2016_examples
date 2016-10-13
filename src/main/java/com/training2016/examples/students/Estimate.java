package com.training2016.examples.students;

import java.util.ArrayList;

public class Estimate {
	private Student student;
	private Number value;
	private Discipline discipline;
	
	/**
	 * Calculate average value for this list estimates
	 * @return
	 */
	public static Number getAvgEsimate(ArrayList<Estimate> estimates) {
		if (estimates.get(0).getValue() instanceof Integer) {
			int summ = 0;
			for(Estimate estimate: estimates) {
				summ += estimate.getValue().intValue();
			}
			return summ / estimates.size();
		} else {
			double summ = 0;
			for(Estimate estimate: estimates) {
				summ += estimate.getValue().doubleValue();
			}
			return summ / estimates.size();
		}
	}
	
	public Estimate(Student student, Discipline discipline, Number value) {
		this.student = student;
		this.discipline = discipline;
		if (discipline.isThisInt()) {
			this.value = value.intValue();
		} else {
			this.value = value.doubleValue();
		}
		
	}

	public Student getStudent() {
		return student;
	}

	public Number getValue() {
		return value;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	@Override
	public String toString() {
		return student.getName() + " discipline=" + discipline + " value=" + value;
	}
	
	
}
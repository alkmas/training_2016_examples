package com.training2016.examples.students;

import java.util.ArrayList;

/**
 * Класс Группа студентов
 * @author alex
 *
 */
public class Group {
	private int number;
	private ArrayList<Student> students;
	private ArrayList<Estimate> estimates;
	private Discipline discipline; 

	/**
	 * Конструктор
	 * @param number номер группы
	 * @param discipline изучаемая дисциплина
	 */
	public Group(int number, Discipline discipline) {
		this.number = number;
		this.discipline = discipline;
		estimates = new ArrayList<Estimate>();
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}

	public void addStudents(Student... students) {
		for(Student student: students) {
			this.addStudent(student);
		}
	}
	
	
	public ArrayList<Estimate> getEstimates() {
		return estimates;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addEstimateForStudent(Student student, Number value) {
		if (students.contains(student)) {
			estimates.add(new Estimate(student, discipline, value));
		}
	}
	
	/**
	 * Находим оценку по студенту
	 * @param student
	 * @return
	 */

	public Estimate getEstimateForStudent(Student student) {
		if (this.isStudent(student)) {
			for(Estimate estimate: estimates) {
				if (estimate.getStudent() == student) {
					return estimate;
				}
			}
		}
		return null;
	}
	
	public int getNumberGroup() {
		return number;
	}

	public boolean isStudent(Student student) {
		return students.contains(student);
	}
	
	@Override
	public String toString() {
		return "Group (" + discipline + ") [number=" + number + ", students=" + students + "]";
	}

	
}

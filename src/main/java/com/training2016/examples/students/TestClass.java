/*
 Разработайте приложение, позволяющее формировать группы студентов по разным дисциплинам. 
 Состав групп может быть разным. Каждая дисциплина в отдельности определяет, целыми или 
 вещественными будут оценки. Необходимо найти группы, в которые входит студент X, и сравнить его оценки. 
 Для огранизации перечня дисциплин можно использовать перечисление. 
 */

package com.training2016.examples.students;

import java.util.Random;

public class TestClass {

	public static void main(String[] args) {
		Group group1 = new Group(1, Discipline.databases);
		Group group2 = new Group(2, Discipline.discreteMath);
		Group group3 = new Group(3, Discipline.economy);
		Group group4 = new Group(4, Discipline.foreignLanguage);
		Group group5 = new Group(5, Discipline.history);
		Group group6 = new Group(6, Discipline.mathematics);
		Group group7 = new Group(7, Discipline.modeling);
		Group group8 = new Group(8, Discipline.physics);
		
		
		Student student1 = new Student("Vasia");
		Student student2 = new Student("Kolia");
		Student student3 = new Student("Dima");
		Student student4 = new Student("Sasha");
		Student student5 = new Student("Katia");
		Student student6 = new Student("Lena");
		Student student7 = new Student("Petia");
		Student student8 = new Student("Roma");
		Student student9 = new Student("Tolia");
		Student student10 = new Student("Sveta");
		Student student11 = new Student("Zhenia");
		Student student12 = new Student("Serezha");
		Student student13 = new Student("Volodia");
		Student student14 = new Student("Dasha");
		Student student15 = new Student("Ania");
		Student student16 = new Student("Denis");
		Student student17 = new Student("Igor");
		
		group1.addStudents(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10);
		group2.addStudents(student7, student8, student9, student10, student11, student12, student13, student14, student15, student16, student17);
		group3.addStudents(student1, student3, student5, student7, student9, student11, student13, student15, student17);
		group4.addStudents(student2, student4, student6, student8, student10, student12, student14, student16, student3, student5, student7 );
		group5.addStudents(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10);
		group6.addStudents(student7, student8, student9, student10, student11, student12, student13, student14, student15, student16, student17);
		group7.addStudents(student1, student3, student5, student7, student9, student11, student13, student15, student17);
		group8.addStudents(student2, student4, student6, student8, student10, student12, student14, student16, student3, student5, student7);
		

		Group[] groups = new Group[]{group1, group2,group3,group4,group5,group6,group7, group8};
		Student[] students = new Student[] {student1,student2,student3,student4,student5,student6,
				student7,student8,student9,student10,student11,student12,student13,student14,
				student15,student16,student17};
		Random rand = new Random();
		
		// Добавляем оценки случайным образом
		for(Group group: groups) {
			for(Student student: group.getStudents()) {
				group.addEstimateForStudent(student, rand.nextInt(10));
			}
		}
		
		
		for(Student student: students) {
			System.out.println("Student: " + student.getName());
			for(Group group: groups) {
				if (group.isStudent(student)) {
					System.out.println("Group Number: " + group.getNumberGroup() + 
						" student: " + group.getEstimateForStudent(student) + 
						" avg: " + Estimate.getAvgEsimate(group.getEstimates()));
					}
			}
		}
	}

}

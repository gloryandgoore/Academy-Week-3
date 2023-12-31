package com.bptn.course.week3.University;

import java.util.ArrayList;
import java.util.List;

class University {

	// property - get inspired by the UML diagram
	ArrayList<Student> students = new ArrayList<Student>();

	public void addStudent(Student s) {
		// add a student to the "university" arraylist
	}

	public Student getStudent(long studentId) {
		// get the first student in the university that has the studentId. (ideally,
		// this would be unique, so you can stop searching after finding the fist match)
	}

	public List<Student> searchStudent(String userNamePrefix) {
		// return all students that have usernames beginning with the prefix
	}

	public boolean deleteStudent(long studentId) {
		// return if a successful deletion happened
	}

}
